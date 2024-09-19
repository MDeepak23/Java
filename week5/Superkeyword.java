class A{
public void msg()
 {
	System.out.println("Good Morning");
 }
}
class Superkeyword extends A{
 public  void msg()
 {
     super.msg();
     System.out.println("Good Afternoon");
  }
  public static void main(String []args)
  {
  		Superkeyword obj = new Superkeyword();
  		obj.msg();
  }
}
