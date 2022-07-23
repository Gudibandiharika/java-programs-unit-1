import java.util.Scanner;
class MatrixAddition
{
	public static void main(String agrs[])
	{
		Scanner r=new Scanner(System.in);
		int k[][]=new int[2][2];
		int l[][]=new int[2][2];
		int m[][]=new int[2][2];
		System.out.println("Enter Matrix-1 element : ");
		for(int i=0;i<k.length;i++)
		{
			for(int j=0;j<k.length;j++)
			{
				k[i][j]=r.nextInt();
			}
		}
		System.out.println("Enter Matrix-2 element : ");
		for(int i=0;i<l.length;i++)
		{
			for(int j=0;j<l.length;j++)
			{
				l[i][j]=r.nextInt();
			}
		}
		System.out.println("Sum of matrices : ");
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m.length;j++)
			{
				m[i][j]=k[i][j]+l[i][j];
				System.out.print(m[i][j]+" ");
			}
		}
		System.out.println();
	}
}

