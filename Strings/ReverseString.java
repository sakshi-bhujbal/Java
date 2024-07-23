package Strings;

public class ReverseString {
    public static void main(String args[]){
        String str="Sakshi Bhujbal";
        char ch[]=str.toCharArray();
        String str1=" ";
        for(int i=ch.length-1;i>=0;i--) {
            str1=str1+ch[i];
        }
        System.out.println(str1);
    }
}
