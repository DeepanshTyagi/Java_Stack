import java.io.*;
import java.util.*;
class Stack<T>
{
	public static final int MAX=1000;
	int top;
	//T arr[]=(T[])new T[MAX];
	Vector<T> arr=new Vector<T>();
	Stack()
	{
    top=-1;
	}
	boolean isEmpty()
	{
       return(top<0);
	}
	boolean Push(T val)
	{
       if(top>=MAX-1)
       {
       	System.out.println("Stack OverFlow");
       	return false;
       }
       else
       {
       	//arr[++top]=val;
       	arr.add(++top,val);
       	return true;
       }
	}
	T Pop()
	{
		 if(top<0)
		 {
            System.out.println("Stack UnderFlow");
            return null;
		 }
		 else
		 {
            T val=arr.get(top--);
            return val;
        }
    }
	T peek()
	{
           if(top<0)
		 {
            System.out.println("Stack UnderFlow");
            return null;
		 }
		 else
		 {
             T val=arr.get(top);
            return val;
        } 
	}
}
public class StackImplementaion
{
	public static void main(String[] args)
	{
     Stack<String>st=new Stack<String>();// create a stack which is String type 
     st.Push("Deepanshu");
     st.Push("Tyagi");
     st.Push("LPU");
     System.out.println("String type Stack Content : ");
     while(!st.isEmpty())
     {
     	System.out.print(st.Pop()+" ");
     }
        Stack<Integer>st1=new Stack<Integer>();// create a stack which is String type 
     st1.Push(1);
     st1.Push(2);
     st1.Push(3);
     System.out.println("\nInteger Type Stack Content : ");
     while(!st1.isEmpty())
     {
     	System.out.print(st1.Pop()+" ");
     }
	}
}