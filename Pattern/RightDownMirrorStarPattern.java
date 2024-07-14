package Pattern;

public class RightDownMirrorStarPattern {
    public static void main(String args[]){
        for(int i=1;i<8;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=8-1-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
