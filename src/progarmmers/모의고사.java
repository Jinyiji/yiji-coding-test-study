package progarmmers;

import java.util.*;

class 모의고사 {

    public static void main(String[] args) {
        // 정답 배열
//        int[] answers = {1,2,3,4,5};    // 결과 : 1
//        int[] answers = {1, 3, 2, 4, 2};    // 결과 : 1, 2, 3
        int[] answers = {4,5,3,2,1,2,4,1,3,4,4,1,5,5,2,3,1,2,4};    // 결과 : 3

        // 최고 점수 수포자 배열 찾기
        int[] answer = solution(answers);

        // 최고 점수 수포자 출력
        System.out.print("최고 점수 수포자 : ");
        for (int i=0; i<answer.length; i++) {
            if (i>0) System.out.print(", ");
            System.out.print(answer[i]);
        }
    }

    // 최고 점수 수포자 배열에 넣기
    public static int[] solution(int[] answers) {

        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] cnt = new int[3]; // 정답의 개수(사람별 배열)

        for(int i=0; i<answers.length; i++){
            if(answers[i] == person1[i%5]) cnt[0]++;    // 수포자1 정답수(점수)
            if(answers[i] == person2[i%8]) cnt[1]++;    // 수포자2 정답수(점수)
            if(answers[i] == person3[i%10]) cnt[2]++;   // 수포자3 정답수(점수)
        }

        // 가장 높은 점수
        int max = Math.max(cnt[0], Math.max(cnt[1], cnt[2]));

        // 최고 점수인 사람(1~3)
        List<Integer> list = new ArrayList<>();

        // 가장 높은 점수를 받은 사람을 찾는 것
        if(max == cnt[0])
            list.add(1);
        if(max == cnt[1])
            list.add(2);
        if(max == cnt[2])
            list.add(3);

        // 최고 점수인 사람(1~3) 배열
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}