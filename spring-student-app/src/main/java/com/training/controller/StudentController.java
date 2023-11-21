package com.training.controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.training.entity.Student;
import com.training.repository.StudentRepository;

@Controller
public class StudentController {

	@Autowired
	private StudentRepository studrepo;

	@RequestMapping("/stud")
	public String add(Student student, Map model) {
		studrepo.save(student);
		model.put("message", "data added successfully");
		return "index.jsp";	

	}
	
	@RequestMapping("/viewStudent")
	public String fetchAllStudent(Map model) {
		List<Student> list = studrepo.findAll();
		model.put("student", list);
		return "view.jsp";	
	}
	
	@RequestMapping("/deleteStudent")
	public String deleteStudent(@RequestParam int rollno, Map model) {
		studrepo.deleteById(rollno);
		model.put("message", "Record delete successfully");
		return "index.jsp";
	}
	
	@RequestMapping("/editStudent")
	public String edit(@RequestParam int rollno, Map model) {
		Student s = studrepo.findById(rollno).get();
		model.put("student", s);
		return "editStudent.jsp";
		
	}
	
	@RequestMapping("/updateStudent")
	public String update(Student student, Map model) {
		studrepo.save(student);
		return "index.jsp";
		
	}
	
}
