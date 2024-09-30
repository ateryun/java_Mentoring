package sourceCode_2;

import java.util.Scanner;

public class MP02_1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c[] = new char[5];
        c[0] =sc.next().charAt(0);
        c[1] =sc.next().charAt(1);
        c[2] =sc.next().charAt(2);
        c[3] =sc.next().charAt(3);
        c[4] =sc.next().charAt(4);
        double hashValue =c[0] * Math.pow(31, 4)
                + c[1] * Math.pow(31, 3)
                + c[2] * Math.pow(31, 2)
                + c[3] * 31
                + c[4];
        System.out.printf("문자열 %c%c%c%c%c의 해시 값은 %.2f입니다",
                c[0], c[1], c[2], c[3], c[4], hashValue);
    }
    }
