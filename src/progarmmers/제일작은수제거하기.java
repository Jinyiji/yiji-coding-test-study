package progarmmers;

public class 제일작은수제거하기 {

    public static void main(String[] args) {
        // 배열
        int[] answers = {3};    // 결과 : -1
//        int[] answers = {1,2,3,4,5};    // 결과 : 2, 3, 4, 5
//        int[] answers = {3, 2, 1, 4, 2};    // 결과 : 3, 2, 4, 2

        // 제일 작은 수 제거하기
        int[] answer = solution(answers);

        // 결과  출력
        System.out.print("결과 : ");
        for (int i=0; i<answer.length; i++) {
            if (i>0) System.out.print(", ");
            System.out.print(answer[i]);
        }
    }

    // 제일 작은 수 제거하기
    public static int[] solution(int[] arr) {
        int[] answer = {};

        // 배열이 한 개인 경우 -1 리턴
        if(arr.length == 1){
            answer = new int[] {-1};
            return answer;
        }

        // 최소값 제거한 배열 정의
        answer = new int[arr.length -1];
        
        // 최소값 계산
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]) min = arr[i];
        }

        // 최소값 제거한 배열 구하기
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(min == arr[i]) continue;
            answer[j] = arr[i];
            j++;
        }

        return answer;
    }
}
