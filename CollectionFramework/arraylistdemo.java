package CollectionFramework;
import java.util.*;
public class arraylistdemo {
    public static void main(String args[]){
        ArrayList <Integer> list= new ArrayList<Integer>();
        list.add(8);
        list.add(0);
        list.add(3);
        list.add(4);
        System.out.println(list);

        int element=list.get(1);
        System.out.println(element);

        list.remove(3);
        System.out.println(list);

        list.set(1,2);
        System.out.println(list);

        int size=list.size();
        System.out.println(size);

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        for(int i:list){
            System.out.print(i+" ");
        }
        
        Collections.sort(list);
        System.out.println(list);
    }
}
