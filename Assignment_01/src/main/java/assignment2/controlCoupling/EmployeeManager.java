package assignment2.controlCoupling;

public class EmployeeManager {
    void promotion(Employee employee){
        if(employee.age >= 35){
            employee.multiplySalary();
        }
        else{
            employee.addSalary();
        }
    }
}

/*--------------------------------Explanation------------------------------------
Here the EmployeeManager class has a method promotion. The method takes Employee as a
parameter and gives raise to salary based on their age. It uses if-else statement to
check their age. This is control coupling because here we use control statements to decide
which statements to execute.
 */