package com.company;

public class Main {
    enum Operator { add, subtract, multiple, divide, pow}

    static int calculate(Operator o, int... numbers){
        // write calculator here
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
        System.out.println(calculate(Operator.add, 10,12,12,14));
    }
};




