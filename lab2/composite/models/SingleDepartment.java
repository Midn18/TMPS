package lab2.composite.models;

public class SingleDepartment implements Department {

    private String departmentName;

    public SingleDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    public void addDepartment(Department department) {
        throw new UnsupportedOperationException("Cannot add department to single department");
    }

    public void removeDepartment(Department department) {
        throw new UnsupportedOperationException("Cannot remove department from single department");
    }

    public void printDepartmentName() {
        System.out.println(departmentName);
    }

    public void printSubDepartments(String prefix) {
    }
}
