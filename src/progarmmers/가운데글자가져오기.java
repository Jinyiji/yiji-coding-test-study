package progarmmers;

public class 가운데글자가져오기 {
    public String solution(String s) {
        String answer = "";

        // 문자열 길이
        int len = s.length();

        if (len%2 == 0) {
            // 문자열 길이가 짝수이면
            answer = s.substring(len/2-1, len/2+1);
        } else {
            // 문자열 길이가 홀수이면
            answer = s.substring((len-1)/2, (len+1)/2);
        }

        return answer;
    }
}
