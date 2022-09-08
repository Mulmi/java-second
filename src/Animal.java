public class Animal {
    //•	Write a java program to create a class Animal with properties [id, name, color].
    //Create another class called Cat and extends it from Animal. Add new properties sound in String
//Create an object of a Cat and print all details.
    int id;
    String name;
    String color;

    void display() {
        System.out.println("id is " + this.id);
        System.out.println("name is " + this.name);
        System.out.println("color is " + this.color);
    }}

    class Cat extends Animal{
        String sound;

        void printdetails(){
            display();
            System.out.println("Cat sound is meow meow ");
        }
    }

class AnimalWork{
    public static void main(String[] args) {

        Cat c = new Cat();

        c.id = 2;
        c.name = "ro";
        c.color = "white";

        c.printdetails();
    }}











