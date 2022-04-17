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
//1.1
class Homework1{
    public static void main(String[] args) {
        String name=JOptionPane.showInputDialog(null,"Enter your name: ");
        int age=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your age: "));
        int grade=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your grade: "));
        String section =JOptionPane.showInputDialog(null,"Enter your section: ");
        String address =JOptionPane.showInputDialog(null,"Enter your address: ");
        JOptionPane.showMessageDialog(null,"Your name is: "+name);
        JOptionPane.showMessageDialog(null,"Your age is: "+age);
        JOptionPane.showMessageDialog(null,"Your grade is: "+grade);
        JOptionPane.showMessageDialog(null,"Your section is: "+section);
        JOptionPane.showMessageDialog(null,"Your address is: "+address);
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
//2.1
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

//3. Write a program to take input of the total marks of four subjects of a student and calculate the total percentage secured.
//Then display the percentage and final result of the student;
//a. If equal to or more than 70 -> First Class
//b. If more than 59 -> Upper second Class
//c. If more than 49 -> Second class
//d. If more than 39 -> Third class and if below than 40 the result is fail.
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
//3.1
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
//4.1
class user1{
    public static void main(String[] args) {
        int a,b,sum,product;
        a=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the first number: "));
        b=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the second number: "));
        sum = a+b;
        JOptionPane.showMessageDialog(null,"The sum of the numbers is: "+sum);
        product = a*b;
        JOptionPane.showMessageDialog(null,"The product of the numbers is: "+product);
    }
}

//5. Take two integer inputs from user. First calculate the sum of two then product of two. Finally, print the sum and
// product of both obtained results.
class input{
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
//5.1
class input1{
    public static void main(String[] args) {
        int a, b, sum, product;
        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the first number: "));
        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the second number: "));
        sum = a + b;
        JOptionPane.showMessageDialog(null, "The sum of the numbers is: " + sum);
        product = a * b;
        JOptionPane.showMessageDialog(null, "The product of the numbers is: " + product);
    }
}

//6.Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.
class area{
    public static void main(String[] args) {
        double l,b,area;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        l = scanner.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        b = scanner.nextDouble();
        area = l*b;
        System.out.println("The area of the rectangle is: "+area);
    }
}
//6.1
class area1 {
    public static void main(String[] args) {
        double l, b, area;
        l = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the length: "));
        b = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the breadth: "));
        area = l * b;
        JOptionPane.showMessageDialog(null, "The area of the rectangle: " + area);
    }
}

//7.Take name, roll number and field of interest from user and print in the format below :
// Hey, my name is xyz and my roll number is xyz. My field of interest are xyz.
class roll{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your roll number: ");
        String roll = scanner.nextLine();
        System.out.print("Enter your field of interest: ");
        String interest = scanner.nextLine();
        System.out.print("Hey,my name is "+name);
        System.out.print(" and my roll number is "+roll+".");
        System.out.print(" My field of interest are "+interest+".");
    }
}
//7.1
class roll1 {
    public static void main(String[] args) {
        String name, roll, interest;
        name = JOptionPane.showInputDialog("name");
        roll = JOptionPane.showInputDialog("roll");
        interest = JOptionPane.showInputDialog("interest");
        System.out.println("name");
        System.out.println("roll");
        System.out.println("address");
        JOptionPane.showMessageDialog(null, "Hey,my name is " + name + " and my roll number is " + roll + "." + "My field of interest are " + interest + ".");
    }
}

//8. Take side of a square from user and print area and perimeter of it. Also, calculate SI, Area of triangle and Volume of Cube and Cuboid.
// Take the attributes as user input.
class square{
    public static void main(String[] args) {
        float l,area,per;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the square: ");
        l = scanner.nextFloat();
        area = l*l;
        System.out.println("The area of the square is: "+area);
        per = l*l*l*l;
        System.out.print("The perimeter of the square is: "+per);
    }
}
class SI{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principle: ");
        float P = scanner.nextFloat();
        System.out.print("Enter the time: ");
        float T = scanner.nextFloat();
        System.out.print("Enter the rate: ");
        float R = scanner.nextFloat();
        float SI = ((P*T*R)/100);
        System.out.println("The simple interest is: "+SI);
    }
}
class Area{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the breadth: ");
        float b = scanner.nextFloat();
        System.out.print("Enter the height: ");
        float h = scanner.nextFloat();
        float Area = ((b*h)/2);
        System.out.println("Area of triangle: "+ Area);
    }
}
class Volume_cube{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length: ");
        float l = scanner.nextFloat();
        float Volume = (l*l*l);
        System.out.println("Volume of cube: "+ Volume);
    }
}
class Volume_cuboid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length: ");
        float l = scanner.nextFloat();
        System.out.print("Enter the breadth: ");
        float b = scanner.nextFloat();
        System.out.print("Enter the height: ");
        float h = scanner.nextFloat();
        float Volume = (l * b * h);
        System.out.println("Volume of cuboid: " + Volume);

    }
}
//8.1
class square1{
    public static void main(String[] args) {
        float l,area,perimeter;
        l = Float.parseFloat(JOptionPane.showInputDialog(null,"Enter the length of the square: "));
        area=l*l;
        perimeter=l*l*l*l;
        JOptionPane.showMessageDialog(null,"The area of the square is "+area+" and the perimeter is "+perimeter);
    }
}
class SI1 {
    public static void main(String[] args) {
        double P, T, R, SI;
        P = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the principle: "));
        T = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the time: "));
        R = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the rate: "));
        SI = ((P * T * R) / 100);
        JOptionPane.showMessageDialog(null, "The simple interest is: " + SI);
    }
}
class Area1{
    public static void main(String[] args) {
        double b,h,area;
        b=Integer.parseInt(JOptionPane.showInputDialog(null,"Breadth:"));
        h=Integer.parseInt(JOptionPane.showInputDialog(null,"Height:"));
        area=(b*h)/2;
        JOptionPane.showMessageDialog(null,"Area of Triangle:"+area);
    }
}
class Volume1{
    public static void main(String[] args) {
        double l,b,h,cube,cuboid;
        l=Integer.parseInt(JOptionPane.showInputDialog(null,"Length: "));
        b=Integer.parseInt(JOptionPane.showInputDialog(null,"Breadth: "));
        h=Integer.parseInt(JOptionPane.showInputDialog(null,"Height: "));
        cube=l*l*l;
        cuboid=l*b*h;
        JOptionPane.showMessageDialog(null,"Cube: "+cube+"\nCuboid: "+cuboid);
    }
}

//9. Write a program to find square of a number.
//E.g.- INPUT : 2 OUTPUT : 4
//INPUT : 5 OUTPUT : 25
class num {
    public static void main(String[] args) {
        float a,square;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        a = scanner.nextFloat();
        square = a * a;
        System.out.println("The square of the number is: " + square);
    }
}
//9.1
class num1{
    public static void main(String[] args) {
        float a,square;
        a=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter the number: "));
        square = a*a;
        JOptionPane.showMessageDialog(null,"The square of the number is: "+square);
    }
}

//10. Take two different string input and print them in same line. E.g.-
//INPUT : Codes
//INPUT : Dope
//OUTPUT : CodesDope
class join{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        String a = scanner.next();
        System.out.println("Enter another word:");
        String b = scanner.next();
        String c = a+b;
        System.out.println(c);
    }
}
//10.1
class join1{
    public static void main(String[] args) {
        String a, b, c;
        a = JOptionPane.showInputDialog(null, "Enter first word: ");
        b = JOptionPane.showInputDialog(null, "Enter second word: ");
        c = a + b;
        JOptionPane.showMessageDialog(null, "The combined word is: " + c);
    }
}

//11. Take 3 inputs from user and check :
//all are equal
//any of two are equal
//( use && || with ternary operator )
class equal{
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        b = scanner.nextInt();
        System.out.print("Enter the third number: ");
        c = scanner.nextInt();
        if (a == b && a == c )
        {
            System.out.println("All numbers are equal");
        }
        else if ((a == b) || (a == c) || (c == b))
        {
            System.out.println("Any of the two are equal");
        }
        else
        {
            System.out.println("All numbers are different");
        }
    }
}
//11.1
class equal1 {
    public static void main(String[] args) {
        int a,b,c;
        a = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the first number: "));
        b = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the second number: "));
        c = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the third number: "));
        if (a == b && a == c ) {
            JOptionPane.showMessageDialog(null, "All numbers are equal");
        }
        else if ((a == b) || (a == c) || (c == b)) {
            JOptionPane.showMessageDialog(null, "Any of the two are equal");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"All numbers are different");
        }
    }
}
