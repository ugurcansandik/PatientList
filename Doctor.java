public class Doctor extends Person
{
    String department;

    public Doctor(String tcNo, String name, String department)
    {
        super(tcNo, name);
        this.department = department;
    }

    @Override
    public String toString()
    {
        return (super.toString() + " " + this.department);
    }
}
