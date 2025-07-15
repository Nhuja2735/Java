public class Employee<T> {
    private T EmployeeID;
    public Employee(T EmployeeID){
        this.EmployeeID = EmployeeID;
    }
    public T getEmployeeID(){
        return EmployeeID;
    }
    public void setEmployeeID(T EmployeeID){
        this.EmployeeID = EmployeeID;
    }
    @Override
    public String toString(){
        return "Employee{" + " EmployeeID=" + EmployeeID + '}';
    }
}