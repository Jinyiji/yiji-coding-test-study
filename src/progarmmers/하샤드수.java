package progarmmers;

public class 하샤드수 {
    public boolean 하샤드수(int x) {
        String str = x + "";  // ""를 더해주어 String형으로 바꿨다.
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - '0';  // int형으로 만들어주기위해 char형을 아스키코드가 아닌 '0'을 빼주었다.
        }
        return x % sum == 0;
    }
}
