class UserDefineMethod
{
   void add()
  {
     int x=10;
     int y=20;
     int z=x+y;
     System.out.println("z : "+z);
  }
  public static void main(String args[])
  {
    UserDefineMethod d=new UserDefineMethod();
    d.add();
  }
}