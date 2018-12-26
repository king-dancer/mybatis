package com.spring.mybatisconfig.util;

import java.util.*;
import java.util.stream.Collectors;

public class Student {
	private String name;
    private Integer score;
    
    
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	static Random random ;
	public Student(String string, int i) {
		this.name = string;
		this.score = i;
	}
	public static void main(String[] args) {
		 random = new Random();
		   List<Student> stuList = new ArrayList<Student>() {
		        {
		            for (int i = 0; i < 100; i++) {
		                add(new Student("student" + i, random.nextInt(50) + 50));
		            }
		        }
		    };
		System.out.println("sdfdsf");
		// 列出班上超过85分的学生姓名，并按照分数降序输出用户名字
		    List<String> studentList = stuList.stream()
            .filter(student->student.getScore()>85)
            .sorted(Comparator.comparing(Student::getScore).reversed())
            .map(Student::getName)
            .collect(Collectors.toList());
    	System.out.println(studentList);
	}
}
