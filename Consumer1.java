import java.util.function.Consumer;

class Product {
  private double price = 0.0;

  public void setPrice(double price) {
    this.price = price;
  }
  public void printPrice() {
    System.out.println(price);
  }
}
//Driver class
public class Consumer1 {
  public static void main(String[] args) {
	  Consumer<Product> xyz = p -> p.setPrice(5.9); //lambda expression
	  Product p1 = new Product();
	  xyz.accept(p1);
      p1.printPrice();
  }
}