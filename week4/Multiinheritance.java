class A {
public void display() {
	System.out.println("parent class");
	}
}
class Inheritance extends A{
public void run() {
	System.out.println("child class");
	}
}
class Multiinheritance extends Inheritance{
public void execute() {
	System.out.println("multiple inheritance");
	}
public static void main(String []args){
	Multiinheritance obj = new Multiinheritance();
	obj.display();
	obj.run();
	obj.execute();
}
}
