package progarmmers;

public class 자릿수더하기 {
    public int 자릿수더하기(int n) {
        int answer = 0;
        int num = n;

        while(num != 0){  // num(n)이 0이 아닐 때까지 반복
            answer += num % 10; // num을 10으로 나누었을 때의 나머지 값
            num /= 10; // num을 10으로 나눈 나머지값을 answer에 덧셈
        }
        return answer;
    }
}
