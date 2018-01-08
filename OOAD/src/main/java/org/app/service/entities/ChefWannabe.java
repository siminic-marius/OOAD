package org.app.service.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import static javax.persistence.CascadeType.ALL;


@Entity
@Table(name = "ChefWannabe")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class ChefWannabe extends UserCooking implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4011829693289695506L;

	@Column(name="levelChefWannabe")
	private String levelChefWannbe;
	
	@OneToMany(mappedBy="chefwannabe", orphanRemoval = true, cascade = ALL)
	private List<CoursePreferencesChefWannaBe> coursePreferencesChefWannaBe = new ArrayList<>();
	
	@OneToMany(mappedBy="chefwannabe", orphanRemoval = true, cascade = ALL)
	private List<Recipe> recipes = new ArrayList<>();
	
	@OneToMany(mappedBy="chefWannaBe", orphanRemoval = true, cascade = ALL)
	private List<RecipePreferencesChefWannaBe> recipesPreferencesChefWannaBe = new ArrayList<>();

	public String getLevelChefWannbe() {
		return levelChefWannbe;
	}

	public void setLevelChefWannbe(String levelChefWannbe) {
		this.levelChefWannbe = levelChefWannbe;
	}

	public List<CoursePreferencesChefWannaBe> getCoursePreferencesChefWannaBe() {
		return coursePreferencesChefWannaBe;
	}

	public void setCoursePreferencesChefWannaBe(List<CoursePreferencesChefWannaBe> coursePreferencesChefWannaBe) {
		this.coursePreferencesChefWannaBe = coursePreferencesChefWannaBe;
	}

	public List<Recipe> getRecipes() {
		return recipes;
	}

	public void setRecipes(List<Recipe> recipes) {
		this.recipes = recipes;
	}

	public List<RecipePreferencesChefWannaBe> getRecipesPreferencesChefWannaBe() {
		return recipesPreferencesChefWannaBe;
	}

	public void setRecipesPreferencesChefWannaBe(List<RecipePreferencesChefWannaBe> recipesPreferencesChefWannaBe) {
		this.recipesPreferencesChefWannaBe = recipesPreferencesChefWannaBe;
	}

	@Override
	public String toString() {
		return "ChefWannabe [levelChefWannbe=" + levelChefWannbe + "]";
	}

	public ChefWannabe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChefWannabe(String levelChefWannbe, List<CoursePreferencesChefWannaBe> coursePreferencesChefWannaBe,
			List<Recipe> recipes, List<RecipePreferencesChefWannaBe> recipesPreferencesChefWannaBe) {
		super();
		this.levelChefWannbe = levelChefWannbe;
		this.coursePreferencesChefWannaBe = coursePreferencesChefWannaBe;
		this.recipes = recipes;
		this.recipesPreferencesChefWannaBe = recipesPreferencesChefWannaBe;
	} 
	
	
}
