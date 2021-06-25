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
         case multiple:
             int sum2 = 1;
             for (int i = 1; i < numbers.length; i++) {
                 sum2 *= numbers[i];
             }
             return sum2;
         case divide:
             return 123;
         default:
             return 0;
     }
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello world 1 2 3 4 5");
        System.out.println(calculate(Operator.multiple, 1,2,3,4));
    }
};




