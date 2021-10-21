
import java.util.*;
public class minimum_absolute_diff {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n,i,j;
	System.out.println("Enter the size of the array");
	n=sc.nextInt();
	int a[]=new int [n];
	for(i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	int small=a[0]-a[1];
	if(small<0)
		small=-1*small;
	int diff;
	for(i=0;i<n;i++)
	{
		for(j=i+1;j<n;j++)
		{
			diff=a[i]-a[j];
			if(diff<0)
				diff=-1*diff;
			if(diff<small)
				small=diff;
		}
	}
	System.out.println(small);

	}

}
