import java.io.PrintStream;
import java.util.Scanner;

/**t
 * Created by student1 on 27.02.17.
 */
public class Main {
    public static void printBinary(int n){
        if(n!=0){
            printBinary(n/2);
            System.out.print(n%2);}
    }
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;

    public static void main(String[] args) {
        printBinary(13);
    }
}
