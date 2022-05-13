package progarmmers;

public class 부족한금액계산하기 {
    public long solution(int price, int money, int count) {
        // 리턴할 값
        long answer = -1;

        // 이용료 계산
        long sum = 0;
        for (int i=1; i<=count; i++) {
            sum += i;
        }
        sum *= price;

        // 모자라는 금액 계산
        answer = sum - money;

        // 부족하지 않으면 0 리턴
        if (answer<0) return 0;

        return answer;
    }
}
