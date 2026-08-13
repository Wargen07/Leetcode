class Solution {
    public double myPow(double x, int n) {
        long n1 = n ;
        return helper(x,n1);
    }
    public double helper(double x, long n){
        if(n==0) return 1 ;
        if(n<0) return 1/helper(x,-n) ;
        double half = helper(x,n/2) ;
        if(n%2 == 0) return half * half ;
        else return half * half * x ;
    }
}