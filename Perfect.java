import java.util.*;
class Perfect
{
	public static void main(String ar[])
	{
	int pno;
	Scanner s=new Scanner(System.in);
	pno=s.nextInt();
	int i=1;
	int sum=1;
	for(i=2;i<pno;i++)
	{
		int div=pno%i;
		if(div==0)
		{
			
			sum=sum+i;
		}
				}
				if(pno==sum)
				{
					System.out.println(pno+"is perfect number");
				}
				else 
				{
					System.out.println(pno+"is not perfect number");
				}
	}
}