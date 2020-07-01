import java.io.*;
import java.util.*;
public class PostFixEvaluation
{
	public static void main(String[] args) throws Exception
	{
       BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
       String exp=inp.readLine();
       Stack<Integer>st=new Stack<Integer>();
       for(int i=0;i<exp.length();i++)
       {
            if(Character.isDigit(exp.charAt(i))) 
            st.push(exp.charAt(i) - '0');
       	else
       	{
       		int n1=st.pop();
       		int n2=st.pop();
       		int op=exp.charAt(i);
             switch(op)
             {
             	case '+':
             	   st.push(n2+n1);
             	   break;
             	case '-':
             	   st.push(n2-n1);
             	   break;
             	case '*':
             	   st.push(n2*n1);
             	   break;
             	case '/':
             	   st.push(n2/n1);

             }

       	}
       }
       System.out.println(st.pop());
	}
}