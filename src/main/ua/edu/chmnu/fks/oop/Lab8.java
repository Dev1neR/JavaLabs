/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.ua.edu.chmnu.fks.oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Dev1ne
 */
public class Lab8 {
    static class Company {
        private String name;
        private String address;
        private int salary;
        private String department;
        private int phone;

        public Company() {
        }

        public Company(String name, String address, int salary, String department, int phone) {
            this.name = name;
            this.address = address;
            this.salary = salary;
            this.department = department;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public int getPhone() {
            return phone;
        }

        public void setPhone(int phone) {
            this.phone = phone;
        }
        
    }
    
    public static void main(String[] args) {
        List<Company> employees = new ArrayList<Company>();
        employees.add(new Company("Vasya", "Sobornaya", 1000, "1 otdel, 2 otdel", 123456789));
        employees.add(new Company("Petya", "Sobornaya", 1000, "2 otdel", 123456789));
        employees.add(new Company("Leonid", "Sobornaya", 1000, "1 otdel", 123456789));
        for(Company e:employees) {
        System.out.println(e.getName()+" - "+e.getAddress()+" - "+e.getSalary()+ " - " + e.getDepartment()+" - "+ e.getPhone());
        }
        System.out.println("\nChecking for person who works in more than one department\n");
        for(Company e:employees) {
            if(moreThanOne(e.getDepartment())) {
                System.out.println(e.getName()+" - "+e.getAddress()+" - "+e.getSalary()+ " - " + e.getDepartment()+" - "+ e.getPhone());
            }
        }
    }
    
    public static boolean moreThanOne(String dep) {
        if(!dep.contains(",")) {
            return false;
        } 
            return true;
    }
}
