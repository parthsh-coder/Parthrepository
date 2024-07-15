public class Sample2 {
    int Empid;
    String Empname;
    int Age;
    float Salary;
    Sample2(int Empid, String Empname, int Age , float Salary)
    {
        this.Empid=Empid;
        this.Empname=Empname;
        this.Age=Age;
        this.Salary=Salary;
    }
    void display()
    {
        System.out.println("EMPID:"+" "+Empid+" "+"EMPNAME:"+" "+Empname+" "+"AGE:"+" "+Age+" "+"SALARY:"+" "+Salary);
    }
    public static void main(String args[])
    {
        Sample2 S1 = new Sample2(100,"parth",19,45000f);
        S1.display();
        


    }
}
