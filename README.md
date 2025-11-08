# 📘 Employee Management System (Spring JDBC - Console Application)

## 🧩 Overview
This is a **simple console-based Employee Management System** built using **Spring Core** and **Spring JDBC**.  
It demonstrates how to integrate **Spring’s Dependency Injection (DI)** with **JDBC Template** to perform basic **CRUD (Create, Read, Delete)** operations on a database.

---

## 🚀 Features
- Insert new employee records  
- Delete existing employee records  
- Retrieve and display all employees  
- Menu-driven console interface using `Scanner` and `switch`  
- Uses **RowMapper** for mapping database rows to Java objects  
- Fully configured using **Java-based configuration (AppConfig class)** — no XML required  

---

## 🧠 Technologies Used
| Layer | Technology |
|-------|-------------|
| Language | Java 23 |
| Framework | Spring Core, Spring JDBC |
| Database | MySQL (or any JDBC-supported DB) |
| IDE | Visual Studio Code / Eclipse |
| Build Tool | Maven |

---

## ⚙️ Project Structure
in.MohdTauseefKhan.EmployeeManagementSystem/
│
├── src/main/java/
│ ├── in/MohdTauseefKhan/Beans/
│ │ └── Employee.java
│ ├── in/MohdTauseefKhan/Mapper/
│ │ └── EmployeeRowMapper.java
│ ├── in/MohdTauseefKhan/Resources/
│ │ └── AppConfig.java
│ └── in/MohdTauseefKhan/EmployeeManagementSystem/
│ └── App.java
│
├── src/main/resources/
│ └── (optional application.properties)
│
├── pom.xml
└── README.md

---

## 🧩 Database Setup

### 1. Create Database and Table
Run the following SQL commands in MySQL (or any RDBMS you use):
```sql
CREATE DATABASE EmployeeDB;
USE EmployeeDB;

CREATE TABLE Employee (
  empId INT PRIMARY KEY,
  empName VARCHAR(100),
  empSalary FLOAT,
  empDepartment VARCHAR(100)
);

### 2. Configure Database Connection in AppConfig.java
@Bean
public DataSource dataSource() {
    DriverManagerDataSource ds = new DriverManagerDataSource();
    ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
    ds.setUrl("jdbc:mysql://localhost:3306/EmployeeDB");
    ds.setUsername("root");
    ds.setPassword("your_password");
    return ds;
}

---

## 💻 How to Run the Project
### 1. Clone the repository:
git clone https://github.com/yourusername/EmployeeManagementSystem.git
### 2. Open it in VS Code or Eclipse
### 3. Add the required Spring JARs or use Maven dependencies
### 4. Make sure your database is running and configured properly.
### 5. Run the main class:
App.java
### 6. Follow the console menu to:
Insert employees
Delete employees
View all employees
Exit program

---------- SELECT A CHOICE ----------
1. Insert Employee
2. Delete Employee
3. View All Employees
4. Exit

Enter your choice: 1
Enter Employee ID: 101
Enter Employee Name: Arjun
Enter Employee Department: IT
Enter Employee Salary: 45000
Insertion Successful!
