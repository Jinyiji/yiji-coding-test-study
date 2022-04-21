package progarmmers;

public class 서울에서김서방찾기 {
    public static int solution(String[] seoul) {
        int answer = -1;  // 리턴할 값 초기화

        // 김서방 위치 찾기
        for (int i=0; i<seoul.length; i++) {
            if ("Kim".equals(seoul[i])) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        String[] seoul = {"Jane", "Kim"};

        // 김서방 위치
        int answer = solution(seoul);

        // 결과 출력
        System.out.print("김서방은 " + answer + "에 있다.");

    }
}

