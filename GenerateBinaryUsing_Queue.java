import java.io.*;
import java.util.*;
public class GenerateBinaryUsing_Queue
{
     public static void main(String[] args)  throws Exception
     {
		  BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
		  System.out.println("Enter the Number of Testcase");
		  int t=Integer.parseInt(inp.readLine());
		  while(t-- >0)
		  {
		  	System.out.println("Enter the Number");
		  	int n=Integer.parseInt(inp.readLine());
		  	Queue<String>queue=new LinkedList<String>();
		  	queue.add("1");
		  	while(n-- >0)
		  	{
                String s1=queue.peek();
                queue.remove();
                System.out.print(s1+" ");
                String s2=s1;
                queue.add(s1+"0");
                queue.add(s2+"1");
		  	}
		  	System.out.println();
		  }
	 }
}