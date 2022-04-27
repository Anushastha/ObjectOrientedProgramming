import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        if (age<18){
            System.out.println("Under age");
        }
        else{
            System.out.println("Adult");
        }
    }
}

class vote{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        if (age<18){
            System.out.println("You can vote");
        }
        else{
            System.out.println("You cannot vote");
        }
    }
}

class marks{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your marks:");
        int mark = scanner.nextInt();
        if (mark<50){
            System.out.println("Bad");
        }
        else{
            System.out.println("Good");
        }
    }
}

class module{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Programming,Software_Design,Math,LED1,per,total;
        System.out.println("Enter your marks in Programming:");
        Programming = scanner.nextDouble();
        System.out.println("Enter your marks in Software Design:");
        Software_Design = scanner.nextDouble();
        System.out.println("Enter your marks in Math:");
        Math = scanner.nextDouble();
        System.out.println("Enter your marks in LED1:");
        LED1 = scanner.nextDouble();
        total = Programming+Math+Software_Design+LED1;
        per = ((total/400)*100);
        if (per>70){
            System.out.println("First class");
        }
        else if (per<69 && per>=60){
            System.out.println("Upper second class");
        }
        else if (per<59 && per>=50){
            System.out.println("Second class");
        }
        else if (per<49 && per>=40){
            System.out.println("Third class");
        }
        else{
            System.out.println("Fail!!");
        }
    }
}

class voting{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean voter_card;
        int age;
        System.out.println("Enter your age:");
        age = scanner.nextInt();
        System.out.println("Do you have voter card? Type 'true' for yes and 'false' for no: ");
        voter_card = scanner.nextBoolean();
        if (age>=18) {
            if (voter_card == true) {  //call gareko (voter_card). Cha bhanne bujhne or can write as (voter_card == true). !!Only boolan ko case ma!!
                System.out.println("You can vote.");
            } else {
                System.out.println("You need voter card.");
            }
        }else {
                System.out.println("Ineligible");
            }
        }
    }
