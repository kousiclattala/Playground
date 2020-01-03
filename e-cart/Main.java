//import required packages here
import java.util.Scanner;
class Item
{
  private int price;
  public void setPrice(int price)
  {
    this.price = price;
  }
  public int getPrice()
  {
    return price;
  }
}
   
class Customer 
{
  private String product;
  private int quantity;
  public void setProduct(String product)
  {
  	this.product = product;
  }
  public String getProduct()
  {
  	return product;
  }
  public void setQuantity(int quantity)
  {
  	this.quantity = quantity;
  }
  public int getQuantity()
  {
  	return quantity;
  }
}

class Bill 
{
  public int total(int p, int q)
  {
    int r = p * q;
    return r;
  }
}
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String product = sc.nextLine();
    int price = sc.nextInt();
    int quantity = sc.nextInt();
    Item i = new Item();
    i.setPrice(price);
    Customer c = new Customer();
    c.setQuantity(quantity);
    int p = i.getPrice();
    int q = c.getQuantity();
    Bill obj = new Bill();
    int r = obj.total(p,q);
    System.out.println("Total Price is :"+" "+ r);
  }
}