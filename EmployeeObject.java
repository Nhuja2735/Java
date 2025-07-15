public class EmployeeObject<T> {
    private T employeeID;
    
    public T getEmployeeID() {
        return employeeID;
    }
    
    public void setEmployeeID(T employeeID) {
        this.employeeID = employeeID;
    }
    public EmployeeObject(T employeeID){
        this.employeeID = employeeID;
    }

    public static void main(String[] args) {
        EmployeeObject<Integer> emp = new EmployeeObject<>(12345);
        System.out.println("Employee ID: " + emp.getEmployeeID());
    }
}
