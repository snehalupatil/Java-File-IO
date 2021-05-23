import jdk.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    private List<EmployeePayrollData> employeePayrollList;

    public EmployeePayrollService(List<EmployeePayrollData>employeePayrollList){
        this.employeePayrollList = employeePayrollList;
    }

    public static void main(String[] args){
        ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollService.readEmployeePayRollData(consoleInputReader);
        employeePayrollService.writeEmployeePayRollData();
    }

    private void readEmployeePayRollData(Scanner consoleInputReadr){
        System.out.println("Enter Employee Id:");
        int id = consoleInputReadr.nextInt();
        System.out.println("Enter Employee Name:");
        String name =consoleInputReadr.next();
        System.out.println("Enter Employee Salary:");
        double salary = consoleInputReadr.nextDouble();
    }

    private void writeEmployeePayRollData(){
        System.out.println(employeePayrollList);
    }
}
