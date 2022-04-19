import java.util.Scanner;

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
        if (year%4==0){
            if (year%100==0){       // if the year is century
                if (year%400==0){         //if year is divided by 400
                    leap = true;
                }
                else {
                    leap = false;
                }
            }else{                    //if the year is not century
                leap = true;
            }
        }else{
            leap = false;
        }if (leap){
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
        int month;
        System.out.println("Enter the month number:");
        month = scanner.nextInt();
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 )
        {
            System.out.println("31 Days in this Month");
        }
        else if ( month == 4 || month == 6 || month == 9 || month == 11 )
        {
            System.out.println("30 Days in this Month");
        }
        else if ( month == 2 )
        {
            System.out.println("Either 28 or 29 Days in this Month");
        }
        else
            System.out.println("Please enter Valid Number between 1 to 12");
    }
}

//13.Write a JAVA program to count total number of notes in given amount.
