/*
//Parameterized and return type
public class Functions {
    public static void main(String[] args) {
        addition(3,6);
    }
    public static int addition(int a, int b){
        int c = a+b;
        return c;
    }
}
*/

/*
//Parameter less and return type
class Fun {
    public static void main(String[] args) {
        Fun fun = new Fun();      //object banako
        System.out.println(fun.addition());
    }
    public int addition(){
        int a=3;
        int b=6;
        int c=a+b;
        return c;
    }
}
*/

/*
//Parameter less and no return type
class Func {
    public static void main(String[] args) {
        Func func = new Func();      //object banako
        func.addition();
    }
    public void addition(){
        int a=3;
        int b=6;
        int c=a+b;
        System.out.println(c);
    }
}
*/

/*
class Funct {
    public static void main(String[] args) {
        addition();
    }
    public static void addition(){
        int a=3;
        int b=6;
        int c=a+b;
        System.out.println(c);
    }
}
*/

/*
//Parameter less and return type
class Functions {
    public static void main(String[] args) {
        addition(3,6);
    }
    public static void addition(int a, int b){
        int c = a+b;
        System.out.println(c);
    }
}
*/

//WAP to return your details like name, age, address from a function.
class Details {
    public static void main(String[] args) {
        System.out.println(myDetails());
    }
    public static String myDetails(){
        String name = "Anusha Shrestha";
        String age = "19";
        String address = "Imadole";
        String myDetails = name+"\n"+age+"\n"+address;
        return myDetails;
    }
}

//check prime
class PrimeNum{
    public static void main(String[] args) {

    }
}
