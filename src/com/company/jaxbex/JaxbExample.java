package com.company.jaxbex;

import com.company.json.Address;
import com.company.json.Person;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;


import java.io.File;
import java.util.Collections;

public class JaxbExample {

    public static void main(String[] args) throws JAXBException {
        Person person = new Person("a", "z", new Address("street", 52), Collections.singletonList("+3845359"));
        File file = new File("person.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Person.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxbMarshaller.marshal(person, file);


        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        Person tutorials = (Person) jaxbUnmarshaller.unmarshal(file);
    }

}
