package com.company;

import java.util.ArrayList;

public class Person{
    String personal_name;
    int personal_id;
    String user_password;

    Person(String name, String password){
        this.personal_name = name;
        this.user_password = password;
    }

    public String getName(){
        return this.personal_name;
    }

    public String getPassword(){
        return this.user_password;
    }

    public void displayPerson(String name, String password){
        System.out.println(name + " " + password);
    }

    public static void createPersonList(boolean bool, ArrayList<Person> persons){
        if (bool){
            Person person1 = new Person("bogdan", "123qwe");
            persons.add(person1);
            Person person2 = new Person("kate", "icecream");
            persons.add(person2);
            Person person3 = new Person("yan", "olovo");
            persons.add(person2);
        }
        else{
            System.out.println("Error, count isn't correct");
        }
    }
}
