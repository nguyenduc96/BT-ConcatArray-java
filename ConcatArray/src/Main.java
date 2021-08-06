import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Nhập kích thước mảng 1 : ");
            int sizeArrayOne = scanner.nextInt();
            int[] arrayOne = createArray(sizeArrayOne);
            for (int i = 0; i < sizeArrayOne; i++) {
                System.out.print("Nhập giá trị " + i + " : ");
                arrayOne[i] = scanner.nextInt();
            }
            System.out.println("Nhập kích thước mảng 2 : ");
            int sizeArrayTwo = scanner.nextInt();
            int[] arrayTwo = createArray(sizeArrayTwo);
            for (int i = 0; i < sizeArrayTwo; i++) {
                System.out.print("Nhập giá trị " + i + " : ");
                arrayTwo[i] = scanner.nextInt();
            }
            int[] arrayThree = concatArray(arrayOne, arrayTwo);
            System.out.println("Mảng 1: " + Arrays.toString(arrayOne));
            System.out.println("Mảng 2: " + Arrays.toString(arrayTwo));
            System.out.println("Mảng mới : " + Arrays.toString(arrayThree));
            break;
        }
    }

    public static int[] createArray(int size){
        int[] array = new int[size];
        return array;
    }

    public static int[] concatArray(int[] arrayOne, int[] arrayTwo){
        int[] newArray = new int[arrayOne.length + arrayTwo.length];
        for (int i = 0; i < newArray.length; i++) {
            if (i < (arrayOne.length)){
                newArray[i] = arrayOne[i];
            }else {
                newArray[i] = arrayTwo[i - arrayOne.length];
            }
        }
        return newArray;
    }
}
