package Strings;
import java.util.*;
public class DemoStringBuilder {
    public static void main(String args[]){
    StringBuilder sb=new StringBuilder("Sakshi");
    System.out.println(sb);
    System.out.println(sb.charAt(1));
    System.out.println(sb.insert(1,'a'));
    sb.setCharAt(3,'s');
    System.out.println(sb);
    sb.delete(2,4);
    System.out.println(sb);
    sb.append("b");
    sb.append("h");
    sb.append("ujbal");
    System.out.println(sb);
    System.out.println(sb.length());
}

}