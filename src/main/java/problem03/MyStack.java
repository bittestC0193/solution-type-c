package problem03;

public class MyStack {
	int top;
	int tsize;
	private String[] buffer;
	private String[] tbuffer;
	public MyStack( int size ) {
		top = -1;
		buffer = new String[size];
		tsize= size;
	}
	
	public void push(String item) {
		if(top>=tsize)
		{
			tbuffer = new String[tsize];
			for(int i=0;i<tsize;i++)
				tbuffer = 
		}
		buffer[++top] = item;
	}

	public String pop() {
		return buffer[top--];
	}

	public boolean isEmpty() {
		return top==-1?true:false;
	}
	
	public int size() {
		return 0;
	}
}