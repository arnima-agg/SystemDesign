package com.example.LLD.builderpattern;

public class Main {

    public static void main(String args[]) {
        Employee employee = new Employee.EmployeeBuilder(1, "abc@gmail.com").setContact("7027").build();
        System.out.println(employee.getEmail());
        System.out.println(employee.getContact());
    }

}
