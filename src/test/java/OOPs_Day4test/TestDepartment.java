package OOPs_Day4test;

import OOPS_Day4.Department;

public class TestDepartment {
    public static void main(String[] args) {
        // Create an instance of a subclass and call getDepartmentSize()
        EngineeringDepartment engDept = new EngineeringDepartment();
        System.out.println("Engineering Department Size: " + engDept.getDepartmentSize());
    }
}

class EngineeringDepartment extends Department {
    @Override
    public int getDepartmentSize() {
        // Return a predefined size for the engineering department
        return 50;
    }
}
