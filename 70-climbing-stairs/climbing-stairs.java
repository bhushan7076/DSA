class Solution {
    public int climbStairs(int n) {
        int prev1=1,prev2=2,curr=0;
        if(n<=2){
            return n;
        }
        for(int i=3;i<=n;i++){
            curr=prev1+prev2;
            prev1=prev2;
            prev2=curr;
        }

        return curr;
    }
}