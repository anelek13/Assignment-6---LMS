package com.example.librarymanagementsystem.service;

import com.example.librarymanagementsystem.entity.Book;
import com.example.librarymanagementsystem.entity.Student;
import com.example.librarymanagementsystem.entity.Course;
import java.util.List;

public class StudentService {
    public void addNewStudent(String name, String username, List<Book> bookList, List<Course> courseList){
        Student student = new Student();
        student.setName(name);
        student.setUsername(username);
        student.setBookList(bookList);
        student.setCourseList(courseList);
    }
    public void findStudentByName(List<Student> studentList, String name){
        for(Student student : studentList){
            if(student.getName().equals(name))
                student.toString();
            else System.out.println("Student not found!");
        }
    }
    public void findStudentByUsername(List<Student> studentList, String username){
        for(Student student : studentList){
            if(student.getUsername().equals(username))
                student.toString();
            else System.out.println("Student not found!");
        }
    }
    public void findStudentById(List<Student> studentList, int id){
        for(Student student : studentList){
            if(student.getId().equals(id))
                student.toString();
            else System.out.println("Student not found!");
        }
    }
    public void showStudentsBooks(Student student){
        student.getBookList().toString();
    }

}
