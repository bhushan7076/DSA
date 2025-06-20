class Solution {
    public int fib(int n) {
        int a,b,ans=0,count=2 ;
        a=0;
        b=1;
        if(n==1){
            return 1;
        }
        while(count<=n){
            ans=a+b;
            a=b;
            b=ans;
            count++;
        }
        return ans;
    }
}