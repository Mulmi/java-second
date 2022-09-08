public class Camera {
    //•	Write a java program to create a class Camera with private properties [id, brand, color, price].

    private int id;
    private String brand;
    private String color;
    private int price;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



}

class CameraWork{
    public static void main(String[] args) {
        //Create a getter and setter to get and set values. Also, create 3 objects of it and print all details.

        Camera c1=new Camera();
        Camera c2=new Camera();
        Camera c3=new Camera();

        c1.setId(23);
        c1.setBrand("Cannon");
        c1.setColor("Black");
        c1.setPrice(1200);

        c2.setId(33);
        c2.setBrand("Sony");
        c2.setColor("Grey");
        c2.setPrice(1500);

        c3.setId(50);
        c3.setBrand("pixel");
        c3.setColor("Grey");
        c3.setPrice(2000);

            System.out.println("id is " +c1.getId());
            System.out.println("brand is " +c1.getBrand());
            System.out.println("color is " +c1.getColor());
            System.out.println("price is " +c1.getPrice());
        System.out.println("\n");

        System.out.println("id is " +c2.getId());
        System.out.println("brand is " +c2.getBrand());
        System.out.println("color is " +c2.getColor());
        System.out.println("price is " +c2.getPrice());
        System.out.println("\n");

        System.out.println("id is " +c3.getId());
        System.out.println("brand is " +c3.getBrand());
        System.out.println("color is " +c3.getColor());
        System.out.println("price is " +c3.getPrice());
    }}


