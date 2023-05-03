package lab2.composite;

import lab2.composite.models.Department;
import lab2.composite.models.MultipleDepartment;
import lab2.composite.models.SingleDepartment;

public class CompanyDepartments {

    public static Department createCompanyTree() {
        MultipleDepartment bassBox = new MultipleDepartment("BassBox");

        Department healthDepartment = new MultipleDepartment("Health");
        healthDepartment.addDepartment(new SingleDepartment("Balkan Pharmaceuticals"));
        healthDepartment.addDepartment(new SingleDepartment("Catena"));
        bassBox.addDepartment(healthDepartment);

        Department beautyDepartment = new MultipleDepartment("Beauty");
        beautyDepartment.addDepartment(new SingleDepartment("Avon"));
        beautyDepartment.addDepartment(new SingleDepartment("Orifflame"));
        bassBox.addDepartment(beautyDepartment);

        Department foodDepartment = new MultipleDepartment("Food");
        foodDepartment.addDepartment(new SingleDepartment("Andy's Pizza"));
        foodDepartment.addDepartment(new SingleDepartment("Table 9"));
        bassBox.addDepartment(foodDepartment);

        Department adminDepartment = new MultipleDepartment("Admin");
        adminDepartment.addDepartment(new SingleDepartment("Finance"));
        adminDepartment.addDepartment(new SingleDepartment("Communication"));
        bassBox.addDepartment(adminDepartment);

        return bassBox;
    }
}
