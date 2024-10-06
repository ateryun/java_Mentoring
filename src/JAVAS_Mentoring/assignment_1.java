package JAVAS_Mentoring;

import java.util.Scanner;

public class assignment_1 {
    //dBm = 10 log(10) (mW) = 10log(10) (W) + 30
    //V = I * R, P = V * I, VI = V^2 / R ,, P = VI = W
    //V와 R을 입력받아 P를 계산한 후, dBm 사용
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("전압(V)을 입력하세요: ");
        double V = sc.nextDouble(); // v 입력

        System.out.print("저항(R)을 입력하세요: ");
        double R = sc.nextDouble(); // R 입력

        // P = V^2 / R (단위 : W)
        double P = (Math.pow(V,2)) / R;
        System.out.printf("전력값: %.2f\n", P);

        // dBm = 10 * log10(W) + 30
        double dBm = 10 * Math.log10(P) + 30;
        System.out.printf("dBm의 계산 값 : %.2f dBm\n",dBm);

    }

}
