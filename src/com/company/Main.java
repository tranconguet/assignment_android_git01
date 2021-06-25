package com.company;

public class Main {
    enum Operater { add, subtract, multiple, divide, pow}

    static int calculate(Operater o, int... numbers){
     switch (o){
         case add:
             int sum = 0;
             for (int i = 0; i < numbers.length; i++) {
                 sum += numbers[i];
             }
             return sum;
     }
     return 0;
    };

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello world");
        System.out.println(calculate(Operater.add, 10,12,12,14));
    }
};




