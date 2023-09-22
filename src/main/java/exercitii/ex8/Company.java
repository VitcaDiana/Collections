package exercitii.ex8;

import java.util.*;

public class Company {
    private List<Employee> employeeList;

    public Company(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    public List<Employee> filterByAgeGratherThan (int age){
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employeeList){
            if (employee.getAge() > 50){
                result.add(employee);
            }
        }
        return result;
    }
    public void sortByName(){
        Collections.sort(employeeList);
    }
    public void sortByCountry(){
        employeeList.sort(new CountryComparator());
    }
    public Map<String,Integer> getNumberOfEmployessByCountry(){
        Map<String,Integer> numberOfEmployessByCountry = new HashMap<>();
        for (Employee employee : employeeList){
            if (numberOfEmployessByCountry.containsKey(employee.getCountry())){
                numberOfEmployessByCountry.put(employee.getCountry(), numberOfEmployessByCountry.get(employee.getCountry())+1);
            }else {
                numberOfEmployessByCountry.put(employee.getCountry(),1);
            }
        }
        return numberOfEmployessByCountry;
    }

    public Map<String ,List<Employee>> getEmployessByCountry(){
        Map<String ,List<Employee>> employessByCountry = new HashMap<>();
        for (Employee employee : employeeList){
            if (employessByCountry.containsKey(employee.getCountry())){
                employessByCountry.get(employee.getCountry()).add(employee);
            }else{
                List<Employee> valueEmployeeList = new ArrayList<>();
                valueEmployeeList.add(employee);
                employessByCountry.put(employee.getCountry(),valueEmployeeList);
            }
        }
        return employessByCountry;
    }

}
