package progarmmers;

import java.util.Arrays;

public class 전화번호목록 {
    public static boolean solution(String[] phone_book) {
        // 전화번호부 정렬
        Arrays.sort(phone_book);

        // 정렬된 전화번호부 확인
        for (int i=0; i<phone_book.length-1; i++) {
            // 다음 전화번호의 접두사이면 false
            if (phone_book[i+1].startsWith(phone_book[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
//        String[] phone_book = {"119", "97674223", "1195524421"};
        String[] phone_book = {"97674223", "1195524421", "119"};
        System.out.println(solution(phone_book));
    }
}
