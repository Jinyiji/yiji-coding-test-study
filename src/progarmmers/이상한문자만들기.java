package progarmmers;

public class 이상한문자만들기 {
    class Solution {
        public String solution(String s) {
            String answer = "";

            // 단어의 몇 번째 문자인지
            int c = -1;
            // 문자열 전체를 훑어서 처리
            for (int i=0; i<s.length(); i++) {
                String _s = s.substring(i, i+1);

                if (_s.equals(" ")) {
                    // 공백이면
                    c = -1;
                } else {
                    // 문자이면
                    c++;
                    if (c%2==0) {
                        // 짝수 인덱스 대문자로
                        _s = _s.toUpperCase();
                    } else {
                        // 홀수 인덱스 소문자로
                        _s = _s.toLowerCase();
                    }
                }
                answer += _s;
            }
            return answer;
        }
    }
}
