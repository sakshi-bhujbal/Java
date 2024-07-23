package Strings;

public class StringRotation {
    public static boolean checkRotation(String st1,String st2){
        if(st1.length()!=st2.length())
        return false;
        
        String st3=st1+st1;
        if(st3.contains(st2))
            return true;
        else 
            return false;
    }

    public static void main(String args[]){
        String st1="avajava";
        String st2="javaava";
        System.out.println("Checking if string 2 is rotation of string 1");

        if(checkRotation(st1,st2)){
            System.out.println("String1 "+st1+" is rotation of string 2 "+st2);
        }
        else{
            System.out.println("No "+st1+" is not rotation of "+st2);
        }
    }
}
