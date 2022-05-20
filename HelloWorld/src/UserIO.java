//import java.util.Scanner;
//
//public class UserIO {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine();
//        System.out.print("Enter your age: ");
//        String age = scanner.next();
//        System.out.print("Enter your address: ");
//        String address = scanner.next();
//        System.out.println(name);
//        System.out.println(age);
//        System.out.println(address);
//    }
//}
//
//class Add{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter first number: ");
//        int num1 = scanner.nextInt();
//        System.out.print("Enter second number: ");
//        int num2 = scanner.nextInt();
//        int num3 = (num1+num2);
//        System.out.println("Sum: "+num3);
//    }
//}
//
//class Simple_Interest{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the principle: ");
//        float P = scanner.nextFloat();
//        System.out.print("Enter the time: ");
//        float T = scanner.nextFloat();
//        System.out.print("Enter the rate: ");
//        float R = scanner.nextFloat();
//        float SI = ((P*T*R)/100);
//        System.out.println("The simple interest is: "+SI);
//    }
//}
//
//class Area{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the breadth: ");
//        float b = scanner.nextFloat();
//        System.out.print("Enter the height: ");
//        float h = scanner.nextFloat();
//        float Area = ((b*h)/2);
//        System.out.println("Area of triangle: "+ Area);
//    }
//}
//
//class Volume_cube{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the length: ");
//        float l = scanner.nextFloat();
//        float Volume = (l*l*l);
//        System.out.println("Volume of cube: "+ Volume);
//    }
//}
//
//class Volume_cuboid {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the length: ");
//        float l = scanner.nextFloat();
//        System.out.print("Enter the breadth: ");
//        float b = scanner.nextFloat();
//        System.out.print("Enter the height: ");
//        float h = scanner.nextFloat();
//        float Volume = (l * b * h);
//        System.out.println("Volume of cuboid: " + Volume);
//
//    }
//}
//
//class converting{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter: ");
//        String a = scanner.next();
//        System.out.print("Enter: ");
//        String b = scanner.next();
//        int c = Integer.parseInt(a);
//        int d = Integer.parseInt(b);
//        int e = c+d;
//        System.out.println(e);
//    }
//}

import javax.swing.*;
import java.util.Scanner;

class UserIOOptionPane{
    public static void main(String[] args) {
        int num1,num2,answer;
        num1=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter: "));
        num2=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter: "));
        answer=num1+num2;
        JOptionPane.showMessageDialog(null,"The sum is: "+answer);
    }
}

class SimpleInterest{
    public static void main(String[] args) {
        double P,T,R,SI;
        P=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the principle: "));
        T=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the time: "));
        R=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the rate: "));
        SI=((P*T*R)/100);
        JOptionPane.showMessageDialog(null,"The simple interest is: "+SI);
    }
}

