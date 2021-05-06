public class Person
{
    String tcNo;
    String name;

    public Person(String tcNo, String name)
    {
        this.tcNo = tcNo;
        this.name = name;
    }

    public Person(String tcNo)
    {
        this.tcNo = tcNo;
    }

    public String getTcNo()
    {
        return this.tcNo;
    }

    public void setTcNo(String tcNo)
    {
        this.tcNo = tcNo;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return (this.tcNo + " " + this.name);
    }
}
