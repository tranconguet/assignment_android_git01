package com.company;

public class Main {
    enum Operator { add, subtract, multiple, divide, pow}

    static int calculate(Operator o, int... numbers){
        if(numbers.length <= 0)
            return 0;
        // write calculator here
     switch (o){
         case add:
             int sum = 0;
             for (int i = 0; i < numbers.length; i++) {
                 sum += numbers[i];
             }
             return sum;
         case subtract:
             int sum1 = numbers[0];
             for (int i = 1; i < numbers.length; i++) {
                 sum1 -= numbers[i];
             }
             return sum1;
         default:
             return 0;
     }
    };

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello world");
        System.out.println(calculate(Operator.subtract, 10,12,12,14));
    }
};




