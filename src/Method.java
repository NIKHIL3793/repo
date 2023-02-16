public class Method
{
    public void publicMethod()
    {
        int a=136;
        int b=127;
        int c=a-b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Method obj=new Method();
        obj.publicMethod();
    }
}
