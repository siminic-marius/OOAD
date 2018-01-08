package org.app.service.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CoursePreferencesChefWannaBe")
public class CoursePreferencesChefWannaBe implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2183031798117220339L;

	@Id
	@Column(name="idCoursePreferences")
	private Integer id;
	
	@ManyToOne
	private Course course;
	
	@ManyToOne
	private ChefWannabe chefwannabe;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public ChefWannabe getChefwannabe() {
		return chefwannabe;
	}

	public void setChefwannabe(ChefWannabe chefwannabe) {
		this.chefwannabe = chefwannabe;
	}

	@Override
	public String toString() {
		return "CoursePreferencesChefWannaBe [id=" + id + ", course=" + course + ", chefwannabe=" + chefwannabe + "]";
	}

	public CoursePreferencesChefWannaBe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
