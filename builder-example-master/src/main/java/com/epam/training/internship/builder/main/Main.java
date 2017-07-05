package com.epam.training.internship.builder.main;

import com.epam.training.internship.builder.domain.Address;
import com.epam.training.internship.builder.domain.Company;
import com.epam.training.internship.builder.domain.PersonBuilderInterface;
import com.epam.training.internship.builder.domain.Person;

public class Main {
    public static void main(final String... args) {
        Person person = new Person();
        person.setFirstName("Bobby");
        person.setLastName("McBobby");
        person.setAge(22);
        person.setIdNumber(324434384738437L);

        Company company = new Company();
        company.setCeo(person);
        company.setName("Funk Ltd.");
        company.setLocation(new Address());

        PersonBuilderInterface builder = Person.builder();

        System.out.println(builder.setFirstName("Bobby2").setLastName("McCree").setAge(22).setIdNumber(324434384738437L).build().toString());
    }
}
