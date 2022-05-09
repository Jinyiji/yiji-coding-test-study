package progarmmers;

public class 직사각형별찍기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 세로 b 만큼 반복
        for (int i=0; i<b; i++) {
            // 가로 a 만큼 반복
            for (int j=0; j<a; j++) {
                System.out.print("*");
            }
            // 줄넘김
            System.out.println();
        }
    }
}
