class Stringbuffer
{
public static void main(String []args) 
{
	StringBuffer sb = new StringBuffer("PRIYANKA MOHAN💞️");
	String message = sb.toString();
	System.out.println(message);
	sb.delete(5,8);
	System.out.println("after delete"+sb);
	sb.deleteCharAt(5);
	System.out.println("after char delete"+sb);
	
}
}
