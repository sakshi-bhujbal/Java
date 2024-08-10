package CollectionFramework;
import java.util.*;

public class linkedlistdemo {
    public static void main(String args[]){
   LinkedList<String> list=new LinkedList<String>();
   
   list.addFirst("a");
   list.addFirst("is");
   System.out.println(list);
   list.addFirst("this");
   System.out.println(list);

   list.addLast("list");
   //System.out.println(list);

    System.out.println(list.size());

    // for(int i=0;i<list.size();i++){
    //     System.out.print(list.get(i)+" -> ");
    // }

    // for(String i:list){
    //     System.out.print(i+" -> ");
    // }
    
    list.removeFirst();
    System.out.println(list);
    list.removeLast();
    System.out.println(list);
}
}