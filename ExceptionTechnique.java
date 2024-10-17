class ExceptionTechnique{
public static void main(String []args){
int a =5;
try{
	System.out.println(a/0);
	}
catch(ArithmeticException e){
	System.out.println("arithmetic exception throws");
	}
finally{
	System.out.println("executed");
}
}
}
