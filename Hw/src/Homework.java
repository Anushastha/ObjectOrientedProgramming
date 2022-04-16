import javax.swing.*;
import java.util.Scanner;

//1. Write a program to take student details as input and display the result.
public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        Integer age = scanner.nextInt();
        System.out.print("Enter your grade: ");
        Integer grade = scanner.nextInt();
        System.out.print("Enter your section: ");
        String section = scanner.next();
        System.out.print("Enter your address: ");
        String address = scanner.next();
        System.out.println("Name:"+name);
        System.out.println("Age: "+age);
        System.out.println("Grade: "+grade);
        System.out.println("Section: "+section);
        System.out.println("Address: "+address);
    }
}
//1.2
class Homework1{
    public static void main(String[] args) {
        int age,grade,birthyear;
        age=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter you age: "));
        grade=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your grade: "));
        birthyear=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your birthyear: "));
        JOptionPane.showMessageDialog(null,"Your age is: "+age);
        JOptionPane.showMessageDialog(null,"Your grade is: "+grade);
        JOptionPane.showMessageDialog(null,"Your birthyear is: "+birthyear);
    }
}
//2. Write a program to calculate sum of four numbers taking user input.
class sum{
    public static void main(String[] args) {
        int num1,num2,num3,num4,sum;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        num3 = scanner.nextInt();
        System.out.print("Enter the fourth number: ");
        num4 = scanner.nextInt();
        sum = (num1+num2+num3+num4);
        System.out.print("The sum of the numbers is: "+sum);
    }
}
//2.2
class sum1{
    public static void main(String[] args) {
        int num1,num2,num3,num4,sum;
        num1=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the first number: "));
        num2=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the second number: "));
        num3=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the third number: "));
        num4=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the fourth number: "));
        sum=num1+num2+num3+num4;
        JOptionPane.showMessageDialog(null,"The sum of the numbers is: "+sum);
    }
}
/*
3. Write a program to take input of the total marks of four subjects of a student and calculate the total percentage secured.
Then display the percentage and final result of the student;
a. If equal to or more than 70 -> First Class
b. If more than 59 -> Upper second Class
c. If more than 49 -> Second class
d. If more than 39 -> Third class and if below than 40 the result is fail.*/
class result {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float Science, Math, English, Nepali, Percentage;
        System.out.print("Enter your marks in Science: ");
        Science = scanner.nextFloat();
        System.out.print("Enter your marks in Math: ");
        Math = scanner.nextFloat();
        System.out.print("Enter your marks in English: ");
        English = scanner.nextFloat();
        System.out.print("Enter your marks in Nepali: ");
        Nepali = scanner.nextFloat();
        Percentage = (((Science + Math + English + Nepali) / 400) * 100);
        System.out.println("Your percentage is: " + Percentage);
        if (Percentage >= 70) {
            System.out.println("First class");
        } else if (Percentage >= 59) {
            System.out.println("Upper second class");
        } else if (Percentage >= 49) {
            System.out.println("Second class");
        } else if (Percentage >= 39) {
            System.out.println("Third class");
        } else if (Percentage > 40) {
            System.out.println("Fail");
        }
    }
}
//3.2
class result2 {
    public static void main(String[] args) {
        double Science, Math, English, Nepali, Percentage;
        Science=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter your marks in Science: "));
        Math=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter your marks in Math: "));
        English=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter your marks in English: "));
        Nepali=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter your marks in Nepali: "));
        Percentage = (((Science + Math + English + Nepali) / 400) * 100);
        JOptionPane.showMessageDialog(null,"Your percentage is: "+Percentage);
        if (Percentage>=70){
            JOptionPane.showMessageDialog(null,"First class!");
        } else if (Percentage>=59) {
            JOptionPane.showMessageDialog(null,"Upper second class.");
        } else if (Percentage>=49) {
            JOptionPane.showMessageDialog(null,"Second class.");
        } else if (Percentage>=39) {
            JOptionPane.showMessageDialog(null,"Third class.");
        } else if (Percentage<40) {
            JOptionPane.showMessageDialog(null,"Sorry, you have failed.");
        }
    }

}
//4. Write a program to take two integer inputs from user and print sum and product of them.
class user{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,sum,product;
        System.out.print("Enter the first number: ");
        a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        b = scanner.nextInt();
        sum = a+b;
        System.out.println("The sum of the numbers is: "+sum);
        product = a*b;
        System.out.println("The product of the numbers is: "+product);
    }
}
//4.2
