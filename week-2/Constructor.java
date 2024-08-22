public class Constructor{
Constructor() {
System.out.println("hello,world");
}
Constructor(int a ,int b){
System.out.println(a+b);
}
public static void main(String []args){
Constructor obj1 = new Constructor();
Constructor obj2 = new Constructor(2,3);
}
}
