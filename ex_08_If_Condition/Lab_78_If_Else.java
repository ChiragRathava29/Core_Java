package ex_08_If_Condition;

import java.util.Scanner;

public class Lab_78_If_Else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a age: ");
        int age = sc.nextInt();

        if(age > 18) {
            System.out.println("You can vote");
        } else{
            System.out.println("You can not vote");
        }
    }
}
