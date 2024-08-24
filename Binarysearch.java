import java.util.*;
class Binarysearch{
public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the array size:");
	int n = sc.nextInt();
	int a[] = new int[n];
	System.out.println("enter array elements:");
	for(int i=0;i<n;i++){
	a[i]=sc.nextInt();
	}
        System.out.println("enter a key:");
        int key = sc.nextInt();
        int start=0,end=n-1,pos=-1;
        while(start<=end)
        {
        	int mid=(start+end)/2;
        	if(a[mid]==key)
        	{
        		pos = mid+1;
        		break;
        	}
        	else if(key<a[mid])
        	{
        		end = mid-1;
        	}
        	else
        	{
        		start = mid+1;
        	}
        }
        if(pos>0)
        {
        	System.out.println("key is found at "+pos);
        }
        else
        {
        	System.out.println("key is not found");
        }

}
}

