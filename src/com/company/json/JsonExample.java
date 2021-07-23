package com.company.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class JsonExample {

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);

        //write to file
        Person person = new Person("a", "z", new Address("street", 52), Collections.singletonList("+3845359"));
        File file = new File("person.json");
//        objectMapper.writeValue(file, person);
//
//        //read from file
//        byte[] jsonData = Files.readAllBytes(Paths.get("person.txt"));
//        System.out.println("JSON " + new String(jsonData));
//        Person person2 = objectMapper.readValue(jsonData, Person.class);
//        System.out.println("Person Object " + person2);

//        //output object to console as json
//        StringWriter stringPerson = new StringWriter();
//        objectMapper.writeValue(stringPerson, person2);
//        System.out.println("Person JSON is\n" + stringPerson);


        objectMapper.writeValue(file, List.of(person, person));

    }
}
