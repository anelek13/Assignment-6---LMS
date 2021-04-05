package com.example.librarymanagementsystem.controller;

import com.example.librarymanagementsystem.config.SpringConfig;
import com.example.librarymanagementsystem.entity.*;
import com.example.librarymanagementsystem.repository.*;
import com.example.librarymanagementsystem.service.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class SpringController {
    public static void start(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        UserRepository userRepository = context.getBean("userRepository", UserRepository.class);
        System.out.println("userRepository.findAll() = " + userRepository.findAll());

        User user = new User();
        user.setName("Zhumabek Anel");
        user.setAge(30);

        Student student = new Student();
        student.setName("Zhumabek Anel");
        student.setUsername("Zhaaneel");

        Student student2 = new Student();
        student2.setName("Isaeva Nargiz");
        student2.setUsername("Narik");

        Address address = new Address();
        address.setHouseNo(90);
        address.setStreet("Bakers St.");

        user.setAddress(address);

        userRepository.saveAndFlush(user);
        BookRepository bookRepository = context.getBean("bookRepository", BookRepository.class);
        System.out.println("bookRepository.findAll() = " + bookRepository.findAll());
        Course course = new Course();
        course.setId(1L);
        course.setName("Spring Framework");
        course.setInstructorName("Zhanbolat Seitkulov");
        Page page = new Page();
        Book book = new Book();
        page.setBookId(book.getId());
        page.setBook(book);
        page.setPageNo(1137);
        book.setTitle("The Lord of the Rings");
        book.setAuthpr("John Ronald Reuel Tolkien");
        book.setPages(book.getPages());
        book.setAvailablity(true);
        List<Book> bookList = new ArrayList<Book>();
        bookList.add(book);
        List<Course> courseList = new ArrayList<Course>();
        courseList.add(course);
        StudentRepository studentRepository = context.getBean("studentRepository", StudentRepository.class);
        System.out.println("studentRepository.findAll() = " + studentRepository.findAll());

        course.setName("Development Java Framework");
        course.setInstructorName("Seitkulov Zhanbolat");
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(student);
        studentList.add(student2);
        course.setStudentList(studentList);

        StudentService service = new StudentService();
        service.addNewStudent("Zhumabek Anel", "Anel", bookList, courseList);
        service.findStudentByName(studentList, "Zhumabek Anel");
        service.showStudentsBooks(student);
    }
}
