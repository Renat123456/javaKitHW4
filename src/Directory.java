import java.util.ArrayList;
import java.util.List;

public class Directory {
    private List<Employee> employees;

    public Directory() {
        employees = new ArrayList<>();
    }

    public void addEmployee(int personnelNumber, int phone, String name, int experience){
        Employee employee = new Employee(personnelNumber, phone, name, experience);
        employees.add(employee);
    }

    public List<Employee> searchExperience(int experience){
        List<Employee> employeesExperience = new ArrayList<>();
        for (Employee employee : employees) {
            if(employee.getExperience() == experience){
                employeesExperience.add(employee);
            }
        }
        return employeesExperience;
    }

    public List<Integer> searchPhoneByName(String name){
        List<Integer> employeesPhone = new ArrayList<>();
        for (Employee employee : employees) {
            if(employee.getName().equals(name)){
                employeesPhone.add(employee.getPhone());
            }
        }
        return employeesPhone;
    }

    public Employee searchEmployeeByPersonnelNumber(Integer personnelNumber){
        Employee employeeByPersonnelNumber =  null;
        for (Employee employee : employees) {
            if(employee.getPersonnelNumber().equals(personnelNumber)){
                employeeByPersonnelNumber = employee;
            }
        }
        return employeeByPersonnelNumber;
    }
}
