import java.util.*;
class Roots{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       double a = sc.nextDouble();
       double b = sc.nextDouble();
       double c = sc.nextDouble();
       double determinant = (b*b-4*a*c);
       double d = Math.sqrt(determinant);
       double root1;
       double root2;
      
       
       if(determinant == 0){
        root1 = root2 = -b/(2*a);
        System.out.format("root1=root2=%.2f",root1);
       System.out.println("\nroots are real and equal");
       }
       else if(determinant> 0){
       root1 = (-b+d)/2*a;
       root2 = (-b-d)/2*a;
       System.out.format("root1=%.2f,root2=%.2f",root1,root2);
       System.out.println("roots are real and distinct");
       }
       else if(determinant < 0) {
       double real = -b/(2*a);
       double imaginary = Math.sqrt(-determinant)/(2*a);
       System.out.format("root1=%.2f+i%.2f",real,imaginary);
       System.out.format("\nroot2=%.2f-i%.2f",real,imaginary);
       System.out.println("\nroots are complex and imaginary");
       }
    }
}
