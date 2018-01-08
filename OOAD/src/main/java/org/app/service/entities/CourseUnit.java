package org.app.service.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="CourseUnit")
public class CourseUnit implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3340386435705754842L;

	@Id
	@Column(name="courseUnitId")
	private Integer courseUnitId;
	
	@Column(name="unitNumber")
	private Integer unitNumber;
	
	@ManyToOne
	private Course course;

	public Integer getCourseUnitId() {
		return courseUnitId;
	}

	public void setCourseUnitId(Integer courseUnitId) {
		this.courseUnitId = courseUnitId;
	}

	public Integer getUnitNumber() {
		return unitNumber;
	}

	public void setUnitNumber(Integer unitNumber) {
		this.unitNumber = unitNumber;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "CourseUnit [courseUnitId=" + courseUnitId + ", unitNumber=" + unitNumber + ", course=" + course + "]";
	}

	public CourseUnit() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
