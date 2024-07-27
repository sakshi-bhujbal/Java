package Recursion;

public class Power {
    public static int printPower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }

        int xPwnm1 =printPower(x,n-1);
        int xPwn= x * xPwnm1;
        return xPwn;
    }

    public static void main(String args[]){
        int x=2,n=5;
        int ans=printPower(x,n);
        System.out.println(ans);
    }
}
