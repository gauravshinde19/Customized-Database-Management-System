# Customized Database Management System

## Description
- In this project we implement our Customized Virtual Database Management System.
- In this project we used the concept of collection framework from java to store the data.
- In this project we replicate almost all the functionalities of SQL Programming.
- The aim of this project is used to understand the working of DBMS by using SQL Language.

## Features

- **Insert Records:** Add new employee records.
- **View All Records:** Display all employee records in the database.
- **View Specific Record:** Search for and display records by Employee ID or Name.
- **Delete Records:** Remove employee records by Employee ID or Name.
- **Aggregate Functions:**
  - Sum of all salaries
  - Maximum salary
  - Minimum salary
  - Average salary
  - Count of employees

## Code Overview

### Employee Class

The `Employee` class represents an employee with the following attributes:

- **EID:** Unique Employee ID (auto-incremented).
- **Ename:** Employee Name.
- **EAddress:** Employee Address.
- **ESalary:** Employee Salary.

### MarvellousDBMS Class

The `MarvellousDBMS` class provides methods to perform various operations on employee records, such as inserting, deleting, and querying data. It utilizes a `LinkedList` to store and manage the employee records.

### CustomizedDBMS Class (Main)

The `CustomizedDBMS` class contains the main method and the interactive menu that allows the user to perform different database operations.

## Getting Started

### Prerequisites

- **Java Development Kit (JDK)**
- A code editor or IDE like IntelliJ IDEA, Eclipse, or VS Code.

### Running the Application

1. **Clone the repository:**
   ```bash
   git clone https://github.com/gauravshinde19/Customized-Database-Management-System.git
   ```

2. **Navigate to the project directory:**
   ```bash
   cd Customized-Database-Management-System
   ```

3. **Compile the Java code:**
   ```bash
   javac CustomizedDBMS.java
   ```

4. **Run the application:**
   ```bash
   java CustomizedDBMS
   ```
## LICENSE
This project is licensed under the MIT License - see the `LICENSE` file for details.
