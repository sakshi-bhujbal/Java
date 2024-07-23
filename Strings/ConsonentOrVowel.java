package Strings;
public class ConsonentOrVowel {
    public static void main(String args[]){
        String str="Sakshi Bhujbal";
        char ch[]=str.toCharArray();

        for(char c:ch){
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||c=='A' || c=='E' || c=='I' || c=='O' || c=='U' ){
                System.out.println("vowel: "+c);
            }
            else{
                System.out.println("consonents: "+c);
            }
        }

    }
}
