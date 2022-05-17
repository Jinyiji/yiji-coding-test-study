package progarmmers;

public class 나누어떨어지는숫자배열 {
    public int[] solution(int[] arr, int divisor) {
        // 나누어 떨어지는 값을 리스트에 추가
        List<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<arr.length; i++) {
            if (arr[i]%divisor == 0) {
                list.add(arr[i]);
                // answer[answer.length] = arr[i];
            }
        }
        // 해가 없다면 -1을 리스트에 넣는다.
        if (list.size()==0) list.add(-1);

        // 리스트 값을 배열에 넣기
        int[] answer =  new int[list.size()]; // 크기가 3인 배열 생성
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        // 오름차순 정렬
        Arrays.sort(answer);

        return answer;
    }
}
