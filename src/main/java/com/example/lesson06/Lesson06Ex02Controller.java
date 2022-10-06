package com.example.lesson06;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.lesson04.bo.UserBO;

@RequestMapping("/lesson06")
@Controller
public class Lesson06Ex02Controller {
	@Autowired
	private UserBO userBO;

	@RequestMapping("/ex02/add_name_view")
	public String addNameView() {
		return "lesson06/addName";
	}

	// JSON String    [{"키":value}]
	// AJAX 요청 -> ResponseBody
	@ResponseBody
	@GetMapping("/ex02/is_duplication")
	public Map<String, Boolean> isDuplication(
			@RequestParam("name") String name) {

		// {"is_duplication":true}   => 중복일 때
		Map<String, Boolean> result = new HashMap<>();
		boolean isDuplication = userBO.existUserByName(name);
		result.put("is_duplication", isDuplication);
		return result;
	}
}
