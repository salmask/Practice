import java.util.*;
class CollatzSequence
{
	public static void main(String as[])
	{
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int[] nArray=new int[100];
		int i=1;
		/*boolean flag=false;*/
		if(N<100&&N>0){
		
					nArray[0]=N;
			while(nArray[i-1]!=1)
			{
				/*if(nArray[i]==1){
				System.out.println(nArray[i]);
				}*/
					
				if(nArray[i-1]%2==0)
				{
					nArray[i]=(nArray[i-1])/2;
					
				}
				else if(nArray[i-1]%2!=0&&nArray[i-1]!=1)
				{
				    nArray[i]=3*nArray[i-1]+1;
				}
					System.out.println(nArray[i]);
					i++;		
				}
					
			}
					
		}
		
	}