import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.Scanner;

class Main{
    public static void main(String[] args){

        Scanner myObj = new Scanner(System.in);

        int size = myObj.nextInt();
        int[] numbers = new int[size];
        int i=0;
        while(myObj.hasNext() && i<size-1){
            numbers[i]=myObj.nextInt();
            i++;
        }
        if (i == 0) {
            System.out.println(0);
            System.exit(0);
        }

        if (args[0].equals("--add")) {
            add(numbers);
        } else if (args[0].equals("--multiply")) {
            multiply(numbers);
        } else {
            System.out.println("Wrong parameters.");
            System.exit(0);
        }

    }

    static void add(int[] numbers){
        int result = IntStream.of(numbers).sum();
        System.out.println(result);
    }

    static void multiply(int[] numbers){
        int result = 1;
        for (int n : numbers) {
            result *= n;
        }
        System.out.println(result);
    }
}
