import java.util.*;
import java.lang.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class ExtractString
{
	public static void main(String as[])
	{
		Scanner s=new Scanner(System.in);
		String input=s.nextLine();
		Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
        Matcher m = r.matcher(input);
			
			if(m.find()){
				String result=m.group(2);
		System.out.println(result);

		
			}
						
		}
}