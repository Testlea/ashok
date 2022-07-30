package week2;

public class Employe {
	public void emloyename(String name) {
		System.out.println(name);
		
	}
	public void employeeid(int id) {
		System.out.println(id);
		
	}
	
	public void employeeaddress(String address) {
		System.out.println(address);
		
	
	}
	
	public void emloyesalary(double salary) {
		System.out.println(salary);
		
	}
	public void employemobilenumber(long mobilenumber) {
		System.out.println(mobilenumber);
		
	}
	public static void main(String[] args) {
		Employe emp=new Employe();
		emp.emloyename("ashok");
		emp.employeeid(007);
		emp.employeeaddress("salem");
		emp.employemobilenumber(900366331);
		
		
	}
	
}
	


