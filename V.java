public class V
{
    String operation;
    String doctorTcNo;
    String patientTcNo;

    public V(String doctorTcNo, String patientTcNo, String operation)
    {
        this.doctorTcNo = doctorTcNo;
        this.patientTcNo = patientTcNo;
        this.operation = operation;
    }

    @Override
    public String toString()
    {
        return(this.doctorTcNo + " " + this.patientTcNo + " " + this.operation);
    }
}
