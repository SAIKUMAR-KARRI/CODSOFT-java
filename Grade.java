//STUDENT GRADE CALCULATOR

import java.util.*;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new  Scanner( System.in);
        System.out.print("Enter your marks of Telugu Subject:");
        int Telugu = sc.nextInt();
        System.out.print("Enter your marks of Hindi Subject:");
        int Hindi = sc.nextInt();
        System.out.print("Enter your marks of English Subject:");
        int English = sc.nextInt();
        System.out.print("Enter your marks of Maths Subject:");
        int Maths = sc.nextInt();
        System.out.print("Enter your marks of Physics Subject:");
        int Physics = sc.nextInt();
        System.out.print("Enter your marks of Chemistry Subject:");
        int Chemistry = sc.nextInt();

        int total = Telugu + Hindi + English + Maths + Physics + Chemistry;
        int average = (int) Math.floor(total/6);
        String Grade;
        //Grades assigning

        if(average > 90){
             Grade = "A+";
        }
        else if(average > 80 && average < 90){
             Grade = "A";
        }
        else if(average > 80 && average < 90){
             Grade = "B";
        }
        else if(average > 70 && average < 80){
             Grade = "C";
        }
        else if(average > 40 && average < 70){
             Grade = "D";
        }
        else{
             Grade = "F";
        }

        //Displaying Results

        System.out.println("Total Marks Obtained in all subjects: " + total +".");
        System.out.println("Average percentage obtained is " + average + "%.");
        System.out.println("Final Grade Obtained is " + Grade +".");
        sc.close();
    }
}
