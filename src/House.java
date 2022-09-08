public class House {
    //•	Write a java program to create a class House with properties [id, name, price].
    //Create a constructor of it and create 3 objects of it.
    int id;
    String name;
    int price;
    House ( int id,String name,int price) {
    this.id=id;
    this.name=name;
    this.price=price;
}

void display(){
    System.out.println("id is " + this.id);
    System.out.println("the name is " +this.name);
    System.out.println("the price is " +this.price);
    System.out.println("..\n");
}
}





