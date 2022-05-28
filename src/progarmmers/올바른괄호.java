package progarmmers;

public class 올바른괄호 {
    boolean solution(String s) {
        boolean answer = true;

        // 여는 괄호 숫자
        int g1 = 0;
        // 닫는 괄호 숫자
        int g2 = 0;

        // 계산
        for (int i=0; i<s.length(); i++) {
            String c = s.substring(i, i+1);
            if (c.equals("(")) {
                g1++;
            } else {
                if (g2>=g1) return false;
                g2++;
            }
        }
        if (g2!=g1) return false;

        return answer;
    }
}
