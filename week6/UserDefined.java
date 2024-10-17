import java.util.*;
class UserDefined{
public static void check(int age){
if(age<18){
	throw new ArithmeticException();
	}
else{
	System.out.println("eligible");
	}
}

public static void main(String []args){
Scanner sc = new Scanner(System.in);
int age = sc.nextInt();
try{
	check(age);
	}
catch(ArithmeticException ae){
	System.out.println("not eligible");
	}

}
}
