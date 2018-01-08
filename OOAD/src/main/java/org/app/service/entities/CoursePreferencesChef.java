package org.app.service.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CoursePreferencesChef")
public class CoursePreferencesChef implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -34344587216288510L;

	@Id
	@Column(name="CoursePreferencesId")
	private Integer id;
	
	@ManyToOne
	private Chef chef;
	
	@ManyToOne
	private Course course;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Chef getChef() {
		return chef;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "PreferencesCourse [id=" + id + ", chef=" + chef + ", course=" + course + "]";
	}

	public CoursePreferencesChef() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
