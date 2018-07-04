import java.util.*;
class Convert
{
	float f;
	Scanner s=new Scanner(System.in);
	float c=s.nextFloat();
}
class Demo extends Convert
{
	public static void main(String ar[])
	{
		Convert cc=new Convert();
		cc.f=(9*cc.c)/5+32;
		System.out.println(cc.f);
	}
}