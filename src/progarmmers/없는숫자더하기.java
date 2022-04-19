package progarmmers;

public class 없는숫자더하기 {
    public int solution(int[] numbers) {
        // 1에서 9까지 더한 수 = 45
        int answer = 45;

        // 없는 수 더하기 = 45에서 있는 수를 계속 빼준다
        for(int num: numbers) answer -= num;
        
        return answer;
    }
}
