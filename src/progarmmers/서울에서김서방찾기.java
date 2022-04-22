package progarmmers;

public class 서울에서김서방찾기 {
    public static String solution(String[] seoul) {
        int answer = -1;  // 김서방 위치 초기화

        // 김서방 위치 찾기
        for (int i=0; i<seoul.length; i++) {
            if ("Kim".equals(seoul[i])) {
                answer = i;
                break;
            }
        }
        return "김서방은 " + answer + "에 있다";
    }

    public static void main(String[] args) {

        String[] seoul = {"Jane", "Kim"};

        // 김서방 위치
        String answer = solution(seoul);

        // 결과 출력
        System.out.print(answer);

    }
}

