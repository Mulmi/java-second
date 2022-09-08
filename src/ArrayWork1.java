
import java.util.ArrayList;
public class ArrayWork1 {
    public static void main(String[] args) {
        //create arraylist to store  4 fruits name & print details.

        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("peach");
        fruits.add("grapes");

        for (String fruit:fruits){
        System.out.println(fruit);
    }
}}
