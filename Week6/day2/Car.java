package week6;

public class Car extends Vechile {

    public Car(String num){
    super(num); // super --> new ParentClass() --> Parent class/object level reference
    System.out.println("This method is executed from child class Constructor");
    }
    @Override
    public void brandName(String bname){
        super.brandName("Hyundai");
        System.out.println("Brand Name from child class is "+bname);
    }

    public static void main(String[] args) {
        Car cr;
        cr = new Car("TN 12 AK 0007");
        cr.brandName("AUDI");
    }

}
