package Friends;

public class Returntype {
    public int add()
    {
        int a=44;
        int b=88;
        int c=b-a;
        return c;
    }

    public static void main(String[] args) {
        Returntype obj=new Returntype();
        int f=obj.add();
        System.out.println(f);
    }
}
