package mypackage;

public class MyClass {

	public static void main(String[] args){
        int i;
        for(i=1; i<5000; i=2*i+1){
             System.out.println("Count is: " + i);
        }
   }}


//The Java code defines a main method that initializes an integer variable i. The for loop starts with i set to 1 and continues as long as i is less than 5000. Within the loop, it prints the current value of i prefixed by “Count is: “. The update expression for i is defined as 2*i + 1, which means that in each iteration, the value of i is doubled and incremented by one.

//Initially, i is 1. In the first iteration, it prints “Count is: 1”. In the second iteration, i becomes (2*1 + 1) = 3, printing “Count is: 3”. This process continues with subsequent values of i: 7, 15, 31, and so on. Each time, the value grows rapidly due to the doubling effect until it reaches or exceeds 5000, at which point the loop terminates.
