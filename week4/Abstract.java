abstract class  A
{
    abstract void ARectangle(int l,int b);
    abstract void ACircle(double r);
}
class Area extends A 
{
    void ARectangle(int l,int b){
        System.out.println("area of rectangle "+(l*b));
    }
    void ACircle(double r){
        System.out.println("area of circle "+(3.14*r*r));
    }
}
class Abstract {
    public static void main(String[] args) {
        

    Area obj = new Area();
    obj.ARectangle(2,3);
    obj.ACircle(2.0);
}
}