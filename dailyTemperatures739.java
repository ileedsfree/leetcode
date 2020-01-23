class Solution {
    public int[] dailyTemperatures(int[] t) {
        int n = t.length;
        int[] ans = new int[n];
        ans[n-1] = 0;
        for(int i = n-2;i>=0;i--){
            for(int j = i+1; j < n;j+=ans[j]){
                if(t[j] > t[i]){
                    ans[i] = j-i;
                    break;
                }
                else if(ans[j] == 0){
                    ans[i] = 0;
                    break;
                }
            }
        }
        return ans;  
    }
}