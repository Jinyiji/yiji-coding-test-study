package progarmmers;
import java.util.Arrays;
import java.util.stream.IntStream;

public class 로또의최고순위와최저순위 {
    class Solution {
        public int[] solution(int[] lottos, int[] win_nums) {
            int[] answer = new int[2];

            // 0 개수
            int zero = 0;
            // 일치하는 개수
            int ok = 0;
            // 0 개수와 일치하는 개수 계산
            for (int i=0; i<6; i++) {
                final int lotnum = lottos[i];
                if (lottos[i]==0) {
                    // 0 개수 추가
                    zero++;
                } else {
                    // 일치하는 개수 추가
                    if (IntStream.of(win_nums).anyMatch(x -> x == lotnum)) ok++;
                }
            }
            // 순위 계산
            answer[0] = order(ok+zero);
            answer[1] = order(ok);

            return answer;
        }

        // 일치하는 개수에 따른 순위 리턴
        private int order(int ok) {
            if (ok>1)
                return 7-ok;
            else
                return 6;
        }
    }
}
