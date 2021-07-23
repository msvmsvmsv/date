package com.company.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class XmlExample {

    public static void main(String[] args) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        Document doc = null;
        Note note = new Note();
        try {
            builder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        File f = new File("note.xml");
        try {
            doc = builder.parse(f);
            System.out.println(doc);
            Element root = doc.getDocumentElement();
            System.out.println(root);
            System.out.println(root.getTagName());
            System.out.println();

            NodeList nList = root.getChildNodes();
            for (int i = 0; i < nList.getLength(); i++) {
                if (!nList.item(i).getNodeName().equals("#text")) {
                    System.out.println("Tag: " + nList.item(i).getNodeName() + " " + nList.item(i).getNodeValue() + " " + nList.item(i).getChildNodes().item(0).getNodeValue());
                    switch (nList.item(i).getNodeName()){
                        case "to":
                            note.setTo(nList.item(i).getChildNodes().item(0).getNodeValue());
                        case "from":
                            note.setFrom(nList.item(i).getChildNodes().item(0).getNodeValue());
                    }
                }
            }
            System.out.println();


            NamedNodeMap attributes = root.getAttributes();
            for (int i = 0; i < attributes.getLength(); i++) {
                if(attributes.item(i).getNodeName().equals("attr")){
                    note.setAttr(attributes.item(i).getNodeValue());
                }
                System.out.println("Attr: " + attributes.item(i).getNodeName() + " " + attributes.item(i).getNodeValue());
            }
        } catch (SAXException | IOException e) {
            e.printStackTrace();
        }

        System.out.println(note);

    }
}
