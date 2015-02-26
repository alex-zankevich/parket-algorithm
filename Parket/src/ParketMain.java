import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by user on 26.02.2015.
 */
public class ParketMain {
    public static void main(String[] args) throws FileNotFoundException {
        long f_7 = 5;
        long f_1 = 1;
        Scanner sc = new Scanner(new FileInputStream("in.txt"));
        PrintStream ps = new PrintStream(new FileOutputStream("out.txt"));
        int n = sc.nextInt();
        if (n % 2 != 0){
            ps.println(0);
        }else {
            long f_7_temp = 0, f_1_temp = 0;
            for (int j = 0; j < (n / 2) - 1; j++) {
                f_7_temp = 5 * f_7 + 4 * f_1;
                f_1_temp = f_7 + 2 * f_1;
                f_7 = f_7_temp;
                f_1 = f_1_temp;
            }
            ps.println(f_7);
        }
    }
}
