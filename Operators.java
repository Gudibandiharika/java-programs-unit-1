class Operators
{
	int a=10,b=4;
	void arithmethic()
	{
		System.out.println("Arithmethic Operator");
		System.out.println("Addition : "+(a+b));
		System.out.println("Subtraction : "+(a-b));
		System.out.println("Multiplication : "+(a*b));
		System.out.println("Division : "+(a/b));
		System.out.println("Remainder : "+(a%b));
	}
	void relational()
	{
		System.out.println("Relational Operator");
		System.out.println("Is Equal To : "+(a==b));
		System.out.println("Not Equal To : "+(a!=b));
		System.out.println("Greater Than : "+(a>b));
		System.out.println("Less Than : "+(a<b));
		System.out.println("Greater Than or Equal To : "+(a>=b));
		System.out.println("Less Than or Equal To : "+(a<=b));
	}
	void assignment()
	{
		System.out.println("Assignment Operater");
		System.out.println("Equal : "+(a=b));
		System.out.println("Addition : "+(a+=b));
		System.out.println("Subtraction : "+(a-=b));
		System.out.println("Multiplication : "+(a*=b));
		System.out.println("Division : "+(a/=b));
		System.out.println("Remainder : "+(a%=b));
	}
	void logical()
	{
		System.out.println("Logical Operator");
		System.out.println("Logical AND :"+((a>b)&&(a<b)));
		System.out.println("Logical OR :"+((a<b)||(a>b)));
		System.out.println("Logical NOT :"+(a!=b));
	}
	void unary()
	{
		System.out.println("Unary Operator");
		System.out.println("Increment : "+(++a));
		System.out.println("Decrement : "+(--b));
	}
	void bitwise()
	{	
		System.out.println("Bitwise Operators");
		System.out.println("Bitwise Complement : "+(~b));
		System.out.println("Left Shift : "+(a<<b));
		System.out.println("Right Shift : "+(a>>b));
		System.out.println("Bitwise AND : "+(a&b));
		System.out.println("Bitwise exclusive OR : "+(a^b));
	}
	public static void main(String args[])
	{
		Operators o=new Operators();
		o.arithmethic();
		o.relational();
		o.assignment();
		o.logical();
		o.unary();
		o.bitwise();
	}
}