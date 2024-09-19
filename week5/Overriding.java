class A{
public void msg()
 {
	System.out.println("Good Morning");
 }
}
class Overriding extends A{
 public  void msg()
 {
     System.out.println("Good Afternoon");
  }
  public static void main(String []args)
  {
  		Overriding obj = new Overriding();
  		obj.msg();
  }
}
