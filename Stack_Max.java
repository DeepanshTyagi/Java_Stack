/*
This Program design a special stack such that maximum element can be found in O(1) time and O(1) extra space
*/
import java.io.*;
import java.util.*;
class MyStack
{
	Stack<Integer> st=new Stack<Integer>();
	int max_ele;
	public int get_Max()
	{
		if(st.isEmpty())
		{
			System.out.println("Stack is Empty");
        	return -1;
		}
		else
		{
			return max_ele;
		}
	}
	public void peek()
	{
        if(st.isEmpty())
        {
        	System.out.println("Stack is Empty");
        	return ;
        }
        int t=st.peek();
        if(t>max_ele)
        {
        	System.out.println(max_ele);
        }
        else
        {
        	System.out.println(t);
        }
	}
	public void push(int x)
	{
        if(st.isEmpty())
        {
        	st.push(x);
        	max_ele=x;
        }
        else
        {
        	if(x<max_ele)
        	{
        		st.push(x);
        	}
        	else
        	{
        		st.push(2*x-max_ele);
        		max_ele=x;
        	}
        }
	}
	public int pop()
	{
       if(st.isEmpty())
       {
       	System.out.println("Stack is Empty");
       	return -1;
       }
       else
       {
       	 int temp=st.peek();
       st.pop();
       	if(temp<max_ele)
       	{
       		return temp;
       	}
       	else
       	{
       		int val=2*max_ele-temp;
       		max_ele=val;
       		return val;
       	}
       }
	}
}
public class Stack_Max
{
	public static void main(String[] args)
	{
       MyStack stack=new MyStack();
       stack.push(1);
       stack.push(2);
       stack.push(3);
       stack.push(64);
       stack.push(5);
       System.out.println("Pooped Element is :"+stack.pop());
        System.out.println("Max Element is :"+stack.get_Max());
        System.out.println("Pooped Element is :"+stack.pop());
       System.out.println("Max Element is :"+stack.get_Max());

	}
}