import java.util.Arrays;
import java.util.Scanner;

public class ArrayOneD {
    public static void main(String[] args) {
//        int[] myArray = new int[5];    //5 ota matra value add garna paucha
//         myArray[0]=1;
//         myArray[1]=2;
//         myArray[2]=3;
//         myArray[3]=4;
//         myArray[4]=5;
//         System.out.println(Arrays.toString(myArray));
         int[]newArray=new int[]{1,2,3,4,5};
         System.out.println(newArray.length);
         System.out.println(Arrays.toString(newArray));
    }
}

class StArray{
    public static void main(String[] args) {
        String[] name=new String[5];
        name[0]="Sarina";
        name[1]="Anusha";
        name[2]="Pragya";
        name[3]="Smriti";
        name[4]="Sabina";
        System.out.println(Arrays.toString(name));
    }
}

class arrayloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter a number: ");
            int value = scanner.nextInt();
            a[i] = value;
        }
        System.out.println(Arrays.toString(a));
    }
}

class Stloop{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] names=new String[10];
        for (int i = 0;i<names.length; i++) {
            System.out.println("Enter a string: ");
            String value = scanner.next();
            names[i]= value;
        }
        System.out.println(Arrays.toString(names));
        for (int i = 0;i<names.length; i++) {
            System.out.println("Elements at "+i+" index "+names[i]);
        }
    }
}

class addArray{
    public static void main(String[] args) {
        int[] sum= new int[5];
        sum[0]=12;
        sum[1]=23;
        sum[2]=13;
        sum[3]=22;
        sum[4]=45;
        int add=0;
        for (int i=0;i<sum.length;i++){
            add=add+sum[i];
        }
        System.out.println(add);
    }
}

class primeloop{
    public static void main(String[] args) {
        int [] prime=new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<prime.length;i++){
            System.out.println("Enter a number: ");
            int value = scanner.nextInt();
            prime[i]=value;
        }
        System.out.println(Arrays.toString(prime));
        int countPrime=0;
        for (int i=0;i<prime.length;i++){
            int value = prime[i];
            int count=0;
            for (int j=1;j<=value;j++){
                if (value%j==0){
                    count++;
                }
            }
            if (count==2){
                countPrime++;
            }
        }
        System.out.println(countPrime);
    }
}

class countoddeven {
    public static void main(String[] args) {
        int[] oddEven = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < oddEven.length; i++) {
            System.out.println("Enter a number:");
            int num = scanner.nextInt();
            oddEven[i] = num;
        }
        System.out.println(Arrays.toString(oddEven));
        int countOdd = 0;
        for (int i = 0; i < oddEven.length; i++) {
            int value = oddEven[i];
            int countEven = 0;
            for (int j=1; j<=value; j++){
                if (value%2==0){
                    countEven++;
                }
            }if(value%2!=0){
                countOdd++;
            }
        }
        System.out.println(countOdd);
    }
}

class avg{
    int countOdd = 0;
    class Average{
        public static void main(String[] args) {
            int [] avg = new int[10];
            int sum = 0;
            Scanner scanner = new Scanner(System.in);
            for(int i=0; i<avg.length;i++) {
                int value = scanner.nextInt();
                avg[i] = value;
                sum = sum+avg[i];
            }
            int average = sum/5;
            System.out.println(average);
        }
    }
}

class newfunction{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int value=scanner.nextInt();
        System.out.println(checkValue(value));
    }
    static boolean checkValue(int num){
        int[] myArr=new int[]{1,2,3,4,5};
        for (int i=0;i<myArr.length;i++){
            if (num==myArr[i]){
                return true;
            }
        }
        return false;
    }
}


