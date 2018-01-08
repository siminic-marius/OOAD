package org.app.service.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import static javax.persistence.CascadeType.ALL;

@Entity
@Table(name="Course")
public class Course implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6014226932924962553L;

	@Id
	@Column(name="courseId")
	private Integer courseId;
	
	@Column(name="courseName")
	private String courseName;
	
	@Column(name="courseDescription")
	private String courseDescription;
	
	@Column(name="durationCourse")
	private Integer durationCourse;
	
	@Column(name="rating")
	private Integer rating;
	
	private CourseState courseStates;
	
	@OneToMany(mappedBy = "course", orphanRemoval = true, cascade = ALL )
	private List<CoursePreferencesChef> preferencesCourses = new ArrayList<>();
	
	@OneToMany(mappedBy = "course", orphanRemoval = true, cascade = ALL )
	private List<CourseUnit> courseUnit = new ArrayList<>();
	
	@OneToMany(mappedBy = "course")
	private List<CoursePreferencesChefWannaBe> chefWannaBeCoursePreferences = new ArrayList<>();

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	public Integer getDurationCourse() {
		return durationCourse;
	}

	public void setDurationCourse(Integer durationCourse) {
		this.durationCourse = durationCourse;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public CourseState getCourseStates() {
		return courseStates;
	}

	public void setCourseStates(CourseState courseStates) {
		this.courseStates = courseStates;
	}

	public List<CoursePreferencesChef> getPreferencesCourses() {
		return preferencesCourses;
	}

	public void setPreferencesCourses(List<CoursePreferencesChef> preferencesCourses) {
		this.preferencesCourses = preferencesCourses;
	}

	public List<CourseUnit> getCourseUnit() {
		return courseUnit;
	}

	public void setCourseUnit(List<CourseUnit> courseUnit) {
		this.courseUnit = courseUnit;
	}

	public List<CoursePreferencesChefWannaBe> getChefWannaBeCoursePreferences() {
		return chefWannaBeCoursePreferences;
	}

	public void setChefWannaBeCoursePreferences(List<CoursePreferencesChefWannaBe> chefWannaBeCoursePreferences) {
		this.chefWannaBeCoursePreferences = chefWannaBeCoursePreferences;
	}

	
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseDescription="
				+ courseDescription + ", durationCourse=" + durationCourse + ", rating=" + rating + ", courseStates="
				+ courseStates + "]";
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
