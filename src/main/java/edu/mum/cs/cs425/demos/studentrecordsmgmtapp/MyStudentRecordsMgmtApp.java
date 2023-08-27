package edu.mum.cs.cs425.demos.studentrecordsmgmtapp;

import edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model.Student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MyStudentRecordsMgmtApp {
  public static void main(String[] args) {
    // load student records
    Student[] students = loadStudentRecords();

    // Display the student records in ascending order of names
    System.out.println("Student Records sorted by name:");
    displayStudents(sortStudentsByName(students));

    // Get and print the list of PlatinumAlumni students in descending order of admission date
    List<Student> platinumAlumniStudents = getListOfPlatinumAlumniStudents(students);
    System.out.println("\nList of Platinum Alumni Students sorted by Admission Date Descending Order:");
    platinumAlumniStudents = sortStudentsByAdmissionDate(platinumAlumniStudents);
    displayStudents(platinumAlumniStudents.toArray(new Student[0]));

  }

  // simulate loading student records
  private static Student[] loadStudentRecords() {
    Student[] students = new Student[5];

    try {
      SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

      students[0] = new Student(1, "Luffy", dateFormat.parse("12/18/1911"));
      students[1] = new Student(2, "Sanji", dateFormat.parse("10/02/1889"));
      students[2] = new Student(3, "Zoro", dateFormat.parse("01/01/1990"));
      students[3] = new Student(4, "Remy", dateFormat.parse("08/22/2010"));
      students[4] = new Student(5, "TarTar", dateFormat.parse("02/02/1990"));
    } catch (ParseException e) {
      e.printStackTrace();
    }

    return students;
  }

  // Print a list of students in ascending order of names
  private static void displayStudents(Student[] students) {
    for (Student student : students) {
      System.out.println(student);
    }
  }

  // Sort students by name and return a new array
  private static Student[] sortStudentsByName(Student[] students) {
    Student[] sortedStudents = Arrays.copyOf(students, students.length);
    Arrays.sort(sortedStudents, Comparator.comparing(Student::getName));
    return sortedStudents;
  }

  // Sort students by admission date and return a new list
  private static List<Student> sortStudentsByAdmissionDate(List<Student> students) {
    List<Student> sortedStudents = new ArrayList<>(students);
    sortedStudents.sort(Comparator.comparing(Student::getDateOfAdmission).reversed());
    return sortedStudents;
  }

  // Get a list of PlatinumAlumni students (admission at least 30 years ago)
  private static List<Student> getListOfPlatinumAlumniStudents(Student[] students) {
    Calendar calendar = Calendar.getInstance();
    calendar.add(Calendar.YEAR, -30); // Calculate the date 30 years ago

    Date thirtyYearsAgo = calendar.getTime();

    List<Student> platinumAlumniStudents = new ArrayList<>();

    for (Student student : students) {
      if (student.getDateOfAdmission().before(thirtyYearsAgo)) {
        platinumAlumniStudents.add(student);
      }
    }

    return platinumAlumniStudents;
  }
}