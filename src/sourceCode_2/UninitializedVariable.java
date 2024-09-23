
package sourceCode_2;
public class UninitializedVariable {
    public static void main(String[] args) {
        //int num; //초기값이 없다면 오류가 남.
        int num = 3;

        System.out.println("num = " +num);
        NumCount.main(null);
    } // c언어에서는 만약 무엇을 추가하고 싶을때는 %d, i같은 느낌으로 해야되지만, +i를 느낌으로 해야함.
}

class NumCount {
    public static void main(String[] args) {
        int num, sum =0;
        for (num = 0; num<10; num++) {
            sum +=num;
        }
        System.out.println("NumCount = " +sum);
    }
}