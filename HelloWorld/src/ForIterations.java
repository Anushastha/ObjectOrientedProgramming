import java.util.Scanner;

public class ForIterations {
    public static void main(String[] args) {
        for (int i=0; i<10; i++)
        {
            System.out.println(i);
        }
    }
}

//print first 5 odd number
class odd{
    public static void main(String[] args) {
        for (int i=1; i<=20; i+=2)
        {
            System.out.println(i);
        }
    }
}

//print first 5 even number
class even{
    public static void main(String[] args) {
        for (int i=2; i<=20; i+=2)
        {
            System.out.println(i);
        }
    }
}

//print name 5 times
class my_name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        for (int i=1; i<6; i++)
        {
            System.out.println(name);
        }
    }
}

//infinite loop Example 1
class example{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        for (int i=0; i>=0; i++)
        {
            System.out.println(name);
        }
    }
}
// Example 2
class second_example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        for (;;)
        {
            System.out.println(name);
        }
    }
}

//Print outer loop 1-5, inner loop 6-10
class loop{
    public static void main(String[] args) {
        for (int i=1; i<=5;i++)
        {
            for (int j=6; j<=10; j++)
            {
                System.out.println("Outer loop: "+i+" Inner loop: "+j);
            }
        }
    }
}

//outer loop=first five odd number, inner loop=first five even number
class oddeven {
    public static void main(String[] args) {
        for (int i=1; i<=10; i+=2)
        {
            for (int j=2; j<=10; j+=2)
            {
                System.out.println("Outer loop for odd: "+i+" Inner loop for even: "+j);
            }
        }
    }
}

//
class weeks {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++)
        {
            System.out.println("Week: "+i);
            for (int j = 1; j <= 7; j++)
            {
                System.out.println("Day: " + j);
            }
        }
    }
}
