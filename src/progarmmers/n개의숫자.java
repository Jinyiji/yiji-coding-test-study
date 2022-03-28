package progarmmers;
// 0329 x만큼 간격이 있는 n개의 숫자
public class n개의숫자 {
    public long[] n개의숫자(int x, int n) { // 정수 x와 자연수 n을 입력 받기
        long[] answer = {};
        answer = new long[n];

        for (int i = 0; i < n; i++) {
            answer[i] = x * (long)(i + 1); // i를 long로 형변환
        }
        
        return answer;
    }
}
