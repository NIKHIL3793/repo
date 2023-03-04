package Friends;

public class Privateaccess {
    private int add()
    {
        int a=99;
        int b=66;
        int c=a-b;
        return c;
    }

    public static void main(String[] args) {
        Privateaccess obj=new Privateaccess();
        int g=obj.add();
        System.out.println(g);
    }
}
