/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.ua.edu.chmnu.fks.oop;

import java.util.Objects;

/**
 *
 * @author Dev1ne
 */
public class Lab6 {
    static public void main(String[] args) {
        PC perscomp = new PC(
                "Intel Core i7 7700k",
                8,
                "LGA 1150",
                16,
                1000
        );
        Notebook notebook = new Notebook(
                "Intel Core i7 4790k",
                4,
                "LGA 1150",
                8,
                2000
        );
        Tablet tablet = new Tablet(
                "iPad 2018",
                4,
                "Apple A10",
                2,
                32
        );
        System.out.printf(perscomp.toString());
        System.out.printf(notebook.toString());
        System.out.printf(tablet.toString());
}
    static abstract class Computer {
        private String model;
        private int cores;
        private String chipset;
        private int ram;
        private int hdd;

        public Computer(String model, int cores, String chipset, int ram, int hdd) {
            this.model = model;
            this.cores = cores;
            this.chipset = chipset;
            this.ram = ram;
            this.hdd = hdd;
        }
        
        public abstract String getType();
        
        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getCores() {
            return cores;
        }

        public void setCores(int cores) {
            this.cores = cores;
        }

        public String getChipset() {
            return chipset;
        }

        public void setChipset(String chipset) {
            this.chipset = chipset;
        }

        public int getRam() {
            return ram;
        }

        public void setRam(int ram) {
            this.ram = ram;
        }

        public int getHdd() {
            return hdd;
        }

        public void setHdd(int hdd) {
            this.hdd = hdd;
        }

        @Override
        public int hashCode() {
            int hash = 3;
            hash = 41 * hash + Objects.hashCode(this.model);
            hash = 41 * hash + this.cores;
            hash = 41 * hash + Objects.hashCode(this.chipset);
            hash = 41 * hash + this.ram;
            hash = 41 * hash + this.hdd;
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Computer other = (Computer) obj;
            if (this.cores != other.cores) {
                return false;
            }
            if (this.ram != other.ram) {
                return false;
            }
            if (this.hdd != other.hdd) {
                return false;
            }
            if (!Objects.equals(this.model, other.model)) {
                return false;
            }
            if (!Objects.equals(this.chipset, other.chipset)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return "\n" + "Тип: " + getType() + "\n" +
                    "Модель: " + getModel() + "\n" +
                    "Ядер: " + getCores() + "\n" +
                    "Чіпсет: " + getChipset() + "\n" +
                    "ОЗУ: " + getRam() + " гб\n" +
                    "ПЗУ: " + getHdd() + " гб\n";
        }
    }
    
    static class PC extends Computer {
        private String DevType = "Персональний комп'ютер";

        public PC(String model, int cores, String chipset, int ram, int hdd) {
            super(model, cores, chipset, ram, hdd);
        }
        
        @Override
        public String getType() {
            return DevType;
        }
    }
    
    static class Tablet extends Computer {
        private String DevType = "Планшет";

        public Tablet(String model, int cores, String chipset, int ram, int hdd) {
            super(model, cores, chipset, ram, hdd);
        }
        
        @Override
        public String getType() {
            return DevType;
        }
    }
    
    static class Notebook extends Computer {
        private String DevType = "Ноутбук";
        
        public Notebook(String model, int cores, String chipset, int ram, int hdd) {
            super(model, cores, chipset, ram, hdd);
        }
        
        @Override
        public String getType() {
            return DevType;
        }
    }
}
