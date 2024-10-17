class Inbuilt{
public static void main(String []args){
int a =5;
try{
	System.out.println(a/0);
	}
catch(ArithmeticException e){
	System.out.println("arithmetic exception throws");
	}
try{
	int arr[]={1,2,3,4,5};
	System.out.println(arr[10]);
	}
catch(ArrayIndexOutOfBoundsException e){
	System.out.println("out of bound exception throws");
	}
try{
	String name=null;
	System.out.println(name.length());
	}
catch(NullPointerException npe){
	System.out.println("null pointer exception throws");
}
}
}
