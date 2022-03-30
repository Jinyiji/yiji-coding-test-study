package progarmmers;

public class 핸드폰번호가리기 {
    public String 핸드폰번호가리기(String phone_number) {
        char[] charactor = phone_number.toCharArray();

        for(int i = 0; i < charactor.length - 4; i++)  // 전화번호의 뒷 4자리를 제외
            charactor[i] = '*';  // 그 외 숫자 전부 *처리

        return String.valueOf(charactor);
    }
}
