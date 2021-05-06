import java.util.Scanner;
import java.io.File;

public class Main
{
    static Doctor doctor1 = new Doctor("12345", "Okan", "KBB");
    static Doctor[] Doctor = {doctor1};
    static Patient patient1 = new Patient("53333", "Fatma", "KBB");
    static Patient[] Patient = {patient1};
    
    static V v1 = new V("12345", "53333", "Drug");
    static V[] V = {v1};
    
    static final String mainMenu = "1. Add Doctor\n2. Add Patient\n3. Add V\n4. List Doctor\n5. List Patient\n6. List V\n-1. Quit";

    public static void main(String[] args) throws Exception
    {
        mainMenu();
    }

    public static void clearScreen()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void mainMenu()
    {
        int mainMenuChoice;
        Scanner scanner = new Scanner(System.in);
        clearScreen();
        do
        {
            System.out.println(mainMenu);
            mainMenuChoice = scanner.nextInt();
            mainMenuControl(mainMenuChoice);
        }while((mainMenuChoice != -1));
    }

    public static void mainMenuControl(int mainMenuChoice)
    {
        Scanner scanner = new Scanner(System.in);
        String name, department;
        String tcNo;
        switch(mainMenuChoice)
        {
            case 1:
                System.out.print("Tc No: ");
                tcNo = String.valueOf(scanner.nextInt());
                System.out.print("Name: ");
                name = scanner.next();
                System.out.print("Department: ");
                department = scanner.next();
                addDoctor(tcNo, name, department);
                break;
            case 2:
                System.out.print("Tc No: ");
                tcNo = String.valueOf(scanner.nextInt());
                System.out.print("Name: ");
                name = scanner.next();
                System.out.print("Sick: ");
                department = scanner.next();
                addPatient(tcNo, name, department);
                break;
            case 3:
                listArray(Doctor);
                String doctorTcNo = String.valueOf(scanner.nextInt());
                listArray(Patient);
                String PatientTcNo = String.valueOf(scanner.nextInt());
                System.out.print("Operation: ");
                String operation = scanner.next();
                addV(doctorTcNo, PatientTcNo, operation);
                break;
            case 4:
                listArray(Doctor);
                System.out.print("Press any key to back.");
                scanner.next();
                mainMenu();
                break;
            case 5:
                listArray(Patient);
                System.out.print("Press any key to back.");
                scanner.next();
                mainMenu();
                break;
            case 6:
                listArray(V);
                System.out.print("Press any key to back.");
                scanner.next();
                mainMenu();
                break;
            case -1:
                System.exit(0);
            default:
                System.out.println("Invalid input.");
        }
    }

    public static void addDoctor(String tcNo, String name, String department)
    {
        Doctor doctor = new Doctor(tcNo, name, department);
        Doctor = addDoctorElement(Doctor.length, Doctor, doctor);
        System.out.println("Succesful");
    }

    public static Doctor[] addDoctorElement(int len, Doctor arr[], Doctor element) 
    {
        Doctor newArr[] = new Doctor[len + 1];
        for (int i = 0 ; i < len ; i++)
        {
            newArr[i] = arr[i];
        }
        newArr[len] = element;

        return newArr;
    }

    public static void addPatient(String tcNo, String name, String sick)
    {
        try
        {
            Patient patient = new Patient(tcNo, name, sick);
            Patient = addPatientElement(Patient.length, Patient, patient);
            System.out.println("Succesful");
        } catch(Exception e)
        {
            System.out.println("Something went wrong.");
        }
    }
        
    public static Patient[] addPatientElement(int len, Patient arr[], Patient element)
    {
        Patient newArr1[] = new Patient[len + 1];
        for (int i = 0 ; i < len ; i++)
        {
            newArr1[i] = arr[i];
        }
        newArr1[len] = element; 
        
        return newArr1; 
    }

    public static void addV(String dTcNo, String pTcNo, String operation)
    {
        try
        {
            V v = new V(dTcNo, pTcNo, operation);
            V = addVElement(V.length, V, v);
            System.out.println("Succesful");
        } catch(Exception e)
        {
            System.out.println("Something went wrong.");
        }
    }
    
    public static V[] addVElement(int len, V arr[], V element)
    {
        V newArr2[] = new V[len + 1];
        for (int i = 0 ; i < len ; i++)
        {
            newArr2[i] = arr[i];
        }
        newArr2[len] = element; 
        
        return newArr2;
    }

    public static void listArray(Object[] array)
    {
        if (array != null)
        {
            for (int i = 0 ; i < array.length ; i++)
            {
                System.out.printf("%d-) %s%n", (i+1), array[i]);
            }
        }else
        {
            System.out.println("Array is empty.");
        }
    }
}
