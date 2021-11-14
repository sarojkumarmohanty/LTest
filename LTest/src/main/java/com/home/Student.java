package com.home;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor()
@ToString()
public class Student {
	
	private Integer rollNo;
	private String name;
	private Float cgpa;

}
