package progarmmers;

public class 시저암호 {
    public String solution(String s, int n) {
        String answer = "";

        // 암호화
        for (int i=0; i<s.length(); i++) {
            // 문자열에서 i번째 위치의 한 문자 뽑기
            String _s = s.substring(i, i+1);
            // char형 문자
            char c = s.charAt(i);

            if (_s.matches("[A-Z?]")) {
                // 대문자일 때 밀어내기
                answer += Character.toString((char)('A' + (c - 'A' + n)%26));
            } else if (_s.matches("[a-z]")) {
                // 소문자일 때 밀어내기
                answer += Character.toString((char)('a' + (c - 'a' + n)%26));
            } else {
                // 영문자 아닐 때(공백일 때) 안 밀어냄
                answer += _s;
            }
        }
        return answer;
    }
}
