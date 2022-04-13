package progarmmers;

public class 약수의합 {
    public int 약수의합(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                answer += i;
        }
        return answer;
    }
}
