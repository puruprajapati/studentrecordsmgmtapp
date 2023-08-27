package edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model;
import java.util.Date;

public class Student {
  private int studentId;
  private String name;
  private Date dateOfAdmission;

  // Default constructor
  public Student() {
  }

  // Constructor with all fields
  public Student(int studentId, String name, Date dateOfAdmission) {
    this.studentId = studentId;
    this.name = name;
    this.dateOfAdmission = dateOfAdmission;
  }

  // Constructor with studentId and name
  public Student(int studentId, String name) {
    this.studentId = studentId;
    this.name = name;
  }

  // Getter for studentId
  public int getStudentId() {
    return studentId;
  }

  // Setter for studentId
  public void setStudentId(int studentId) {
    this.studentId = studentId;
  }

  // Getter for name
  public String getName() {
    return name;
  }

  // Setter for name
  public void setName(String name) {
    this.name = name;
  }

  // Getter for dateOfAdmission
  public Date getDateOfAdmission() {
    return dateOfAdmission;
  }

  // Setter for dateOfAdmission
  public void setDateOfAdmission(Date dateOfAdmission) {
    this.dateOfAdmission = dateOfAdmission;
  }

  @Override
  public String toString() {
    return "Student{" +
      "studentId=" + studentId +
      ", name='" + name + '\'' +
      ", dateOfAdmission=" + dateOfAdmission +
      '}';
  }
}
