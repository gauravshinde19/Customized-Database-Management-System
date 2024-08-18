/////////////////////////////////////////////
//                                         //
//                                         //
//  Customized Database Management System  //
//                                         //
//                                         //
/////////////////////////////////////////////

import java.util.*;

class Employee
{
    public int EID;
    public String Ename;
    public String EAddress;
    public int ESalary;

    private static int Counter;

    static
    {
        Counter = 0;
    }

    public Employee(String B, String C, int D)
    {
        this.EID = ++Counter;
        this.Ename = B;
        this.EAddress = C;
        this.ESalary = D;
    }

    void DisplayInfo()
    {
        System.out.println(EID + "\t" + Ename + "\t" + EAddress + "\t" + ESalary);
    }
}

class MarvellousDBMS
{
    public LinkedList<Employee> lobj;

    public MarvellousDBMS()
    {
        System.out.println("Marvellous DBMS started successfully...");
        lobj = new LinkedList<Employee>();
    }

    protected void finalize()
    {
        System.out.println("Deallocating all resources of DBMS");
        lobj = null;
    }

    public void InsertIntoTable(String name, String Address, int Salary)
    {
        Employee eobj = new Employee(name, Address, Salary);
        lobj.add(eobj);
    }

    public void SelectStar()
    {
        System.out.println("Data from the Employee Database:");

        System.out.println("\n----------------------------------------------------------");
        System.out.println("EID\tEname\t\tEaddress\t\tEsalary");
        System.out.println("----------------------------------------------------------");

        for (Employee eref : lobj)
        {
            eref.DisplayInfo();
        }

        System.out.println("----------------------------------------------------------");
    }

    public void SelectSpecific(int ID)
    {
        System.out.println("Information of Employee whose EID is: " + ID);

        for (Employee eref : lobj)
        {
            if (eref.EID == ID)
            {
                eref.DisplayInfo();
                return;
            }
        }
        System.out.println("Employee with EID " + ID + " not found.");
    }

    public void SelectSpecific(String Name)
    {
        System.out.println("Information of Employee whose Name is: " + Name);

        for (Employee eref : lobj)
        {
            if (Name.equalsIgnoreCase(eref.Ename))
            {
                eref.DisplayInfo();
                return;
            }
        }
        System.out.println("Employee with Name " + Name + " not found.");
    }

    public void DeleteFrom(int ID)
    {
        Iterator<Employee> iterator = lobj.iterator();
        boolean found = false;

        while (iterator.hasNext())
        {
            Employee eref = iterator.next();
            if (eref.EID == ID)
            {
                iterator.remove();
                found = true;
                System.out.println("Employee with EID " + ID + " deleted successfully.");
                break;
            }
        }

        if (!found)
        {
            System.out.println("Unable to delete the element from database as the given ID is not present");
        }
    }

    public void DeleteFrom(String Name)
    {
        Iterator<Employee> iterator = lobj.iterator();
        boolean found = false;

        while (iterator.hasNext())
        {
            Employee eref = iterator.next();
            if (Name.equalsIgnoreCase(eref.Ename))
            {
                iterator.remove();
                found = true;
                System.out.println("Employee with Name " + Name + " deleted successfully.");
                break;
            }
        }

        if (!found)
        {
            System.out.println("Unable to delete the element from database as the given name is not present");
        }
    }

    public void AggregateSum()
    {
        int iSum = 0;

        for (Employee eref : lobj)
        {
            iSum = iSum + eref.ESalary;
        }

        System.out.println("Summation of salary: " + iSum);
    }

    public void AggregateMax()
    {
        int iMax = Integer.MIN_VALUE;

        for (Employee eref : lobj)
        {
            if (eref.ESalary > iMax)
            {
                iMax = eref.ESalary;
            }
        }

        System.out.println("Maximum salary: " + iMax);
    }

    public void AggregateMin()
    {
        if (lobj.isEmpty())
        {
            System.out.println("No employees in the database.");
            return;
        }

        int iMin = Integer.MAX_VALUE;

        for (Employee eref : lobj)
        {
            if (eref.ESalary < iMin)
            {
                iMin = eref.ESalary;
            }
        }

        System.out.println("Minimum salary: " + iMin);
    }

    public void AggregateAvg()
    {
        if (lobj.isEmpty())
        {
            System.out.println("No employees in the database.");
            return;
        }

        int iSum = 0;

        for (Employee eref : lobj)
        {
            iSum = iSum + eref.ESalary;
        }

        System.out.println("Average salary: " + (iSum / lobj.size()));
    }

    public void AggregateCount()
    {
        System.out.println("Number of Employees: " + lobj.size());
    }
}

class CustomizedDBMS
{
    public static void main(String Arg[])
    {
        System.out.println("-------- Marvellous Database Management System --------");

        Scanner sobj = new Scanner(System.in);

        MarvellousDBMS mobj = new MarvellousDBMS();

        int iOption = 0;
        int Salary;
        int EID;

        String Name;
        String Address;

        while (true)
        {
            System.out.println("----------------------------------------------------------");
            System.out.println("Please select your choice based on your requirement: ");
            System.out.println("----------------------------------------------------------");

            System.out.println("1 : Insert new record into the table");
            System.out.println("2 : Display all records");
            System.out.println("3 : Display all records having specific EID");
            System.out.println("4 : Display all records having specific Name");
            System.out.println("5 : Delete the record based on EID");
            System.out.println("6 : Delete the record based on Employee name");
            System.out.println("7 : Display Sum of all salary");
            System.out.println("8 : Display Average of all salary");
            System.out.println("9 : Display Minimum from all salary");
            System.out.println("10 : Display Maximum from all salary");
            System.out.println("11 : Display the Count of records");
            System.out.println("12 : Display Help");
            System.out.println("13 : Display About");
            System.out.println("14 : Terminate the DBMS");
            System.out.println("----------------------------------------------------------");

            System.out.print("Your choice : ");
            iOption = sobj.nextInt();

            switch (iOption)
            {
                case 1:
                    System.out.println("Please enter the information of the employee: ");
                    
                    System.out.println("Please enter Employee name: ");
                    sobj.nextLine();
                    Name = sobj.nextLine();

                    System.out.println("Please enter Employee Address: ");
                    Address = sobj.nextLine();

                    System.out.println("Please enter Employee Salary: ");
                    Salary = sobj.nextInt();

                    mobj.InsertIntoTable(Name, Address, Salary);
                    break;

                case 2:
                    mobj.SelectStar();
                    break;

                case 3:
                    System.out.println("Please enter the Employee ID whose information you want to display:");
                    EID = sobj.nextInt();
                    mobj.SelectSpecific(EID);
                    break;

                case 4:
                    System.out.println("Please enter the Employee name whose information you want to display:");
                    sobj.nextLine();
                    Name = sobj.nextLine();
                    mobj.SelectSpecific(Name);
                    break;

                case 5:
                    System.out.println("Please enter the Employee ID whose information you want to delete:");

                    EID = sobj.nextInt();
                    mobj.DeleteFrom(EID);
                    break;

                case 6:
                    System.out.println("Please enter the Employee name whose information you want to delete:");

                    sobj.nextLine();
                    Name = sobj.nextLine();
                    mobj.DeleteFrom(Name);
                    break;

                case 7:
                    mobj.AggregateSum();
                    break;

                case 8:
                    mobj.AggregateAvg();
                    break;

                case 9:
                    mobj.AggregateMin();
                    break;

                case 10:
                    mobj.AggregateMax();
                    break;

                case 11:
                    mobj.AggregateCount();
                    break;

                case 12:
                    System.out.println("This project implements the DBMS for employee records.");
                    System.out.println("We implement all SQL queries.");
                    System.out.println("All data gets stored in Data structures.");
                    System.out.println("Complete implementation is on Primary storage.");
                    break;

                case 13:
                    System.out.println("This project developed by Marvellous Infosystems.");
                    System.out.println("All copyrights reserved.");
                    break;

                case 14:
                    System.out.println("Thank you for using the Marvellous DBMS.");
                    sobj.close();
                    System.gc();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Please select a valid option.");
                    break;
            }
        }
    }
}
