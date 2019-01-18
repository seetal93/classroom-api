package com.qa.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Classroom {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private static Long id;
	@Column (length = 100)
	private String trainerName;
	@Column
	private Long classroomId;
	
	public Classroom (String trainerName, Long classroomId) {
		this.trainerName = trainerName;
		classroomId = id;
		id++;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public Long getClassroomId() {
		return classroomId;
	}

}
