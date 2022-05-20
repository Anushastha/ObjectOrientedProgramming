import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListImplementation {
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();  //creating arraylist
       //adding objects in arraylist
        myArrayList.add(0,5);
        myArrayList.add(1,6);
        myArrayList.add(2,7);
        myArrayList.add(3,8);
        myArrayList.add(4,9);
        //printing arraylist
//        System.out.println(myArrayList);
        System.out.println(myArrayList.get(4));   //4th index ko value get gareko
        myArrayList.add(1,54);   //index afai milaucha
    }
}

//string arraylist
class strArraylist{
    public static void main(String[] args) {
        ArrayList<String> newArray=new ArrayList<String>();
        newArray.add("Apple");
        newArray.add("Ape");
        newArray.add("Aame");
        newArray.add("Anda");
        newArray.add("Aour");
//        System.out.println(newArray);
//        newArray.set(1,"Aapour");  //setting new value in existing index
//        System.out.println(newArray.size());  //arraylist ko size
        newArray.remove(1);     //via index
        newArray.remove("Aour");  //specific element
    }
}

class newArray{
    public static void main(String[] args) {
        ArrayList<String> arrList=new ArrayList<String>(4);
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<5; i++){
            String value = scanner.next();
            arrList.add(value);
        }
        System.out.println(arrList);
        Collections.sort(arrList);     //ascending order
        Collections.sort(arrList,Collections.reverseOrder());     //descending order
        System.out.println(arrList);
    }
}

//WAP to create an arraylist of size 10 where you have to add integer values and return the sum of the multiples
//of 2. You gave to create a function over here which returns the sum and initializes the arraylist.
class sumArr {
    public static void main(String[] args) {
        System.out.println(checkNumbers());
    }
    public static int checkNumbers() {
        ArrayList<Integer> sumList = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sumList.add(scanner.nextInt());
        }
        for (int j = 0; j < sumList.size(); j++) {
            if (sumList.get(j) % 2 == 0) {
                sum += sumList.get(j);
            }
        }
        return sum;
    }
}

//WAP to create an arraylist of size 10 where you have to add string values and return the sorted arraylist in ascending order from a function
//where you created it.
class acsArr{
    public static void main(String[] args) {
        System.out.println(checkList());
    }
    public static ArrayList<String> checkList(){
        ArrayList<String> strArr = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<11; i++){
            String value = scanner.next();
            strArr.add(i,value);
        }
        System.out.println(strArr);
        Collections.sort(strArr);
        return strArr;
    }
}

////WAP to create a function which accepts arraylist of integer as parameter which has size of 10. In the function you have to write the logic to
////check whether the elements of arraylist are prime or not. If yes then you have to sum all the prime numbers.
////syntax of function
////static int checkPrime(pass arrayList as parameter)
class para {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for(int i=0;i<5;i++){
            System.out.println("Enter the number: ");
            int value = scanner.nextInt();
            ar.add(i,value);
        }
        System.out.println(ar);
        System.out.println(sumPrime(ar));

    }
    static int sumPrime(ArrayList<Integer> arr){
        int count=0;
        int sum=0;
        for(int i=1; i<arr.size();i++){
            if(arr.get(i)%i==0){
                count+=1;
            }
            if(count==1){
                sum+=arr.get(i);
            }
        }
        return sum;
    }
}


