import java.util.*;
class GuessNo
{
	public static void main(String ar[])
	{
		int dno=38;
		Scanner s=new Scanner(System.in);
		boolean flag=false;
		while(flag==false)
		{
		int gno=s.nextInt();

		if(dno==gno)
		{

			System.out.println("Guessed number is exactly correct");
		flag=true;
		}
		
		else if(dno<gno)
		{
			System.out.println("Enter less than"+gno);
		}
		else if(dno>gno)
		{
		System.out.println("Enter greater than"+gno);
		}
		}
	}
}