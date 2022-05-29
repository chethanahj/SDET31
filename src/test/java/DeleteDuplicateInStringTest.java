import java.util.HashSet;

public class DeleteDuplicateInStringTest {

	public static void main(String[] args) 
{
	  String s= "acabcabcaabcabcd";
	  HashSet<Character> hs=new HashSet<Character>();
	  for(int i=0 ;i<s.length();i++)
		{	hs.add(s.charAt(i)); //a b c
		}
	  
	  StringBuffer sb = new StringBuffer();
		for(Character ch: hs)
		{
			sb.append(ch);  //abc
		
		}
		System.out.println(sb);
		
	}
		

}
	
	
	

