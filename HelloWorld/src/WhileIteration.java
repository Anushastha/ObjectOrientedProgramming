import java.util.Scanner;

//print 1-5 using while loop
public class WhileIteration {
    public static void main(String[] args) {
        int i=1;
        while (i<=5){
            System.out.println(i);
            i++;
        }
    }
}

//Sum of the first ten natural numbers
class tensum{
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        while (i<=10)
        {
            System.out.println("Sum: "+sum);
            sum = sum+i;
            i++;
        }
    }
}

//sum of first 5 even numbers
class evensum{
    public static void main(String[] args) {
        int i=2;
        int sum=0;
        while(i<=10)
        {
            sum =sum+i;
            i+=2;
        }System.out.println("Sum: "+sum);
    }
}

//
class evensum2{
    public static void main(String[] args) {
        int i=2;
        int sum=0;
        while(i<=10){
            if (i%2==0){
                sum+=i;
            }
            i++;
        }
        System.out.println(sum);
    }
}

//1-20 multiple of 3
class multiple{
    public static void main(String[] args) {
        int i=3;
        int count=0;
        while(i<=20){
            if (i%3==0){
                count++;
            }
            i++;
        }
        System.out.println("There are "+count+" multiples of 3 between 1 and 20.");
    }
}

//check whether a number is prime or not (for loop).
class prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int count=0;
        for (int j=1;j<=num;j++) {
            if (num%j==0){
                count++;
            }
        }
        if (count==2){
            System.out.println("It is a prime number");
        }else{
            System.out.println("It is not a prime number.");
        }
    }
}

//while loop
class prime2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int count=0;
        int j=2;
        while(j<=num/2)
        {
            if (num%j==0){
                count++;
                break;
            }
            j++;
        }
        if (count==0){
            System.out.println("It is a prime number");
        }else{
            System.out.println("It is not a prime number.");
        }

    }
}

//while infinite loop
class winfinite{
    public static void main(String[] args) {
        while(true){
            System.out.println("It always executes.");
        }
    }
}

class winfinite2{
    public static void main(String[] args)
    {
        int i = 1;
        while(i > 0)
        {
            System.out.println(i);
            i++;
        }
    }
}