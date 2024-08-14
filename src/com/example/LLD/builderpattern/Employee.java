package com.example.LLD.builderpattern;

public class Employee {

    private String name;
    private String email;
    private int id;
    private String contact;

    public Employee (EmployeeBuilder employeeBuilder) {
        this.name = employeeBuilder.name;
        this.email = employeeBuilder.email;
        this.id = employeeBuilder.id;
        this.contact = employeeBuilder.contact;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public static class EmployeeBuilder {
        private String name;
        private String email;
        private int id;
        private String contact;

        public EmployeeBuilder(int id, String email) {
            this.id = id;
            this.email = email;
        }

        public EmployeeBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder setContact(String contact) {
            this.contact = contact;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }

    }
}
