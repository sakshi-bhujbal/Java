package NumberPrograms;

public class AutomorphicNumber{
    static boolean isAutomorphic(int num){//76
        int square=num*num; //5776

        while(num>0){       //(76>0)        (7>0)       (0>0)-->false
            if(num % 10 != square % 10)         //76%10 != 5776%10    -->6!=6   7%10 != 577%10-->7!=7
                return false;
                num=num/10;                     //76/10-->7            7/10-->0
                square=square/10;               //5776/10-->577         577/10-->57
            
           }
        return true;
    }    
    public static void main(String args[]){
        System.out.println(isAutomorphic(76));
        System.out.println(isAutomorphic(23));
    }
}
