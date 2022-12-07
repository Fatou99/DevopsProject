package tn.devops.services;
import tn.devops.entities.Department;

public interface IDepartmentManagement {
	public void addDepartment(Department d);
    public void deleteDepartment(int id);
    public void updateDepartmentName(int id, String name);
}
