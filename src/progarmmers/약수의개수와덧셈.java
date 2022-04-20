package progarmmers;

public class 약수의개수와덧셈 {

    public static void main(String[] args) {
        int left = 24;
        int right = 27;
        int result = solution(left, right);
        System.out.print("결과 : " + result);
    }

    public static int solution(int left, int right) {
        int answer = 0;

        // 제곱수인 경우만 약수의 개수가 홀수임
        for (int i=left; i<=right; i++) {
            int sqr = (int) Math.sqrt(i);
            if (sqr * sqr ==i)  // 제곱수이면
                answer -= i;    // 약수의 개수가 홀수인 경우는 뺀다
            else
                answer += i;    // 약수의 개수가 짝수인 경우는 더한다
        }
        return answer;
    }
}
