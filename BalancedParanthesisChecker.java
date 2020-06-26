import java.io.*;
import java.util.*;
public class BalancedParanthesisChecker
{

	public static void main(String[] args) throws Exception
	{
		BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		String str=inp.readLine();
		Stack<Character> st=new Stack<Character>();
		int i=0;
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='[')
			{
				st.push(str.charAt(i));
			}
			else if(str.charAt(i)==')' || str.charAt(i)=='}' || str.charAt(i)==']')
			{
				if(st.isEmpty()) break;
				if((str.charAt(i)==')' && st.pop()=='(')  || (str.charAt(i)=='}' && st.pop()=='{') || (str.charAt(i)==']' && st.pop()=='['))
				{
                      continue;
				}
				else
				{
					break;
				}
			}
		}
		//System.out.println(str.charAt(i)+" "+i);
		if(st.isEmpty()) System.out.println("Stack is Empty");
		if(st.isEmpty()==true &&  i==str.length())
		{
			System.out.println("Balanced");
		}
		else
		{
			System.out.println("Unbalanced");
		}
	}
}