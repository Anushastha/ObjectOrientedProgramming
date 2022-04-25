import java.util.Scanner;
import java.util.SortedMap;

//1. Write a JAVA program to find maximum between two numbers.
public class Conditional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a,b;
        System.out.println("Enter the first number:");
        a = scanner.nextFloat();
        System.out.println("Enter the second number:");
        b = scanner.nextFloat();
        if(a>b) {
            System.out.println("The first number is max.");
        }
        else {
            System.out.println("The second number is max.");
        }
    }
}

//2.Write a JAVA program to find maximum between three numbers.
class max{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a,b,c;
        System.out.println("Enter the first number:");
        a = scanner.nextFloat();
        System.out.println("Enter the second number:");
        b = scanner.nextFloat();
        System.out.println("Enter the third number:");
        c = scanner.nextFloat();
        if (a>b && a>c) {
            System.out.println("The first number is the max.");
        }
        else if (b>a && b>c) {
            System.out.println("The second number is the max.");
        }
        else{
            System.out.println("The third number is the max.");
        }
    }
}

//3. Write a JAVA program to check whether a number is negative, positive or zero.
class zero{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num;
        System.out.println("Enter a number:");
        num = scanner.nextFloat();
        if (num>0) {
            System.out.println("The number is positive.");
        }
        else if (num<0){
            System.out.println("The number is negative.");
        }
        else {
            System.out.println("Zero.");
        }
    }
}

//4. Write a JAVA program to check whether a number is divisible by 5 and 11 or not.
class divisible {
    public static void main(String[] args) {
        float a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        a = scanner.nextFloat();
        if (a % 5 == 0) {
            if (a % 5 == 0 && a % 11 == 0) {
                System.out.println("The number is divisible by both 5 and 11.");
            } else {
                System.out.println("The number is divisible by 5.");
            }
        } else if (a % 11 == 0) {
            if (a % 5 == 0 && a % 11 == 0) {
                System.out.println("The number is divisible by both 5 and 11.");
            } else {
                System.out.println("The number is divisible by 11.");
            }
        } else {
            System.out.println("The number is neither divisible by 5 nor 11.");
        }
    }
}

//5. Write a JAVA program to check whether a number is even or odd.
class EO{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num;
        System.out.println("Enter a number:");
        num = scanner.nextFloat();
        if (num%2==0){
            System.out.println("It is even.");
        }
        else{
            System.out.println("It is odd.");
        }
    }
}

//6. Write a JAVA program to check whether a year is leap year or not.
class year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // year to be checked
        int year;
        boolean leap;
        System.out.println("Enter a year:");
        year = scanner.nextInt();
        //The number must be evenly divisible by 4! Otherwise, it is not a leap year.
        //If a year is evenly divisible by 4, but it is not evenly divisible 100, then it is a leap year.
        //If a year is divisible by both 4 and 100, then it might not be a leap year, and you will have to perform 1 more calculation to check.
        //If a year is divisible by 100, but not 400, then it is not a leap year.
        //If a year is divisible by both 100 and 400, then it is a leap year.
        if (year%4==0 || year%400==0 && year%100==0){
            System.out.println(year+" is a leap year.");
        }else{
            System.out.println(year+" is not a leap year.");
        }
    }
}

//7. Write a JAVA program to check whether a character is alphabet or not.
class alpha{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char alphs;
        System.out.println("Enter:");
        alphs=scanner.nextLine().charAt(0);     //initializing a char.
        if ((alphs>='a' && alphs<='z') || (alphs>='A' && alphs<='Z')){
            System.out.println(alphs+" is an alphabet.");
        }else{
            System.out.println(alphs+" is not an alphabet.");
        }
    }
}

//8.Write a JAVA program to input any alphabet and check whether it is vowel or consonant.
class vowels{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char alpha;
        System.out.println("Enter:");
        alpha = scanner.nextLine().charAt(0);
        if (alpha=='a' || alpha=='e' || alpha =='i' || alpha == 'o' || alpha == 'u'){
            System.out.println("The character is vowel.");
        }else{
            System.out.println("The character is a consonant.");
        }
    }
}

//9.Write a JAVA program to input any character and check whether it is alphabet, digit or special character.
class special{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch;
        System.out.println("Enter any character:");
        ch = scanner.nextLine().charAt(0);
        if ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
            System.out.println("The character is an alphabet.");
        }else if (ch>='0' && ch<='9'){
            System.out.println("The character is a digit.");
        }else{
            System.out.println("The character is a special character.");
        }
    }
}

//10. Write a JAVA program to check whether a character is uppercase or lowercase alphabet.
class UL{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch;
        System.out.println("Enter an alphabet:");
        ch = scanner.nextLine().charAt(0);
        if (ch>='a' && ch<='z'){
            System.out.println("The alphabet is a lower case.");
        } else if (ch>='A' && ch<='Z'){
            System.out.println("The alphabet is an upper case.");
        }else{
            System.out.println("Please enter an alphabet :)");
        }
    }
}

//11.Write a JAVA program to input week number and print weekday.
class week{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (num==1){
            System.out.println("Sunday");
        }else if (num==2){
            System.out.println("Monday");
        }else if (num==3) {
            System.out.println("Tuesday");
        }else if (num==4) {
            System.out.println("Wednesday");
        }else if (num==5) {
            System.out.println("Thursday");
        }else if (num==6) {
            System.out.println("Friday");
        }else if (num==7){
            System.out.println("Saturday");
        }else{
            System.out.println("Invalid.");
        }
    }
}

//12. Write a JAVA program to input month number and print number of days in that month.
class months {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month, year;
        System.out.println("Enter the month number:");
        month = scanner.nextInt();
        System.out.println("Enter the year: ");
        year = scanner.nextInt();
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("31 Days in this Month");
        } else if (month == 2) {
            if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {
                System.out.println(" 28 Days in this Month");
            } else {
                System.out.println("29 Days in this month");
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30 Days in this Month");
        } else {
            System.out.println("Please enter Valid Number between 1 to 12");
        }
    }
}

//13.Write a JAVA program to count total number of notes in given amount.
class CountOfNotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your amount");
        int amount = scanner.nextInt();
        int totalNoOfNotes;
        if(amount%5==0){
            totalNoOfNotes=amount/5;
            System.out.println(totalNoOfNotes);
        }else{
            System.out.println("You must enter valid figures");
        }
    }
}

//14.Write a JAVA program to input angles of a triangle and check whether triangle is valid or not.
class triangle{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c,sum;
        System.out.println("Enter the first angle:");
        a = scanner.nextInt();
        System.out.println("Enter the second angle:");
        b = scanner.nextInt();
        System.out.println("Enter the third angle:");
        c = scanner.nextInt();
        sum = a+b+c;
        System.out.println("The sum is: "+sum);
        if (sum==180){
            System.out.println("The triangle is valid.");
        }else{
            System.out.println("The triangle is not valid.");
        }
    }
}

//15. Write a JAVA program to input all sides of a triangle and check whether triangle is valid or not.
class sides{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a,b,c;
        System.out.println("Enter the first side:");
        a = scanner.nextFloat();
        System.out.println("Enter the second side:");
        b = scanner.nextFloat();
        System.out.println("Enter the third side:");
        c = scanner.nextFloat();
        if (a+b>=c || b+c>=a || a+c>=b){
            System.out.println("The triangle is valid.");
        }else{
            System.out.println("The triangle is not valid.");
        }
    }
}

//16.Write a JAVA program to check whether the triangle is equilateral, isosceles or scalene triangle.
class checking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a, b, c;
        System.out.println("Enter the first side:");
        a = scanner.nextFloat();
        System.out.println("Enter the second side:");
        b = scanner.nextFloat();
        System.out.println("Enter the third side:");
        c = scanner.nextFloat();
        if (a + b + c == 180) {
            if (a == b && b == c) {
                System.out.println("It is an equilateral triangle.");
            } else if (a == b || b == c || c == a) {
                System.out.println("It is a isosceles triangle.");
            } else if (a != b && b != c && a != c) {
                System.out.println("It is a scalene triangle.");
            }
        } else {
            System.out.println("The triangle is invalid. The sum should be 180.");
        }
    }
}

//17. Write a JAVA program to find all roots of a quadratic equation.
class eqn{
    public static void main(String[] args) {
        double FirstRoot=0,SecondRoot=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        double a = scanner.nextDouble();
        System.out.println("Enter the value of b:");
        double b = scanner.nextDouble();
        System.out.println("Enter the value of c:");
        double c = scanner.nextDouble();
        double determinant = (b*b)-(4*a*c);
        double sqrt = Math.sqrt(determinant);
        System.out.println(determinant);
        if (determinant>0){
            FirstRoot = (-b + sqrt)/(2*a);
            SecondRoot = (-b + sqrt)/(2*a);
            System.out.println("Roots are :: "+FirstRoot + "and" +SecondRoot);
        }else if (determinant == 0){
            System.out.println("Root is :: "+(-b+sqrt)/(2*a));
        }
    }
}
//18. Write a JAVA program to calculate profit or loss.
class pl{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double SP,CP,PL;
        System.out.println("Enter the selling price(SP):");
        SP = scanner.nextDouble();
        System.out.println("Enter the cost price(CP):");
        CP = scanner.nextDouble();
        if (SP>CP){
            PL = SP-CP;
            System.out.println("The profit is = "+PL);
        }else{
            PL = CP-SP;
            System.out.println("The loss is = "+PL);
        }
    }
}

//19.Write a JAVA program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer.
//Calculate percentage and grade according to following: Percentage >= 90% : Grade A Percentage >= 80% : Grade B
//Percentage >= 70% : Grade C Percentage >= 60% : Grade D Percentage >= 40% : Grade E Percentage < 40% : Grade F
class results{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks of Physics:");
        int Physics = scanner.nextInt();
        System.out.println("Enter marks of Chemistry:");
        int Chemistry = scanner.nextInt();
        System.out.println("Enter marks of Biology:");
        int Biology = scanner.nextInt();
        System.out.println("Enter marks of Mathematics:");
        int Mathematics = scanner.nextInt();
        System.out.println("Enter marks of Computer:");
        int Computer = scanner.nextInt();
        int total = Physics+Computer+Chemistry+Biology+Mathematics;
        int percentage= total/4;
        if (percentage>=90){
            System.out.println("Grade A");
        } else if (percentage >= 80){
            System.out.println("Grade B");
        } else if (percentage >= 70){
            System.out.println("Grade C");
        } else if (percentage >= 60){
            System.out.println("Grade D");
        } else if (percentage >= 40){
            System.out.println("Grade E");
        } else if (percentage < 40)
        {
            System.out.println("Grade F");
        }else{
            System.out.println("Fail");
        }
    }
}

//20. Write a JAVA program to input basic salary of an employee and calculate its Gross Salary according to following.
// Basic Salary <= 10000 : HRA = 20%, DA = 80%
//Basic Salary <= 20000 : HRA = 25%, DA = 90%
// Basic Salary > 20000 : HRA = 30%, DA = 95%
class salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter basic salary");
        double basic_salary = scanner.nextDouble();
        if (basic_salary <= 10000) {
            double gross_salary = basic_salary + 0.2 * basic_salary + 0.8 * basic_salary;
            System.out.println(gross_salary);
        } else if (basic_salary <= 20000) {
            double gross_salary = basic_salary + 0.25 * basic_salary + 0.9 * basic_salary;
            System.out.println(gross_salary);
        } else if (basic_salary > 20000) {
            double gross_salary = basic_salary + 0.3 * basic_salary + 0.95 * basic_salary;
            System.out.println(gross_salary);
        } else {
            System.out.println("invalid");
        }
    }

    //21.Write a JAVA program to input electricity unit charges and calculate total electricity bill according to the given condition:
//For first 50 units Rs. 0.50/unit For next 100 units Rs. 0.75/unit For next 100 units Rs. 1.20/unit For unit above 250 Rs. 1.50/unit
//An additional surcharge of 20% is added to the bill.
    class bill {
        public static void main(String[] args) {
            int units;
            double Amount, Sur_Charge, Total_Amount;
            Scanner scanner = new Scanner(System.in);
            units = scanner.nextInt();
            if (units <= 50) {
                Amount = units * 0.5;
                Sur_Charge = 0.2 * Amount;
            } else if (units <= 150) {
                Amount = 25 + ((units - 50) * 0.75);
                Sur_Charge = 0.2 * Amount;
            } else if (units <= 250) {
                Amount = 25 + 75 + ((units - 150) * 1.20);
                Sur_Charge = 0.2 * Amount;
            } else {
                Amount = 25 + 75 + 120 + ((units - 250) * 1.50);
                Sur_Charge = 0.2 * Amount;
            }
            Total_Amount = Amount + Sur_Charge;
            System.out.println("\n Electricity Bill = " + Total_Amount);
        }
    }
}



