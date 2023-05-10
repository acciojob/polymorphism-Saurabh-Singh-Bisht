package com.driver;

public class Main {
    public static class Product{
        public int product(int x, int y){
            return 5;
        }
        public int product(int x, int y,int z){
            return 8;
        }
        public double product(double x, double y){
            return 5.5;
        }
    }

    public static void main(String[] args) {
        Product p = new Product();
        p.product(5,10);
        p.product(5.5,5.10);
        p.product(5,10,15);
    }
}