package com.epam.training.internship.builder.domain;

import java.util.Collection;

public class Company {
    private String name;
    private Person ceo;
    private Address location;
    private Collection<Person> employees;
    private Collection<Company> partners;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getCeo() {
        return ceo;
    }

    public void setCeo(Person ceo) {
        this.ceo = ceo;
    }

    public Address getLocation() {
        return location;
    }

    public void setLocation(Address location) {
        this.location = location;
    }

    public Collection<Person> getEmployees() {
        return employees;
    }

    public void setEmployees(Collection<Person> employees) {
        this.employees = employees;
    }

    public Collection<Company> getPartners() {
        return partners;
    }

    public void setPartners(Collection<Company> partners) {
        this.partners = partners;
    }
}
