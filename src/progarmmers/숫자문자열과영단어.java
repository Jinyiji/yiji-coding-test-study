package progarmmers;

public class 숫자문자열과영단어 {
    public int solution(String s) {
        // 숫자 영단어 배열
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        int answer = 0;
        String tmp = "";
        for (int i=0; i<s.length(); i++) {
            // 숫자이면
            if (0<=s.charAt(i) && s.charAt(i)<=9) {
                answer = 10 * answer + s.charAt(i);
            } else {
                // 문자열이면
                tmp += s.substring(i,i+1);
                for (int j=0; j<10; j++) {
                    if (tmp.equals(numbers[j])) {
                        answer = 10 * answer + j;
                        tmp = "";
                        break;
                    }
                }
            }
        }
        return answer;
    }
}
