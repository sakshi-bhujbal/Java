package Arrays;
public class ArrayAsStaticfield {
    private static int[] staticArray={1,2,3,4,5};

    public static void printStaticArray(){
        for (int i:staticArray){
            System.out.println(i);
        }
    }

    public static void main(String args[]){
        ArrayAsStaticfield.printStaticArray();
    }
}
