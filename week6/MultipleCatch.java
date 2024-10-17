class MultipleCatch{
public static void main(String []args){
int a =5;
try{
	System.out.println(a/0);
	}
catch(ArrayIndexOutOfBoundsException e){
	System.out.println("out of bound exception throws");
	}
catch(ArithmeticException e){
	System.out.println("arithmetic exception throws");
	}
catch(NullPointerException npe){
	System.out.println("null pointer exception throws");
}
}
}
