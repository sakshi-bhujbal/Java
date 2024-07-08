package Strings;

public class LetterReplace {
    public static void main(String args[]){
        String str="Hello Minnie,welcome to the world!";
        String result="";
        // String result=str.replace('e','i');
        // System.out.println(result);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='e'){
                result+='i';
            }
            else{
                result+=str.charAt(i);
            }
        }
            System.out.print(result);
        
    }
}
