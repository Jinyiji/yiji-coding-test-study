package progarmmers;

public class 내적 {
    public int 내적(int[] a, int[] b) {
        int answer = 0;
        for(int i = 0; i < a.length; i++) {
            answer += a[i] * b[i]; // 같은 인덱스의 a와 b의 내적을 계산
        }
        return answer;
    }
}
