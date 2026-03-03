
class Rectang{
  int length;
  int width;
  public int area(){
    return length*width; 
  }
  public int perimeter(){
    return 2*length+2*width;
  }
}
public class Rectangular {
  public static void main(String[] args) {
    Rectang rec1 = new Rectang();
    Rectang rec2 = new Rectang();

    rec1.length = 20;
    rec1.width = 30;
    rec2.length = 15;
    rec2.width = 20;

    int area1 = rec1.area();
    int peri1 = rec1.perimeter();

    int area2 = rec2.area();
    int peri2 = rec2.perimeter();
    System.out.println("area of first rectangle is : "+ area1 + " Perimeter is " + peri1);
    System.out.println("area of second rectangle is : "+ area2 + " Perimeter is " + peri2);
  }
  
}
