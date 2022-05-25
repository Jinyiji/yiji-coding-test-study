package progarmmers;

public class 주식가격 {
    class Solution {
        public int[] solution(int[] prices) {
            // 결과 초기화
            int[] answer = new int[prices.length];

            // 가격이 떨어지지 않은 기간 계산
            for (int i=0; i<prices.length-1; i++) {
                for (int j=i+1; j<prices.length; j++) {
                    answer[i]++;
                    // 가격이 떨어지진 경우 break;
                    if (prices[i]>prices[j]) break;
                }
            }

            return answer;
        }
    }
}
