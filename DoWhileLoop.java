import java.util.Scanner;
class DoWhileLoop
{
	public static void main(String args[])
	{
	int i,u,l;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Lower range : ");
	l=sc.nextInt();
	System.out.println("Enter the Upper range : ");
	u=sc.nextInt();
	i=l;
	do
	{
		System.out.println(i);
		i++;
	}while(i<u);
	}
}