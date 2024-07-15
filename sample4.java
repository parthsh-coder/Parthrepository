public class sample4
{
    void myfun()
    {
        String name="parth sharma";
        int age=19;
        double marks=69.85;
        char gender='M';

        System.out.println("hello Mr:"+name);
        System.out.println("Age:"+age);
        System.out.println("Marks:"+marks);
        System.out.println("Gender:"+gender);
    }
    public static void main(String[] args)
    {
        sample4 s1 = new sample4();
        s1.myfun();

    }
}