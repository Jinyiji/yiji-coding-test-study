package progarmmers;

class Solution {
    public String solution(int num) { // 정수 num
        String answer = "";
        if (num % 2 == 0) answer = "Even"; // 나머지 산술 연산자 사용, 짝수일 경우 (0 포함) Even 반환
        else answer = "Odd"; // 짝수가 아닐 경우 Odd 반환
        return answer;
    }
}
