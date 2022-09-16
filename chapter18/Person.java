package chapter18;

import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Serializer;

import java.io.OutputStream;

public class Person {
    private String first, last, address, city, state;
    private int zipCode;
    public Person(String first, String last, String address,
                  String city, String state, int zipCode) {
        this.first = first;
        this.last = last;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
    // Produce an XML Element from this Person object:
    public Element getXML() {
        Element person = new Element("person");
        Element firstName = new Element("first");
        firstName.appendChild(first);
        Element lastName = new Element("last");
        lastName.appendChild(last);
        Element addr = new Element("address");
        addr.appendChild(address);
        Element cty = new Element("city");
        cty.appendChild(city);
        Element st = new Element("state");
        st.appendChild(state);
        Element zc = new Element("zipCode");
        zc.appendChild(Integer.toString(zipCode));
        person.appendChild(firstName);
        person.appendChild(lastName);
        person.appendChild(addr);
        person.appendChild(cty);
        person.appendChild(st);
        person.appendChild(zc);
        return person;
    }
    // Constructor to restore a Person from an XML Element:
    public Person(Element person) {
        first= person.getFirstChildElement("first").getValue();
        last = person.getFirstChildElement("last").getValue();
        address =
                person.getFirstChildElement("address").getValue();
        city = person.getFirstChildElement("city").getValue();
        state = person.getFirstChildElement("state").getValue();
        zipCode = Integer.valueOf(
                person.getFirstChildElement("zipCode").getValue());
    }
    public String toString() {
        return first + " " + last + " " + address + " " + city +
                " " + state + " " + zipCode;
    }
    // Make it human-readable:
    public static void
    format(OutputStream os, Document doc) throws Exception {
        Serializer serializer= new Serializer(os,"ISO-8859-1");
        serializer.setIndent(4);
        serializer.setMaxLength(60);
        serializer.write(doc);
        serializer.flush();
    }
}
