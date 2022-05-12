package progarmmers;

public class 콜라츠추측 {
    public int solution(int num1) {
        int answer = -1;

        // 1일 때는 0 리턴
        if (num1==1) return 0;

        // 오버플로우 방지를 위해 long 형으로 처리
        long num = (long) num1;

        // 500번 시도
        for (int i=0; i<500; i++) {
            if (num%2 == 0) {   // 짝수일 때 처리
                num /= 2;
                // 결과가 1이면 시도횟수 리턴
                if (num==1) {
                    return i+1;
                }
            } else {    // 홀수일 때 처리
                num = num * 3 + 1;
            }
        }

        return answer;
    }
}
