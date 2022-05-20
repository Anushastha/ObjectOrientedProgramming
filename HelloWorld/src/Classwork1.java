import java.util.Scanner;

public class Classwork1 {
    public static void main(String[] args) {
        String name = "Anusha Shrestha";
        String dob = "2003";
        String age = "19";
        System.out.printf("My name is: %s. \nMy dob is: %s. \nMy age is: %s.",name,dob,age); //%s string print garna
//        System.out.println("My name is "+name);
//        System.out.println("My age is "+age);
//        System.out.println("My dob is "+dob);
    }
}


//
class student{
    static String name = "Anusha Shrestha";
    static int age = 19;
    String address = "Imadole";
    public static void main(String[] args) {
        student student = new student();
        System.out.println("Your name: \nYour age is:  \nYou live in: "+name+age+student.address);
    }
}

//eligible for loan or not.
class loans{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name;
        int age,marks;
        System.out.println("Enter your name:");
        name = scanner.nextLine();
        System.out.println("Enter your age:");
        age = scanner.nextInt();
        System.out.println("Enter your marks:");
        marks = scanner.nextInt();
        if (age>=18 || age<=21){
            if (marks>=80){
                System.out.println("Your are eligible for the loan!");
            }else{
                System.out.println("You are not eligible for the loan.");
            }
        }else{
            System.out.println("You are not eligible for the loan.");
        }
    }
}

//sum of first five odd multiples of 5
class oddEvensum{
    public static void main(String[] args) {
        int sum=0;
        for(int number =5;number<50;number+=10){
            if(number%5==0){
                System.out.println(number);
                sum+=number;
            }
            System.out.println("total "+sum);
        }
    }
}

//reverse of an integer
class reverse{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int reversed = 0;
        System.out.println("Original Number: " + num);
        while(num!=0) {
            int digit = num%10;
            reversed = reversed*10+digit;
            num = num/10;
        }
        System.out.println("Reversed Number: " + reversed);
    }
}

//palidrome number.
class palindrome{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int reversed = 0;
        int number = num;
        System.out.println("Original Number: "+ num);
        while (num!=0){
            int digit = num%10;
            reversed = reversed*10+digit;
            num = num /10;
        }
        System.out.println("Reversed Number: "+reversed);
        if (number==reversed){
            System.out.println("It is a palindrome number.");
        }else{
            System.out.println("It is not a palindrome number.");
        }
    }
}

//fibonacci
class fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        int prev = 1;
        int next = 1;
        int temp=0;
        while (next<=n) {
            temp = next;
            next = temp + prev;
            prev = temp;
        }
        if (temp == n) {
            System.out.println("This is fibonacci.");
        } else {
            System.out.println("This is not fibonacci.");
        }
    }
}

//string palindrome
