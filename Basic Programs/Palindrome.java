
// public class Palindrome {
//    public static void main(String args[]){
//     int number=151;
//     int temp=number;
//     int sum=0;
//     while(number>0){
//         int rem=number%10;
//         sum=sum*10 +rem;
//         number=number/10;
//     }
//     if(temp==sum){
//         System.out.println("The number is palindrome number");
//     }
//     else{
//         System.out.println("Not a palindrome number");
//     }
//    } 
// }
public class Palindrome{
    static void checkPalindrome(int num){
        int temp=num;
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum=sum*10+rem;
            num=num/10;
        } 
        if(temp==sum){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("NOt palindrome");
        }
    }
    public static void main(String args[]){
        checkPalindrome(15561);
    }
}