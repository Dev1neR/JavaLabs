/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.ua.edu.chmnu.fks.oop.aud6;

/**
 *
 * @author Dev1ne
 */
public class Aud6 {
    public static void main(String[] args) {
        Parallelogram par1 = new Parallelogram(2, 4, 8);
        System.out.println("Parallelogram perimeter = " + par1.perim());
        System.out.println("Parallelogram square = " + par1.square());

        Parallelepiped parp1 = new Parallelepiped(2, 4, 8, 6, 0.3, 0.2);
        System.out.println("Parallelepiped perimeter = " + parp1.perim());
        System.out.println("Parallelepiped square = " + parp1.square());
    }

    public static class Parallelogram{
        private double length = 0;
        private double width = 0;
        private double anglePa = 0;

        public Parallelogram(){

        }

        public Parallelogram(double length, double width, double anglePa) {
            if(length > 0) {
                this.length = length;
            }
            if(width > 0) {
                this.width = width;
            }
            if(anglePa > 0) {
                this.anglePa = anglePa;
            }
        }

        public double perim(){
            return 2 * (length + width);
        }

        public double square() {
            return Math.abs(width * length * width * Math.sin(anglePa));
        }

        public final double getLength() {
            return length;
        }

        public void setLength(double length) {
            if(length > 0) {
                this.length = length;
            }
        }

        public final double getWidth() {
            return width;
        }

        public void setWidth(double width){
            if(width > 0) {
                this.width = width;
            }

        }

        public double getAngle1() {
            return anglePa;
        }

        public void setAngle1(double anglePa) {
            if(anglePa > 0) {
                this.anglePa = anglePa;
            }
        }
    }

    public static class Parallelepiped extends Parallelogram{
        private double height;
        private double anglePi1;
        private double anglePi2;

        public Parallelepiped(){

        }

        public Parallelepiped(double length, double width, double anglePa, double height, double anglePi1, double anglePi2) {
            super(length, width, anglePa);
            this.height = height;
            this.anglePi1 = anglePi1;
            this.anglePi2 = anglePi2;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            if(height > 0) {
                this.height = height;
            }
        }

        public double getAnglePi1() {
            return anglePi1;
        }

        public void setAnglePi1(double anglePi1){
            if(anglePi1 > 0) {
                this.anglePi1 = anglePi1;
            }
        }

        public double getAnglePi2() {
            return anglePi2;
        }

        public void setAnglePi2(double anglePi2) {
            if(anglePi2 > 0) {
                this.anglePi2 = anglePi2;
            }
        }
        
        @Override
        public double perim() {
            return super.perim() * 2 + 4 * height;
        }
        
        @Override
        public double square() {
            Parallelogram p2 = new Parallelogram(getLength(), height, anglePi1);
            Parallelogram p3 = new Parallelogram(getWidth(), height, anglePi2);
            return 2 * (super.square() + p2.square() + p3.square());
        }
    }
}
