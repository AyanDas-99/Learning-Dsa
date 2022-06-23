import java.util.Scanner;

public class Main {

    static double sumOfSqrt(float a, float b){
        double sum = Math.sqrt(a) + Math.sqrt(b);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        String name = "Ayan Das";
        int age = 19;
        int height = 170;
        float marks = 99.9f;
        System.out.println(name + " is the name of a software developer and he got "+marks+" marks");

//        Taking user input
//        Scanner scan = new Scanner(System.in);
//        float input1 = scan.nextFloat();
//        float input2 = scan.nextFloat();
//        System.out.println(sumOfSqrt(input1,input2));

        int arr[] = null;
        arr[0] = 1;
        System.out.println(arr.length);

    }
}
