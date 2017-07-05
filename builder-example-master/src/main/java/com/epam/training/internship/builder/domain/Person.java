package com.epam.training.internship.builder.domain;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;
    private Address address;
    private long idNumber;

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", idNumber=" + idNumber +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(final Address address) {
        this.address = address;
    }

    public long getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(final long idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return idNumber == person.idNumber;
    }

    @Override
    public int hashCode() {
        return (int) (idNumber ^ (idNumber >>> 32));
    }

    public int compareTo(final Person other) {
        if (this.firstName.equalsIgnoreCase(other.firstName)) {
            return this.lastName.compareTo(other.lastName);
        }

        return this.firstName.compareTo(other.firstName);
    }

    public static PersonBuilderInterface builder() {
        return new PersonBuilderInterface();
    }

    private static class PersonBuilderInterface implements com.epam.training.internship.builder.domain.PersonBuilderInterface {
        // TODO: implement this class.
        private Person person;
        public PersonBuilderInterface()
        {
            person=new Person();
        }
        public Person build() {
            return person;
        }

        public com.epam.training.internship.builder.domain.PersonBuilderInterface setFirstName(String firstName) {
            person.setFirstName(firstName);
            return this;
        }

        public com.epam.training.internship.builder.domain.PersonBuilderInterface setLastName(String lastName) {
            person.setLastName(lastName);
            return this;
        }

        public com.epam.training.internship.builder.domain.PersonBuilderInterface setAge(int age) {
            person.setAge(age);
            return this;
        }

        public com.epam.training.internship.builder.domain.PersonBuilderInterface setAddress(Address address) {
            person.setAddress(address);
            return this;
        }

        public com.epam.training.internship.builder.domain.PersonBuilderInterface setIdNumber(long idNumber) {
            person.setIdNumber(idNumber);
            return this;
        }
    }
}
