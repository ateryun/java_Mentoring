package sourceCode_2;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("화씨 온도를 입력하세요: ");
        float fahrenheit = sc.nextFloat(); // 입력할 화씨를 입력받음.
        float celsius = ((float) 5/9) *(fahrenheit -32); // 화씨를 입력받은 값을 섭씨로 바꾸는 공식
        System.out.printf("화씨 %.1f도는 섭씨 %.1f도 입니다.", fahrenheit, celsius);
// printf로 하여 섭씨와 화씨에 대해 출력
    }
}
