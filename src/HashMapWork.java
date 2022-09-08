import java.util.HashMap;

public class HashMapWork {
    //create hashmap weekly expenses & store value.print details.

    public static void main(String[] args) {
                HashMap<String, Double> weeklyExpenses = new HashMap<String, Double>();
                weeklyExpenses.put("Sunday",100.0);
                weeklyExpenses.put("Monday",120.0);
                weeklyExpenses.put("Tuesday",100.0);
                weeklyExpenses.put("Wednesday",190.0);
                weeklyExpenses.put("Thursday",130.0);
                weeklyExpenses.put("Friday",140.0);
                 weeklyExpenses.put("Saturday",140.0);


               for (String e: weeklyExpenses.keySet()){
                   System.out.println(e+" expenses is "+weeklyExpenses.get(e));
               }}}



//                System.out.println(weeklyExpenses.get("Sunday"));
//                System.out.println(weeklyExpenses.get("Monday"));
//                System.out.println(weeklyExpenses.get("Tuesday"));
//                System.out.println(weeklyExpenses.get("Wednesday"));
//                System.out.println(weeklyExpenses.get("Thursday"));
//                System.out.println(weeklyExpenses.get("Friday"));
//                System.out.println(weeklyExpenses.get("Saturday"));






