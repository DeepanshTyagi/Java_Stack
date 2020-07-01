import java.io.*;
import java.util.*;
public class SortedStack
{
	public static void main(String[] args) throws Exception
	{
       BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
       int n=Integer.parseInt(inp.readLine());
       String line=inp.readLine();
       String str[]=line.trim().split(" ");
       Stack<Integer>st1=new Stack<Integer>();
       Stack<Integer>st2=new Stack<Integer>();
       for(int i=0;i<n;i++)
       {
            st1.push(Integer.parseInt(str[i]));
       }
       while(!st1.isEmpty())
       {
            int temp=st1.pop();
            while(!st2.isEmpty() && st2.peek()>temp)
            {
                  st1.push(st2.pop());
            }
            st2.push(temp);
       }
       while(!st2.isEmpty())
       {
            System.out.print(st2.pop()+" ");
       }
       
	}
}