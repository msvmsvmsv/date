package com.company.xml;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class StaxExample {
    public static void main(String[] args) {
        Note note = new Note();
        XMLInputFactory factory = XMLInputFactory.newFactory();
        String currentElement = null;
        try {
            XMLStreamReader reader = factory.createXMLStreamReader(new
                    FileInputStream("note.xml"));
            while (reader.hasNext()) {
                int res = reader.next();
                switch (res) {
                    case XMLStreamReader.START_ELEMENT: {
                        currentElement = reader.getName().toString();
                        if (reader.getName().toString().equals("note")) {
                            if (reader.getAttributeCount() > 0 && reader.getAttributeName(0).toString().equals("attr")) {
                                note.setAttr(reader.getAttributeValue(0));
                            }
                        }
                        break;
                    }
                    case XMLStreamConstants.CHARACTERS: {
                        if (currentElement != null)
                            switch (currentElement) {
                                case "to":
                                    note.setTo(reader.getText());
                                    currentElement = null;
                                    break;
                                case "from":
                                    note.setFrom(reader.getText());
                                    currentElement = null;
                                    break;

                            }
                    }

                }
            }
        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }

        System.out.println(note);

    }
}
