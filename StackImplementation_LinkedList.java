import java.io.*;
import java.util.*;
class Stack <T>
{
    class Node // create a Node class 
    {
    	T data;
    	Node next;
    	Node(T n)  // Initialize the data 
    	{
    		this.data=n;
    	}
    }
    Node top;
   Stack()
   {
   	  top=null;
   }
    public boolean isEmpty()
    {
         return(top==null);
    }
    public void push(T key)
    {
        Node newNode=new Node(key); // making new Node 
        if(newNode==null)
        {
        	System.out.println("Stack OverFlow");
        	return ;
        }
        else
        {
        	 if(top==null) // If our LinkedList is Empty 
        {
        	top=newNode;
        }
        else
        {
        	newNode.next=top;
        	top=newNode;
        }
        }
       
    }
    T pop()
    {
         if(top==null) 
         {
         	System.out.println("Stack UnderFlow");
         	return null;
         }
         else
         {
         	T val= top.data;
            top=top.next;
            return val;
         }

    }
    T peek()
    {
      if(top==null)
         {
         	System.out.println("Stack UnderFlow");
         	return null;
         }
         else
         {
         	return top.data;
 
         }
    }
}
public class StackImplementation_LinkedList
{
	public static void main(String[] args)
	{
      Stack<String>st=new Stack<String>();// create a stack which is String type 
     st.push("Deepanshu");
     st.push("Tyagi");
     st.push("LPU");
     System.out.println("String type Stack Content : ");
     while(!st.isEmpty())
     {
     	System.out.print(st.pop()+" ");
     }

     Stack<Integer>st1=new Stack<Integer>();// create a stack which is String type 
     st1.push(1);
     st1.push(2);
     st1.push(3);
     System.out.println("\nInteger Type Stack Content : ");
     while(!st1.isEmpty())
     {
     	System.out.print(st1.pop()+" ");
     }
	}
}