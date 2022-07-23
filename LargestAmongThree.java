import java.util.Scanner;
class LargestAmongThree
{
    public static void main(String args[])
    {
     Scanner h = new Scanner(System.in);
     System.out.print("Enter a value : ");
     int a = h.nextInt();
     System.out.print("Enter b value : ");
     int b = h.nextInt();
     System.out.print("Enter c value : ");
     int c = h.nextInt();
     if((a>b)&&(a>c))
     {
         System.out.println(a+ " is largest");
     }
     else if((b>a)&&(b>c))
     {
        System.out.println(b+ " is largest");  
     }
     else
     {
        System.out.println(c+ " is largest"); 
     }
    }
}