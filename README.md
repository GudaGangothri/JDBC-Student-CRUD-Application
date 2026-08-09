# Student Management System using Java JDBC

A **Command-Line Interface (CLI) Student Management System** developed using **Java, JDBC, and MySQL**.

This project demonstrates how Java communicates with a real MySQL database using JDBC and performs CRUD operations using `PreparedStatement`.

---
## 📌 Project Overview

The application allows users to manage student records through a simple command-line interface.

### Features

* Add Student
* View All Students
* Search Student
* Update Student
* Delete Student
* Exit

---
## 🛠️ Technologies Used

* Java
* JDBC
* MySQL
* SQL
* Maven
* Eclipse IDE
* Git
* GitHub

---
## 📂 Project Structure

```text
JDBC-Student-CRUD-Application/
│
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── student/
│                   └── jdbc/
│                       │
│                       ├── Main.java
│                       │
│                       ├── model/
│                       │   └── Student.java
│                       │
│                       ├── dao/
│                       │   ├── StudentDAO.java
│                       │   └── StudentDAOImpl.java
│                       │
│                       └── util/
│                           └── DBConnection.java
│
├── database/
│   └── database.sql
│
├── screenshots/
│   ├── add-student.png
│   ├── view-students.png
│   ├── search-student.png
│   ├── update-student.png
│   ├── verifyupdate-student.png
│   ├── delete-student.png
│   └── verifydelete-student.png
│
├── pom.xml
├── .gitignore
└── README.md
```
### 📁 File Description

| File / Folder         | Description                               |
| --------------------- | ----------------------------------------- |
| `src/main/java/`      | Contains Java source files                |
| `Main.java`           | Entry point of the CLI application        |
| `Student.java`        | Model class representing student details  |
| `StudentDAO.java`     | Defines database operation methods        |
| `StudentDAOImpl.java` | Implements CRUD operations using JDBC     |
| `DBConnection.java`   | Establishes the MySQL database connection |
| `database.sql`        | Contains database and table creation SQL  |
| `screenshots/`        | Contains application screenshots          |
| `pom.xml`             | Maven configuration and dependencies      |
| `.gitignore`          | Specifies files ignored by Git            |
| `README.md`           | Project documentation                     |

---
## 🖥️ Application Menu

```text
=================================
      STUDENT MANAGEMENT SYSTEM
=================================
1. Add Student
2. View All Students
3. Search Student
4. Update Student
5. Delete Student
6. Exit
=================================
```
---

## 🔨 CRUD Operations

### 1. Add Student

Allows the user to add a new student to the database.

```text
--- Add Student ---

Enter name: Mythili
Enter email: mythili@gmail.com
Enter age: 16
Enter course: C++

Student added successfully.
```

### 2. View All Students

Displays all student records stored in the MySQL database.

### 3. Search Student

Allows the user to search for a particular student.

### 4. Update Student

Allows the user to update existing student information.

### 5. Delete Student

Allows the user to delete a student record from the database.

---

## 🗄️ Database Structure

### Database

```text
student_management
```

### Table

```text
students
```

### Columns

| Column   | Data Type    | Description                 |
| -------- | ------------ | --------------------------- |
| `id`     | INT          | Primary Key, Auto Increment |
| `name`   | VARCHAR(100) | Student Name                |
| `email`  | VARCHAR(100) | Student Email               |
| `age`    | INT          | Student Age                 |
| `course` | VARCHAR(100) | Student Course              |

---

## 🔐 PreparedStatement

The application uses `PreparedStatement` instead of SQL string concatenation.

Example:

```java
String sql = "INSERT INTO students(name, email, age, course) VALUES (?, ?, ?, ?)";

PreparedStatement ps = connection.prepareStatement(sql);
ps.setString(1, name);
ps.setString(2, email);
ps.setInt(3, age);
ps.setString(4, course);
ps.executeUpdate();
```

Using `PreparedStatement` provides parameterized SQL queries and helps protect against SQL injection.

---
## 🔄 Application Flow

```text
User
  │
  ▼
CLI Application
  │
  ▼
Java
  │
  ▼
JDBC
  │
  ▼
PreparedStatement
  │
  ▼
MySQL Database
  │
  ▼
students Table
```

---
## ⚙️ Prerequisites

Before running the project, install:

* Java JDK
* MySQL Server
* MySQL Workbench
* Maven
* Eclipse IDE

---

## 🚀 Setup Instructions

### Step 1: Clone the Repository

```bash
git clone YOUR_GITHUB_REPOSITORY_URL
```

### Step 2: Create the Database

Open MySQL Workbench and execute:

```sql
CREATE DATABASE student_management;

USE student_management;

CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    age INT,
    course VARCHAR(100)
);
```

You can also execute the SQL file:

```text
database/database.sql
```

### Step 3: Configure Database Connection

Configure the database URL, username, and password in your database connection class.

Example:

```text
jdbc:mysql://localhost:3306/student_management
```

**Do not upload your actual MySQL password to GitHub.**

### Step 4: Run the Application

1. Open the project in Eclipse.
2. Make sure MySQL Server is running.
3. Run the `Main.java` class.
4. Select an option from the menu.
5. Perform the required operation.

---

# 📸 Screenshots

### 1. Add Student

![Add Student](screenshots/add-student.png)

### 2. View All Students

![View All Students](screenshots/view-students.png)

### 3. Search Student

![Search Student](screenshots/search-student.png)

### 4. Update Student

![Update Student](screenshots/update-student.png)

### 5. Verify Updated Student

![Verify Updated Student](screenshots/verifyupdate-student.png)

### 6. Delete Student

![Delete Student](screenshots/delete-student.png)

### 7. Verify Deleted Student

![Verify Deleted Student](screenshots/verifydelete-student.png)

---

## 📚 JDBC Concepts Demonstrated

* JDBC Driver
* `DriverManager`
* `Connection`
* `PreparedStatement`
* `ResultSet`
* SQL CRUD operations
* Parameterized queries
* Exception handling
* Database connectivity
* Resource management

---

## 🧠 Learning Outcomes

Through this project, I learned how to:

* Connect Java to MySQL using JDBC.
* Establish and manage database connections.
* Execute SQL queries from Java.
* Use `PreparedStatement`.
* Perform CRUD operations.
* Retrieve data using `ResultSet`.
* Handle database exceptions.
* Manage JDBC resources.
* Build a CLI application connected to a real database.

---

## 🔮 Future Improvements

* Add input validation
* Improve exception handling
* Add logging
* Add unit testing
* Use environment variables for database credentials
* Add GUI interface
* Convert the application into a Spring Boot REST API

---

## 👩‍💻 Author

**Gangothri Guda**

Java | JDBC | MySQL | SQL | Spring Boot

---

## 📌 Project Status

**Completed ✅**

A functional Student Management System using **Java JDBC and MySQL**, implementing Create, Read, Update, and Delete operations with `PreparedStatement`.
