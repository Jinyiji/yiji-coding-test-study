package progarmmers;

public class 정수제곱근판별 {
    public long 정수제곱근판별(long n) {
        long answer = 0;
        int sqrt = (int) Math.sqrt(n); // sqrt 변수 선언

        if (Math.pow(sqrt, 2) == n) { // sqrtdml 제곱 지수가 2
            answer = (long) Math.pow(sqrt + 1, 2); //  정수 x의 제곱이라면 x+1의 제곱을 리턴
        } else //  정수 x의 제곱이 아니라면 -1을 리턴
            answer = -1;

        return answer;
    }
}
