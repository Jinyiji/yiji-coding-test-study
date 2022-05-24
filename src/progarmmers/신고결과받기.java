package progarmmers;
import java.util.*;
public class 신고결과받기 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String,Integer> cnt = new HashMap<>();
        HashMap<String,Integer> idx = new HashMap<>();

        // 중복문제 해결을 위해 신고 정렬
        Arrays.sort(report);
        String before = "";

        // 각 유저에 대해 신고회수와 인덱스 초기화
        for(int i=0;i<id_list.length;i++) {
            cnt.put(id_list[i],0);
            idx.put(id_list[i],i);
        }

        // 신고 회수 계산
        for(String r : report){
            if(before.equals(r)) continue;  // 중복 신고 제외
            before = r;
            String[] re = r.split(" ");
            cnt.put(re[1],cnt.get(re[1])+1);
        }
        before = "";

        // 메일 회수 계산
        for(String r : report){
            if(before.equals(r)) continue;  // 중복 신고 제외
            before = r;
            String[] re = r.split(" ");
            if(cnt.get(re[1]) >= k) answer[idx.get(re[0])] += 1;
        }
        return answer;
    }
}
