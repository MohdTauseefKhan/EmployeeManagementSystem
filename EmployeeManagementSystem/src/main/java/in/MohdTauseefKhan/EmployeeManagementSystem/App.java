package in.MohdTauseefKhan.EmployeeManagementSystem;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.expression.ExpressionInvocationTargetException;
import org.springframework.jdbc.core.JdbcTemplate;

import in.MohdTauseefKhan.Beans.Employee;
import in.MohdTauseefKhan.Mapper.EmployeeRowMappper;
import in.MohdTauseefKhan.Resources.AppConfig;

public class App 
{
	
	
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        JdbcTemplate db = context.getBean(JdbcTemplate.class);
        String insert = "INSERT INTO Employee VALUES(?,?,?,?)";
        String delete = "DELETE FROM Employee where empId=?";
        String retrieve = "SELECT * FROM Employee";
        int choice;
        Scanner sc = new Scanner(System.in);
        while(true) {
        	System.out.println("---------- SELECT A CHOICE ----------");
        	System.out.println("1. Insert A Employee\n2. Delete A Employee\n3. See All Employees\n4. Exit");
        	System.out.println("\nEnter A Choice:");
        	choice = sc.nextInt();
        	
        	switch(choice) {
        	case 1:
        		System.out.println("Enter Employee id:");
        		int id = sc.nextInt();
        		System.out.println("Enter Employee name:");
        		String name = sc.next();
        		System.out.println("Enter Employee department:");
        		String Dept = sc.next();
        		System.out.println("Enter Employee salary:");
        		float sal = sc.nextFloat();
        		
        		int count = db.update(insert,id,name,sal,Dept);
        		if(count>0) {
        			System.out.println("Insertion Success");
        		}else {
        			System.out.println("Some Error Occur");
        		}
        		break;
        	case 2:
        		System.out.println("Enter Employee id:");
        		id = sc.nextInt();
        		
        		count = db.update(delete,id);
        		
        		if(count>0) {
        			System.out.println("Deletion Success");
        		}else {
        			System.out.println("Some Error Occur");
        		}
        		break;
        	case 3:
        		List<Employee> e = db.query(retrieve, new EmployeeRowMappper());
        		for(Employee employee:e) {
        			System.out.println("Employee id: "+employee.getEmpId());
        			System.out.println("Employee name: "+employee.getEmpName());
        			System.out.println("Employee salary: "+employee.getEmpSalary());
        			System.out.println("Employee department: "+employee.getEmpDepartment()+"\n");
        		}
        		break;
        	case 4:
        		return;
        	default:
        		System.out.println("Invalid Choice");
        	}
        }
        
    }
}
