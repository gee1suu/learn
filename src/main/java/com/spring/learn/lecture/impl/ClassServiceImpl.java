package com.spring.learn.lecture.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.learn.lecture.ClassService;

@Service("classService")
public class ClassServiceImpl implements ClassService {

	@Autowired //타입이 일치하는 객체(인스턴스)주입 (DI)
	private ClassDAO classDAO;

	public ClassServiceImpl() {
		System.out.println(">> LectureServiceImpl() 객체 생성");
	}
	
	
}
