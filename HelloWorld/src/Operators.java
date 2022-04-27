public class Operators {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 15;
        int d = 12;
        int e = 10;
//        Using arithmetic operators
        System.out.println(a+b);
        System.out.println(c-b);
        System.out.println(c/b);
        System.out.println(e*b);
        System.out.println(c%a);
    }
}
 class assign {
    public static void main(String[] args) {
        //create variable
        int a = 10;
        int var;
        // assigning =
        var = a;
        System.out.println("var using =: "+var);
        // assigning +=
        var += a;
        System.out.println("var using +=: "+var);
        // assigning -=
        System.out.println("var using -=: "+var);
        // assign value using *=
        var *= a;
        System.out.println("var using *=: " + var);
    }
}


class relational {
    public static void main(String[] args) {
        // create variables
        int a = 9, b = 12;
        // value of a and b
        System.out.println("a is " + a + " and b is " + b);
        // == operator
        System.out.println(a == b); // false
        // != operator
        System.out.println(a != b); // true
        // > operator
        System.out.println(a > b); // false
        // < operator
        System.out.println(a < b); // true
        // >= operator
        System.out.println(a >= b); // false
        // <= operator
        System.out.println(a <= b); // true

    }
}

class logical{
    public static void main(String[] args) {
        // && operator
        System.out.println((5 > 3) && (8 > 5)); // true
        System.out.println((5 > 3) && (8 < 5)); // false
        // || operator
        System.out.println((5 < 3) || (8 > 5)); // true
        System.out.println((5 > 3) || (8 < 5)); // true
        System.out.println((5 < 3) || (8 < 5)); // false
        // ! operator
        System.out.println(!(5 == 3)); // true
        System.out.println(!(5 > 3)); // false
    }
}

class classwork {
    public static void main(String[] args) {
        // assigning values
        int a = 2;
        int b = 5;
        String c = "Hello";
        String d = "World";
        int e = a;
        String f = d;
        System.out.println(e<b);
        System.out.println(f!=c);
    }
}

class unary{
    public static void main(String[] args) {
        // assigning values
        int a = 2;
        int b = 5;
        System.out.println(a+=++b); //prefix
        System.out.println(a+=b++); //postfix
    }
}

//1. Write a program to check whether a person can cast a vote or not. Condition is you must be above 18 years to vote.
//3. Write ternary operator for the question no. 1.

class ternary{
    public static void main(String[] args) {
        int age = 19;  //set variable
        String eligibility;
        eligibility = (age>18)?"You can vote. ":"You cannot vote.";  //condition
        System.out.println(eligibility);
    }
}

//2. Simple Interest
class classwork2{
    public static void main(String[] args) {
        float P=13000;
        float T=12;
        float R=2;
        float SI = ((P*T*R)/100);
        System.out.println("Simple Interest = "+SI);
    }
}

//2. Area of triangle
class homework{
    public static void main(String[] args) {
        float b=4;
        float h=13;
        float Area=((b*h)/2);
        System.out.println("Area of triangle: "+Area);
    }
}

//3. Volume of cube
class homework2{
    public static void main(String[] args) {
        float l=3;
        float Volume=l*l*l;
        System.out.println("Volume of cube: "+Volume);
    }
}

//2. Volume of cuboid
class homework3{
    public static void main(String[] args) {
        float l=2;
        float b=4;
        float h=3;
        float Volume=l*b*h;
        System.out.println("Volume of cuboid: "+Volume);
    }
}

/*
4. Write a program to calculate the total marks of four subjects of a student and the total percentage secured.
And use following conditions to generate the final result;
a. If equal to or more than 70 -> First Class
b. If more than 59 -> Upper second Class
c. If more than 49 -> Second class
d. If more than 39 -> Third class and if below than 40 the result is fail.*/
class homework4{
    public static void main(String[] args) {
        float Science=70;
        float Math=92;
        float English=100;
        float Nepali=95;
        float Percentage=(((Science+Math+English+Nepali)/400)*100);
        System.out.println("Your percentage is: "+Percentage);
        if (Percentage>=70){
            System.out.println("First class");
        }else if (Percentage>=59){
            System.out.println("Upper second class");
        }else if (Percentage>=49){
            System.out.println("Second class");
        }else if (Percentage>=39){
            System.out.println("Third class");
        }else if (Percentage<40){
            System.out.println("Fail");
        }
    }
}

