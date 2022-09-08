public class HouseWork {
    //Create a constructor of it and create 3 objects of it. Add them to the list and print all details.


    public static void main(String[] args) {

        House h1=new House(3,"abc",30000);
        House h2=new House(4,"def",33000);
        House h3=new House(5,"ghi",55000);

        h1.display();
        h2.display();
        h3.display();
    }
}
