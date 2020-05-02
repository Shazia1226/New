package Pack1;

public class Class1

{     
	int a, b, c;
	public Class1(int a, int b) 
	{
		this.a=a;
		this.b=b;
		
	}



	public void add()
	{
		c=a+b;
		System.out.println("addition a n b :" + c);
	}
	
	

	public static void main(String[] args) 
	{
		Class1 obj= new Class1(10,20);
		obj.add();
		
		
		
		
	}

}
