package com.app.controller;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
	
	@Autowired
	private SqlSession sql;
	
	@GetMapping("/home")
	@ResponseBody // 데이터로 리턴
	public String home() {
		return "home -" + sql.selectOne("sql.test");
	}
}
