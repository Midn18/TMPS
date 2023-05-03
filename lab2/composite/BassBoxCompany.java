package lab2.composite;

import lab2.composite.models.Department;

public class BassBoxCompany {
    public static void main(String[] args) {
        Department bassBoxCompany = CompanyDepartments.createCompanyTree();
        System.out.println("BassBox Company Departments:");
        bassBoxCompany.printDepartmentName();
        bassBoxCompany.printSubDepartments("  ");
    }
}
