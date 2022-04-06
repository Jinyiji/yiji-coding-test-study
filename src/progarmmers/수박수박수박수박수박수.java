package progarmmers;

public class 수박수박수박수박수박수 {
    public String 수박수박수박수박수박수(int n) {
        String answer = "";
        for(int i = 1; i <= n; i++) {
            if(i % 2 != 0) answer += "수";   // 2로 나눠 나머지가 0, 짝수이면 "수"
            else answer += "박";             // 나머지가 0이 아닐 시, 홀수로 "박"
        }
        return answer;
    }
}
