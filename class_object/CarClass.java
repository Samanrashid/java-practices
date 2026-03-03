class Car{
  String brand;
  String model;
  double price;
  public void showDetails(){
    System.out.println("Brand is :" + brand + " Modal is : " + model + " Price is : " + price);
  }

}

public class CarClass {
  public static void main(String[] args) {
    Car car1 = new Car();
    car1.brand = "Toyota";
    car1.model = "SUB";
    car1.price = 7897534.87f;
    car1.showDetails();

  }
  
}
