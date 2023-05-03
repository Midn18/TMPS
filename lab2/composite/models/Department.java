package lab2.composite.models;

public interface Department {
    void addDepartment(Department department);
    void removeDepartment(Department department);
    void printDepartmentName();
    void printSubDepartments(String prefix);
}
