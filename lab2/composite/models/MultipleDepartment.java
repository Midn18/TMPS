package lab2.composite.models;

import java.util.ArrayList;
import java.util.List;

public class MultipleDepartment implements Department {
    private String departmentName;
    private List<Department> subDepartments = new ArrayList<>();

    public MultipleDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public void addDepartment(Department department) {
        subDepartments.add(department);
    }

    @Override
    public void removeDepartment(Department department) {
        subDepartments.remove(department);
    }

    @Override
    public void printDepartmentName() {
        System.out.println(departmentName);
    }

    @Override
    public void printSubDepartments(String prefix) {
        for (Department department : subDepartments) {
            System.out.print(prefix);
            System.out.print("- ");
            department.printDepartmentName();
            department.printSubDepartments(prefix + "  ");
        }
    }
}
