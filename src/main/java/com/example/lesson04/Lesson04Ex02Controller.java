package com.example.lesson04;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.lesson04.model.Student;

@RequestMapping("/lesson04/ex02")
@Controller
public class Lesson04Ex02Controller {

	@RequestMapping("/add_student_view")
	public String addStudentView() {
		return "lesson04/addStudent";
	}

	@PostMapping("/add_student")
	public String addStudent(
			@ModelAttribute Student student, // name(request param)과 일치하는 필드에 값이 들어간다.
			Model model) {

		// db insert


		// db select

		// model에 담는다.

		// jsp 경로 리턴한다.
		return "lesson04/afterAddStudent";
	}
}