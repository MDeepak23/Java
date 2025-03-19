import java.util.*;
class rand{
	public static void main(String []args){
		Random r = new Random();
		int min=0,max=1;
		Scanner sc = new Scanner(System.in);
		int cost[][] = new int[5][5];
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
			
			cost[i][j] = r.nextInt((max-min+1))+min;
		}
		}
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
		System.out.print(cost[i][j]+" ");
}
  System.out.println();
}
}
}
