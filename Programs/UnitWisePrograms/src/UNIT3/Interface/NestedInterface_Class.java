class Test1   
{
    interface Yes
    {
        void show();
    }
}
class Testing1 implements Test1.Yes
{
    public void show()
    {
        System.out.println("show method of interface");
    }
} 
class NestedInterface_Class
{
    public static void main(String[] args)
    {
        Testing1 t = new Testing1();
        t.show();
    }
}