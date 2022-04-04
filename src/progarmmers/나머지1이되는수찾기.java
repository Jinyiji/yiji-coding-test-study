package progarmmers;

public class 나머지1이되는수찾기 {
    public int 나머지1이되는수찾기(int n) {
        for (int i = 2; i < n; i++) { //  i = 2부터 n까지 반복하며 증가시키기
            if (n % i == 1) { // 나머지가 1이 되면 i를 return
                return i;
            }
        }
        return n;
    }
}
