//print 1-5
public class DoWhileIteration {
    public static void main(String[] args) {
        int num=1;
        do
        {
            System.out.println(num);
            num++;
        }while(num<=5);
    }
}

//odd even
class oddevencount {
    public static void main(String[] args) {
        int i = 1;
        int evencount = 0;
        int oddcount = 0;
        do {
            if (i % 2 == 0) {
                evencount++;
            } else {
                oddcount++;
            }
            i++;
        } while (i < 18);
        if (evencount < oddcount) {
            System.out.println("There are more even numbers.");
        } else {
            System.out.println("There are more odd numbers.");
        }
    }
}




