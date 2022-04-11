package progarmmers;

public class 소수만들기 {
    int answer;
    int arr[];
    public int 소수만들기(int[] nums) {
        answer = 0;
        arr = new int[3];
        dfs(nums, nums.length, 0, 0, 0); // 숫자 3개의 합이 짝수라면 return
        return answer;
    }
    public void dfs(int[] nums, int len, int cnt, int sum,int start) {
        if(cnt == 3) {
            if(sum%2 == 0) return;

            for(int i = 2; i * i <= sum; i++) { //  i*i<sum 조건을 사용하여 소수 판별
                if(sum % i == 0) return;
            }
            answer++;
            return ;
        }
        for(int i = start; i < len; i++) {
            arr[cnt] = nums[i];
            dfs(nums, len, cnt+1, sum+nums[i], i+1);
        }
    }
}
