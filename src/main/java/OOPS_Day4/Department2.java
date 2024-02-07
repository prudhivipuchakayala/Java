package OOPS_Day4;

public abstract class Department2 {
    // Abstract method to get department size
    public abstract int getDepartmentSize();
}

class EngineeringDepartment extends Department {
    // Implementation of the abstract method
    @Override
    public int getDepartmentSize() {
        // Return the size of the engineering department
        return 100;
    }
}


