package sourceCode_2_practice;
import java.lang.Math;
import java.util.Scanner;

public class practice_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1, x2, y1;
        x1 = sc.nextInt();
        x2 = sc.nextInt();
        y1 = sc.nextInt();
        int a = x2 - x1;
        int x3 = (x1 + x2) / 2;
        double y2_height = y1 + Math.sqrt(3.0) / 2 * a;
        double area = Math.sqrt(3.0) / 4 * Math.pow(a, 2);
        System.out.println("(x3,x2) : (" + x3 + ", " + y2_height + ")");
        System.out.println("area :" + area);
        double X_distence = Math.pow((x2 - x1), 2);
        double Y_distence = Math.pow((y2_height - y1), 2);
        double distence = Math.sqrt(X_distence + Y_distence);
        System.out.println("distence : " + distence);
    }


}
