enum Gender{Male,Female,Others}
public class GenderEnum {
    //•	Write a java program to create an enum class for gender [male, female, others] and print all values.

    String name;
    Gender genders;

    void display(){
        System.out.println("name is "+ this.name);
        System.out.println("gender is "+this.genders);
    }
}

class GenderEnumWork{
    public static void main(String[] args) {
        GenderEnum g=new GenderEnum();
        g.name="Mary";
        g.genders=Gender.Female;

        g.display();


    }

}
