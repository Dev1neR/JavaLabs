/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import main.ua.edu.chmnu.fks.oop.Lab8;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Dev1ne
 */
public class Lab8Test {
    
    public Lab8Test() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
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
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void moreThanOneTest1() {
        boolean a = false;
        List<Company> employees = new ArrayList<Company>();
        employees.add(new Company("Vasya", "Sobornaya", 1000, "1 otdel, 2 otdel", 123456789));
        employees.add(new Company("Petya", "Sobornaya", 1000, "2 otdel", 123456789));
        employees.add(new Company("Leonid", "Sobornaya", 1000, "1 otdel", 123456789));
        
        for(Company e:employees) {
            a = Lab8.moreThanOne(e.getDepartment());
        }
        assertEquals(true, a);
    }
    @Test
    public void moreThanOneTest2() {
        boolean a = false;
        List<Company> employees = new ArrayList<Company>();
        employees.add(new Company("Vasya", "Sobornaya", 1000, "1 otdel", 123456789));
        employees.add(new Company("Petya", "Sobornaya", 1000, "2 otdel", 123456789));
        employees.add(new Company("Leonid", "Sobornaya", 1000, "1 otdel", 123456789));
        
        for(Company e:employees) {
            a = Lab8.moreThanOne(e.getDepartment());
        }
        assertEquals(false, a);
    }
}
