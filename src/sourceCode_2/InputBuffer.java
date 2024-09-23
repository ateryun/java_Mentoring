package sourceCode_2;

import java.util.Scanner;

public class InputBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("첫번째 문자열:"+s);
        int n = sc.nextInt(); // nextInt는 공백없음으로 다음 문자열을 뽑는다.
        System.out.println("출력 정수:" +n);
        String s1 = sc.nextLine(); // nextLine은 공백이 있어도 공백과 함께 출력됨.
        System.out.println("나머지 문자열: "+s1);
    }
}
