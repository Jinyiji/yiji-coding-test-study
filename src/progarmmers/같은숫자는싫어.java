package progarmmers;

public class 같은숫자는싫어 {
    public int[] solution(int []arr) {
        // 중복 제거 리스트 만들기
        List<Integer> list = new ArrayList<Integer>();
        list.add(arr[0]);
        for (int i=1; i<arr.length; i++) {
            if (arr[i]!=arr[i-1]) list.add(arr[i]);
        }

        // 결과를 배열로 만들기
        int[] answer = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
