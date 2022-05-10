package progarmmers;

public class _2016년 {
    public String solution(int a, int b) {
        String answer = "";
        String[] day = {"SUN", "MON","TUE","WED","THU","FRI","SAT"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // 2016년 지나간 날짜 수
        int dates = 0;
        for (int i=0; i<a-1; i++) {
            dates += month[i];
        }
        dates += b;

        // 2016년 요일. 1월 1일은 금요일이므로 4를 더해준다.
        int yoil = (dates + 4) % 7;

        answer = day[yoil];

        return answer;
    }
}
