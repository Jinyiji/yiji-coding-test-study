package progarmmers;

public class 자연수뒤집어배열로만들기 {
    public int[] 자연수뒤집어배열로만들기(long n) { // 10,000,000,000이하의 자연수라면 길수도 있기 때문에 long
        char[] arr = new StringBuilder(Long.toString(n)).reverse().toString().toCharArray();
        int[] answer = new int[arr.length];
        for(int i = 0; i < answer.length; i++){
            answer[i] = Character.getNumericValue(arr[i]);
            // 숫자 형식의 유니코드 문자를 배정밀도 부동 소수점 숫자로 변환하는 메소드
        } return answer;
    }
}
