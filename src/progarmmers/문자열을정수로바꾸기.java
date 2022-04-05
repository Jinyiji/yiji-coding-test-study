package progarmmers;

public class 문자열을정수로바꾸기 {
    public int 문자열을정수로바꾸기(String s) {
        int answer = 0;
        answer = Integer.parseInt(s); // string을 정수로 변환해주는 parseInt() 메소드
        return answer;
    }
}
