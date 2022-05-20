import java.util.Arrays;
import java.util.Scanner;

//2x2 array
public class ArrayMultiD {
    public static void main(String[] args) {
        int row = 2;
        int column = 2;
        int [][] myArr = new int[row][column];
//        System.out.println(myArr.length);

//        myArr[0][0]=1;
//        myArr[0][1]=2;
//        myArr[1][0]=3;
//        myArr[1][1]=4;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements:");
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                int value = scanner.nextInt();
                myArr[i][j] = value;
            }
        }
        System.out.println(Arrays.deepToString(myArr));
    }
}

//2x2 String array
class strMulti{
    public static void main(String[] args) {
        String[][] strArr=new String[2][2];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements:");
        int row=2;
        int column=2;
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                String value = scanner.next();
                strArr[i][j] = value;
            }
        }
        System.out.println(Arrays.deepToString(strArr));
    }
}

//WAP to create a function which returns a 2D array with corresponding values of rows and columns which are passed as parameters to the function.
class arrStr{
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(createArray(2,3)));
    }
    public static String[][] createArray(int row, int column){
        String[][] array = new String[row][column];
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                array[i][j]= scanner.next();
            }
        }
        return array;
    }
}

//WAP to create a function which has an integer value as a parameter.
//Syntax of the function
//static int sumValue(int value)
//here in this function you have to create an integer array of size 10 where you have to use the logic to sum all the array elements which are
//exactly divisible by the array elements which are exactly divisible by the value passed parameter to the function.
class createDivisible{
    public static void main(String[] args) {
        System.out.println(sumValue(2));
    }
    static int sumValue(int value){
        int sum =0;
        int []intArr=new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements: ");
        for (int i=0; i<intArr.length;i++){
            intArr[i] = scanner.nextInt();
            if (intArr[i]%value==0){
                sum+=intArr[i];
            }
        }
        return sum;
    }
}

