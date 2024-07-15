class Student {  
    private int Rollno;
    private String Name;
    private int Age;
    
    public int GetRollno()
    {
        return Rollno;
    }
    public void SetRllno(int Rollno)
    {
        this.Rollno=Rollno;
    }
    public String GetName()
    {
        return Name;
    }
    public void SetName(String Name)
    {
        this.Name=Name;
    }
    public int GetAge()
    {
        return Age;
    }
    public void SetAge(int Age)
    {
        this.Age=Age;
    }
    public static void main(String[] args) {
        Student S = new Student();
        S.SetRllno(100);
        System.out.println(S.GetRollno());
        S.SetName("Parth");
        System.out.println(S.GetName());
        S.SetAge(19);
        System.out.println(S.GetAge());
    }

}