import java.util.Scanner;

//1) WAP to print the first 10 multiples of 2.
public class For_iteration {
    public static void main(String[] args) {
        for (int i=2; i<=20; i+=2)
        {
            System.out.println(i);
        }
    }
}

//2) WAP to take your name and age as user input and print it 5 times for loop.
class my_name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your age:");
        String age = scanner.nextLine();
        for (int i=1; i<6; i++)
        {
            System.out.println(name);
            System.out.println(age);
        }
    }
}

//3) WAP to take the initialization and condition for loop and print the even numbers present between it.
class even{
    public static void main(String[] args) {
        for (int i=2; i<=30; i+=2)
        {
            System.out.println(i);
        }
    }
}

//4) WAP to take the initialization and condition for loop and print the sum of all the even numbers present between it.
class add {
    public static void main(String[] args) {
        int sum=0;
        for (int i=2; i<=30; i+=2)
        {
            sum = sum+i;
            System.out.println(i);
        }
        System.out.println("The sum of all the even numbers is: "+sum);
    }
}