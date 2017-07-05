package com.epam.training.internship.builder.domain;

public interface PersonBuilderInterface {
    Person build();
    PersonBuilderInterface setFirstName(final String firstName);
    PersonBuilderInterface setLastName(final String lastName);
    PersonBuilderInterface setAge(final int age);
    PersonBuilderInterface setAddress(final Address address);
    PersonBuilderInterface setIdNumber(final long idNumber);
}
