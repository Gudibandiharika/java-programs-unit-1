import java.util.Scanner;
class MinArrayElement
{
	public static void main(String args[])
	{
		int a[]=new int[5];
		Scanner k=new Scanner(System.in);
		System.out.println("Enter array elements: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=k.nextInt();
		}
		System.out.println("The min array element: ");
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(+min);
	}
}