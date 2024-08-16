import java.util.*;
public class StackAL {
    static class Stackal{
        static ArrayList<Integer> list =new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }

        //push
        public static void push(int data){
            list.add(data);
        }

        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
        
    }
    public static void main(String args[]){
        Stackal sa=new Stackal();
        sa.push(1);
        sa.push(2);
        sa.push(3);
        
        while(!sa.isEmpty()){
            System.out.println(sa.peek());
            sa.pop();
        }
        
    }   
    
}
