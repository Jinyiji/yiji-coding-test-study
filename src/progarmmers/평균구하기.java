package progarmmers;

public class 평균구하기 {
    public double 평균구하기(int[] arr) {
        double answer = 0;
        for (int i = 0; i < arr.length; i++)
            answer += arr[i];  // 배열의 모든 정수를 더한다
        return answer/arr.length;
    }
}
