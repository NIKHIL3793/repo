public class Newmethod
{
    public int add()
    {
        int a=125;
        int b=156;
        return (a+b);
    }

    public static void main(String[] args)
    {
        Newmethod obj= new Newmethod();
        int c=obj.add();
        System.out.println(c);
    }
}
