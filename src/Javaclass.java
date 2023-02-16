public class Javaclass
{
    public int add()
    {
        int a=73;
        int b=57;
        return (a+b);
    }
    public static void main(String[] args)
    {
        Javaclass obj=new Javaclass();
        int c=obj.add();
        System.out.println(c);
    }
}
