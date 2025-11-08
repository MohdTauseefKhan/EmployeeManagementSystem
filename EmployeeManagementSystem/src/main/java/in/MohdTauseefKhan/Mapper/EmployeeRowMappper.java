package in.MohdTauseefKhan.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.MohdTauseefKhan.Beans.Employee;

public class EmployeeRowMappper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setEmpId(rs.getInt("empId"));
		employee.setEmpDepartment(rs.getString("empDepartment"));
		employee.setEmpSalary(rs.getFloat("empSalary"));
		employee.setEmpName(rs.getString("empName"));
		return employee;
	}


	

}
