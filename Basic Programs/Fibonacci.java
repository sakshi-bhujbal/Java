// public class Fibonacci {
//     public static void main(String args[]){
//         int num1=0,num2=1;
//         System.out.println(num1);
//         System.out.println(num2);
//         for(int i=2;i<10;i++){
//             int num3=num1+num2;
//             num1=num2;
//             num2=num3;
//             System.out.println(num3); 
//         }
//     }
// }


class Fibonacci{
    static int n1=0,n2=1;
    static void FiboSeries(int count){
        if(count>0){
        int n3=n1+n2;
        n1=n2;
        n2=n3;
        System.out.print(" "+n3);
        FiboSeries(count-1);
    }
}

public static void main(String args[]){
    int count=10;
    System.out.println(n1+" "+n2);
    FiboSeries(count-2);
}
}