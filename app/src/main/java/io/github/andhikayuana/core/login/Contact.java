package io.github.andhikayuana.core.login;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuana <andhikayuana@gmail.com>
 * @since 6/5/17
 */

public class Contact {

    private String name;
    private String number;

    public Contact() {
    }

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public static List<Contact> generateData() {
        ArrayList<Contact> contactList = new ArrayList<>();

        contactList.add(new Contact("Jarjit", "089"));
        contactList.add(new Contact("Mail", "088"));
        contactList.add(new Contact("Ipin", "087"));
        contactList.add(new Contact("Upin", "086"));
        contactList.add(new Contact("Ros", "085"));
        contactList.add(new Contact("Atuk", "084"));
        contactList.add(new Contact("Soleh", "084"));
        contactList.add(new Contact("Woyo", "083"));
        contactList.add(new Contact("Hello", "082"));
        contactList.add(new Contact("World", "081"));
        contactList.add(new Contact("Hai", "080"));

        return contactList;
    }
}
