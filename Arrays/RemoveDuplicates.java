package Arrays;

public class RemoveDuplicates {
    public static void main(String args[]){
    char ch[]={'s','a','k','s','h','i'};
    for(int i=0;i<ch.length;i++){
        for(int j=0;j<ch.length-1;j++){
            if(ch[j]==ch[j+1]){
                break;
            }
        }
    }
    for(int i=0;i<ch.length;i++)
    System.out.println(ch[i]);
}
}