public class Patient extends Person
{
    String sick;

    public Patient(String tcNo, String name, String sick)
    {
        super(tcNo, name);
        this.sick = sick;
    }

    @Override
    public String toString()
    {
        return (super.toString() + " " + this.sick);
    }
}
