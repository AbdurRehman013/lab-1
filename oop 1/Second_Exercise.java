package lab.second_exercise;

import java.util.Scanner;

public class Second_Exercise {

  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter your name : ");
        String name=sc.nextLine();
           System.out.println("Enter your enrollment : ");
        String enrollment=sc.nextLine();
         System.out.println("Enter your instructor name : ");
        String instname=sc.nextLine();
         System.out.println("Enter your subject: ");
         String subject=sc.nextLine();
          System.out.println("Enter your semester : ");
        String semester=sc.nextLine();
         System.out.println(" Name : "+name);
         System.out.println(" Enrollment : "+enrollment);
         System.out.println(" Subject : "+subject);
         System.out.println(" Instructor Name : "+instname);
         System.out.println(" Semester : "+semester);
    }
}