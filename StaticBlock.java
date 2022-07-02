public class StaticBlock
{
    static
    {
        System.out.println("This is the static block which is executed first.");
    }
    
    public static void main(String[] args)
    {
        System.out.println("This is the main method which is executed next.");
    }
}