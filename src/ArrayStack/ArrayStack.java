package ArrayStack;

import java.util.EmptyStackException;

public class ArrayStack implements Stack {

	public static final int CAPACITY = 1024;
	
	private int N;
	private Object S[];
	
	private int t = -1; // top element
	
	public ArrayStack()
	{
		this(CAPACITY);
	}
	
	public ArrayStack(int cap) 
	{
		N = cap;
		S = new Object[N];
	}

	@Override
	public int size() 
	{
		return (t+1);
	}

	@Override
	public boolean isEmpty() 
	{
		return (t < 0);
	}

	@Override
	public Object top() throws EmptyStackException 
	{
		if (isEmpty())
		{
			throw new EmptyStackException();
		}
		return S[t];
	}

	@Override
	public void push(Object element) throws Exception 
	{
		if (size() == N)
		{
			throw new Exception("Stack overflow.");
		}
		S[++t] = element;
	}

	@Override
	public Object pop() throws EmptyStackException 
	{
		Object elem;
		if (isEmpty())
		{
			throw new EmptyStackException();
		}
		elem = S[t];
		S[t--] = null;
		return elem;
	}

}
