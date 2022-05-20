import java.util.Scanner;

//classwork
class odd_even{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int x = scanner.nextInt();
        switch(x%2){
            case 0:
                System.out.println(x+" is even number.");
                break;
            case 1:
                System.out.println(x+" is odd number.");
                break;
            default:
                System.out.println("Invalid.");
                break;
        }
    }
}


//1. Using switch statement Write a JAVA program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer.
//Calculate percentage and grade according to following: Percentage >= 90% : Grade A Percentage >= 80% : Grade B
//Percentage >= 70% : Grade C Percentage >= 60% : Grade D Percentage >= 40% : Grade E Percentage < 40% : Grade F
public class Switch{
    public static void main(String[] args) {
        double Physics,Chemistry,Biology,Mathematics,Computer,total,percent;
        char grade;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your marks in Physics:");
        Physics = scanner.nextDouble();
        System.out.println("Enter your marks in Chemistry:");
        Chemistry = scanner.nextDouble();
        System.out.println("Enter your marks in Biology:");
        Biology = scanner.nextDouble();
        System.out.println("Enter your marks in Mathematics:");
        Mathematics = scanner.nextDouble();
        System.out.println("Enter your marks in Computer:");
        Computer = scanner.nextDouble();
        total = Physics+Chemistry+Biology+Mathematics+Computer;
        percent = ((total/500)*100);
        switch ((percent>=90)?0:(percent>=80)?1:(percent>=70)?2:(percent>=60)?3:(percent>=40)?4:5){
            case 0:
                grade = 'A';
                break;
            case 1:
                grade = 'B';
                break;
            case 2:
                grade = 'C';
                break;
            case 3:
                grade = 'D';
                break;
            case 4:
                grade = 'E';
                break;
            default:
                grade = 'F';
                break;
        }
        System.out.println("Your total marks is "+total+" out of 500.");
        System.out.println("Your percentage is "+percent+"%.");
        System.out.println("Your grade is "+grade+".");
    }
}

//2.JAVA Program to find the maximum between two numbers. Using the switch statement.
class max{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter another number:");
        int num2 = scanner.nextInt();
        switch ((num1<num2)?0:(num2<num1)?1:2){
            case 0:
                System.out.println("num2 is greater.");
                break;
            case 1:
                System.out.println("num1 is greater.");
                break;
            default:
                System.out.println("They both are equal.");
                break;
        }
    }
}

//3.JAVA Program to find the maximum between three numbers. Using the switch statement.
class three{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();
        System.out.println("Enter the third number:");
        int num3 = scanner.nextInt();
        switch ((num1>num2 && num1>num3)?0:(num2>num1 && num2>num3)?1:2){
            case 0:
                System.out.println("num1 is the max.");
                break;
            case 1:
                System.out.println("num2 is the max.");
                break;
            default:
                System.out.println("num3 is the max.");
        }
    }
}

//4.JAVA Program to check whether a number is divisible by 5 and 11 or not. Using the switch statement.
class divisible{
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        a = scanner.nextInt();
        switch ((a%5==0)&&(a%11==0)?1:2){
            case 1:
                System.out.print("The number is divisible by both 5 and 11");
                break;
            case 0:
                System.out.print("The number is not divisible by both.");
                break;
        }
    }
}

//5.JAVA Program to check whether a year is a leap year or not. Using switch statement.
class leap{
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year:");
        year = scanner.nextInt();
        switch ((year%4==0 || year%400==0 && year%100==0)?0:1){
            case 0:
                System.out.println(year+" is a leap year.");
                break;
            default:
                System.out.println(year+" is not a leap year.");
                break;
        }
    }
}

//6. JAVA Program to check whether a character is an alphabet or not. Using the switch statement.
class alpha{
    public static void main(String[] args) {
        char a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character:");
        a = scanner.nextLine().charAt(0);
        switch ((a>='a' && a<='z')||(a>='A' && a<='Z')?0:1){
            case 0:
                System.out.println("The character is an alphabet.");
                break;
            default:
                System.out.println("The character is not an alphabet.");
                break;
        }
    }
}

//7.JAVA Program to take the value from the user as input any alphabet and check whether it is vowel or consonant. Using the switch statement.
class vow{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the character:: ");
        char ch = scanner.next().charAt(0);
        switch ((ch =='a'|| ch =='e' || ch =='i'|| ch =='o'||ch =='u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == '0' || ch == 'U' )?1:0){
            case 1:
                System.out.print("The character is a vowel.");
                break;
            case 0:
                System.out.print("The character is a constant.");
                break;
        }
    }
}

//8.JAVA Program to take the value from the user as input any character and check whether it is the alphabet, digit or special character.
// Using the switch statement.
class dig{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the character:: ");
        char a = scanner.next().charAt(0);
        switch ((Character.isAlphabetic(a) ? 1 : Character.isDigit(a) ? 2 : 3)) {
            case 1:
                System.out.print("The character is a alphabet");
                break;
            case 2:
                System.out.print("The character is a Digit.");
                break;
            case 3:
                System.out.print("The character is a special character.");
                break;
        }
    }
}

/*
9. JAVA Program to check whether a character is an uppercase or lowercase alphabet. Using the
switch statement.
 */
class  Lower{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the character:: ");
        char ch = scanner.next().charAt(0);
        switch ((Character.isLowerCase(ch)?1:Character.isUpperCase(ch)?2:0)){
            case 1:
                System.out.print("The character is lower case.");
                break;
            case 2:
                System.out.print("The character is Upper case.");
                break;
            case 0:
                System.out.print("The character is invalid.");
                break;
        }
    }
}

/*
10. JAVA Program to take the value from the user as an input week number and print weekday by
using the switch statement.
 */
class week {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the week number:: ");
        int a = scanner.nextInt();
        switch (a){
            case 1:
                System.out.print("Sunday");
                break;
            case 2:
                System.out.print("Monday");
                break;
            case 3:
                System.out.print("Tuesday");
                break;
            case 4:
                System.out.print("Wednesday");
                break;
            case 5:
                System.out.print("Thursday");
                break;
            case 6:
                System.out.print("Friday");
                break;
            case 7:
                System.out.print("Saturday");
                break;
            default:
                System.out.print("The number is invalid.");
        }
    }
}

/*
11. JAVA Program to take the value from the user as input the month number and print number of
days in that month. Using switch statement
 */
class Month{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number_Of_DaysInMonth = 0;
        String MonthOfName = "Unknown";
        System.out.print("Input a month number: ");
        int month = input.nextInt();
        System.out.print("Input a year: ");
        int year = input.nextInt();
        switch (month) {
            case 1:
                MonthOfName = "January";
                number_Of_DaysInMonth = 31;
                break;
            case 2:
                MonthOfName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    number_Of_DaysInMonth = 29;
                } else {
                    number_Of_DaysInMonth = 28;
                }
                break;
            case 3:
                MonthOfName = "March";
                number_Of_DaysInMonth = 31;
                break;
            case 4:
                MonthOfName = "April";
                number_Of_DaysInMonth = 30;
                break;
            case 5:
                MonthOfName = "May";
                number_Of_DaysInMonth = 31;
                break;
            case 6:
                MonthOfName = "June";
                number_Of_DaysInMonth = 30;
                break;
            case 7:
                MonthOfName = "July";
                number_Of_DaysInMonth = 31;
                break;
            case 8:
                MonthOfName = "August";
                number_Of_DaysInMonth = 31;
                break;
            case 9:
                MonthOfName = "September";
                number_Of_DaysInMonth = 30;
                break;
            case 10:
                MonthOfName = "October";
                number_Of_DaysInMonth = 31;
                break;
            case 11:
                MonthOfName = "November";
                number_Of_DaysInMonth = 30;
                break;
            case 12:
                MonthOfName = "December";
                number_Of_DaysInMonth = 31;
        }
        System.out.print(MonthOfName + " " + year + " has " + number_Of_DaysInMonth + " days\n");
    }
}

//12.JAVA Program to count the total number of notes in a given amount. Using the switch statement.
class notes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amt , value,note;
        System.out.print("Enter the amount of money:: ");
        amt = scanner.nextInt();
        System.out.print("Enter the value of each note:: ");
        value = scanner.nextInt();
        switch (value){
            case 5:
                note = amt/5;
                System.out.print("The number of notes are "+note+".");
                break;
            case 10:
                note = amt/10;
                System.out.print("The number of notes are "+note+".");
                break;
            case 20:
                note = amt/20;
                System.out.print("The number of notes are "+note+".");
                break;
            case 50:
                note = amt/50;
                System.out.print("The number of notes are "+note+".");
                break;
            case 100:
                note = amt/100;
                System.out.print("The number of notes are "+note+".");
                break;
            case 500:
                note = amt/500;
                System.out.print("The number of notes are "+note+".");
                break;
            case 1000:
                note = amt/1000;
                System.out.print("The number of notes are "+note+".");
                break;
            default:
                System.out.print("Invalid");
        }
    }
}

/*
13. JAVA Program to take the value from the user as input all sides of a triangle and check whether
the triangle is valid or not. Using switch statement
 */
class tri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the degree of first angle:: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the degree of second angle:: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the degree of second angle:: ");
        double c = scanner.nextDouble();
        switch ((a+b>c)||(a+c>b)||(b+c>a)?1:2){
            case 1:
                System.out.print("The triangle is valid.");
                break;
            default:
                System.out.print("The triangle is not valid.");
                break;
        }
    }
}

/*
14. JAVA Program to check whether the triangle is an equilateral, isosceles or scalene triangle.
Using switch statement
 */
class triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the degree of first angle:: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the degree of second angle:: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the degree of second angle:: ");
        double c = scanner.nextDouble();
        switch ((a==b&&b==c)?1:(a==b||b==c||c==a)?2:3){
            case 1:
                System.out.print("The triangle is a equilateral triangle. ");
            case 2:
                System.out.print("The triangle is a isosceles triangle. ");
            case 3:
                System.out.print("The triangle is a scalene triangle. ");
        }
    }
}

//15.JAVA Program to calculate profit or loss. Using switch statement.
class fifteen{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b,c;
        double root1,root2;
        System.out.print("Enter the first number a: ");
        a=scanner.nextDouble();
        System.out.print("Enter the second number b: ");
        b = scanner.nextDouble();
        System.out.print("Enter the third number c: ");
        c = scanner.nextDouble();
        double determinant = b * b - 4 * a * c;
        switch ((determinant>0)?1:(determinant==0)?2:(determinant<0)?3:0){
            case 1:
                root1 = (-b + Math.sqrt(determinant)) / (2 * a);
                root2 = (-b - Math.sqrt(determinant)) / (2 * a);
                System.out.print("The roots are real and different.\nroot1="+root1+"\nroot2="+root2);
                break;
            case 2:
                root1 = root2 = -b / (2 * a);
                System.out.print("The roots are real and equal.\nroot1 and root2 = "+root1);
                break;
            case 3:
                double real = -b / (2 * a);
                double imaginary = Math.sqrt(-determinant) / (2 * a);
                System.out.print("The roots are complex and distinct.\nreal = "+real+"\"" +"\nimaginary= "+imaginary);
                break;
            case 0:
                System.out.print("Invalid");
        }
    }
}

//16.JAVA Program to calculate profit or loss. Using switch statement.
class PL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the selling price: ");
        double sp = scanner.nextDouble();
        System.out.print("Enter the cost price: ");
        double cp = scanner.nextDouble();
        switch ((cp>sp)?1:(sp>cp)?2:0){
            case 1:
                double loss = cp-sp;
                System.out.print("The loss is "+loss);
                break;
            case 2:
                double profit = sp-cp;
                System.out.print("The profit is "+profit);
                break;
            case 0:
                System.out.print("Both cp and sp are equal");
        }
    }
}

//17. JAVA Program to take the value from the user as input the basic salary of an employee and calculate its Gross salary according to
// the following:Basic Salary <= 10000: HRA = 20%, DA = 80%………………………………..Basic Salary <= 20000 : HRA = 25%, DA = 90%………………………………
// Basic Salary > 20000 : HRA = 30%, DA = 95%.
class Salary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your basic salary: ");
        double salary=scan.nextDouble();
        double HRA,DA;
        switch ( (salary<=10000)?1:(salary<=20000 && salary>10000)?2:(salary>20000)?3:0 ){
            case 1:
                System.out.println("Gross salary is "+ (salary+(0.2*salary)+(0.8*salary)));
                break;
            case 2:
                System.out.println("Gross salary is "+ (salary+(0.25*salary)+(0.9*salary)));
                break;
            case 3:
                System.out.println("Gross salary is "+ (salary+(0.3*salary)+(0.95*salary)));
                break;
            case 0:
                System.out.println("no thing");
                break;
            default:
                System.out.println("invalid");
        }
    }
}

//18. JAVA Program to take the value from the user as input electricity unit charges and calculate total electricity bill
//according to the given condition: For the first 50 units Rs. 0.50/unit………….For the next 100 units Rs. 0.75/unit…..
//For the next 100 units Rs. 1.20/unit ……………For unit above 250 units  Rs. 1.50/unit………An additional surcharge of 20% is added to the bill…….
//Using the switch statement.
class Electric {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double amount,sur,bill;
        System.out.println("Enter the electricity unit charges:");
        double unit= scan.nextDouble();
        switch ( (unit<=50)?1:(unit<=150)?2:(unit<=250)?3:0){
            case 1:
                amount=unit*0.5;
                sur=amount*0.2;
                bill=amount+sur;
                System.out.println("The total bill is "+ bill);
                break;
            case 2:
                amount=25+(unit-50)*0.75;
                sur=amount*0.2;
                bill=amount+sur;
                System.out.println("the total bill is"+bill);
                break;
            case 3:
                amount=25+75+(unit-150)*1.20;
                sur=amount*0.2;
                bill=amount+sur;
                System.out.println("total bill is "+bill);
                break;
            case 4:
                amount=25+75+150+(unit-250)*1.50;
                sur=amount*0.2;
                bill=amount+sur;
                System.out.println("total bill is "+bill);
                break;
            default:
                System.out.println("invalid");
        }
    }
}


/*
19. Program to take the hours and minutes as input by the user and the show that whether it is AM
or PM by using the switch statement.
*/
class AP {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        double hours, minutes;
        System.out.println("enter the total hours: ");
        hours=scan.nextDouble();
        System.out.println("enter the total minutes: ");
        minutes=scan.nextDouble();
        double min_in_hr=minutes/60;
        double t_hours=min_in_hr+hours;
        switch((t_hours>0 &&t_hours<=11)? 1:(t_hours>=12 &&t_hours<24?2:3)){
            case 1:
                System.out.println("the total hours is "+t_hours);
                System.out.println("so it is AM.");
                break;
            case 2:
                System.out.println("the total hours is "+t_hours);
                System.out.println("so it is PM.");
                break;
            case 3:
                System.out.println("invalid input");
                break;
            default:
                System.out.println("invalid");
        }
    }
}

/*
20. Program to convert a positive number into negative number and negative number into a positive
number using switch statement
*/
class Pos{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter the number: ");
        double num=scanner.nextDouble();
        switch((num<0)?1:(num>0)?2:3){
            case 1:
                System.out.println("you enter the negative no ");
                System.out.println("so it positive no is "+(num*-1));
                break;
            case 2:
                System.out.println("you enter the positive no ");
                System.out.println("so its negative no is "+(num*-1));
                break;
            case 3:
                System.out.println("you enter the invalid no or zero ");
                break;
            default:
                System.out.println("invalid input");
        }
    }
}

/*
21. Write a program to swap the values of two numbers if the values of both variables are not the
same using a switch statement.
*/
class swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temp;
        System.out.println("Enter the first no:");
        double a=scanner.nextDouble();
        System.out.println("Enter the second no:");
        double b=scanner.nextDouble();
        temp=a;
        a=b;
        b=temp;
        switch((a!=b)?1:(a==b)?2:3){
            case 1:
                System.out.println("a="+a);
                System.out.println("b="+b);
                break;
            case 2:
                System.out.println("Don't take two same no");
                break;
            case 3:
                System.out.println("invalid");
                break;
        }
    }
}

/*
22. Program to Convert even number into its upper nearest odd number Switch Statement*/
class Uppe{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=scanner.nextInt();
        switch(num%2){
            case 0:
                System.out.println(num+" is an even number");
                System.out.println("And it's upper nearest odd number is "+ (num+1));
                break;
            case 1:
                System.out.println("Don't enter the odd number");
                break;
            default:
                System.out.println("invalid");
        }
    }
}

