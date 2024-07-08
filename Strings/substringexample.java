package Strings;

public class substringexample {
    public static void main(String args[]){
        String str="Sakshi";
        String str1="";
        int startfrom=1,endat=4;
        for(int i=startfrom;i<=endat;i++){
            str1=String.valueOf(str.charAt(i));
            /*
             The String.valueOf(char) method converts a character (of type char) into its corresponding string representation. It’s particularly useful when you want to concatenate a character with other strings or convert it to a string for further processing.
            In the context of the previous example, String.valueOf(str.charAt(i)) is used to convert the character at index i in the string str to a string. This allows you to build the newStr by appending individual characters.
            For instance, if str.charAt(i) evaluates to the character 'l', String.valueOf(str.charAt(i)) would yield the string "l".
             */
            System.out.print(str1);
        }
        
    }


}
