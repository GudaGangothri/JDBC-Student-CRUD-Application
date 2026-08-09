package com.student;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentDAO dao = new StudentDAOImpl();

        while (true) {

            System.out.println("\n=================================");
            System.out.println("   STUDENT MANAGEMENT SYSTEM");
            System.out.println("=================================");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.println("=================================");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addStudent(sc, dao);
                    break;

                case 2:
                    viewAllStudents(dao);
                    break;

                case 3:
                    searchStudent(sc, dao);
                    break;

                case 4:
                    updateStudent(sc, dao);
                    break;

                case 5:
                    deleteStudent(sc, dao);
                    break;

                case 6:
                    System.out.println("Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // ADD STUDENT
    private static void addStudent(Scanner sc, StudentDAO dao) {

        System.out.println("\n--- Add Student ---");

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter course: ");
        String course = sc.nextLine();

        Student student = new Student(name, email, age, course);

        dao.addStudent(student);
    }

    // VIEW ALL STUDENTS
    private static void viewAllStudents(StudentDAO dao) {

        System.out.println("\n--- All Students ---");

        List<Student> students = dao.getAllStudents();

        if (students.isEmpty()) {

            System.out.println("No students found.");

        } else {

            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    // SEARCH STUDENT
    private static void searchStudent(Scanner sc, StudentDAO dao) {

        System.out.println("\n--- Search Student ---");

        System.out.print("Enter student ID: ");
        int id = sc.nextInt();

        Student student = dao.getStudentById(id);

        if (student != null) {
            System.out.println(student);
        } else {
            System.out.println("Student not found.");
        }
    }

    // UPDATE STUDENT
    private static void updateStudent(Scanner sc, StudentDAO dao) {

        System.out.println("\n--- Update Student ---");

        System.out.print("Enter student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter new name: ");
        String name = sc.nextLine();

        System.out.print("Enter new email: ");
        String email = sc.nextLine();

        System.out.print("Enter new age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter new course: ");
        String course = sc.nextLine();

        Student student = new Student(id, name, email, age, course);

        dao.updateStudent(student);
    }

    // DELETE STUDENT
    private static void deleteStudent(Scanner sc, StudentDAO dao) {

        System.out.println("\n--- Delete Student ---");

        System.out.print("Enter student ID: ");
        int id = sc.nextInt();

        dao.deleteStudent(id);
    }
}