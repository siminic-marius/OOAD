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
@Table(name="UserCooking")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Chef extends UserCooking implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8393723719217217591L;

	@Column(name="Michelin_Star")
	private Integer Michelin_Star;
	
	@OneToMany(mappedBy="chefForRecipe", orphanRemoval = true, cascade = ALL)
	private List<Recipe> recipes = new ArrayList<>();
	
	@OneToMany(mappedBy="chef", cascade = ALL, orphanRemoval = true)
	private List<RecipePreferencesChef> recipesPreferance = new ArrayList<>();
	
	@OneToMany
	private List<CoursePreferencesChef> preferinteCursuri = new ArrayList<>();

	public Integer getMichelin_Star() {
		return Michelin_Star;
	}

	public void setMichelin_Star(Integer michelin_Star) {
		Michelin_Star = michelin_Star;
	}

	public List<Recipe> getRecipes() {
		return recipes;
	}

	public void setRecipes(List<Recipe> recipes) {
		this.recipes = recipes;
	}

	public List<RecipePreferencesChef> getRecipesPreferance() {
		return recipesPreferance;
	}

	public void setRecipesPreferance(List<RecipePreferencesChef> recipesPreferance) {
		this.recipesPreferance = recipesPreferance;
	}

	public List<CoursePreferencesChef> getPreferinteCursuri() {
		return preferinteCursuri;
	}

	public void setPreferinteCursuri(List<CoursePreferencesChef> preferinteCursuri) {
		this.preferinteCursuri = preferinteCursuri;
	}

	@Override
	public String toString() {
		return "Chef [Michelin_Star=" + Michelin_Star + ", preferinteCursuri=" + preferinteCursuri + "]";
	}

	public Chef() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Chef(Integer michelin_Star, List<Recipe> recipes, List<RecipePreferencesChef> recipesPreferance,
			List<CoursePreferencesChef> preferinteCursuri) {
		super();
		Michelin_Star = michelin_Star;
		this.recipes = recipes;
		this.recipesPreferance = recipesPreferance;
		this.preferinteCursuri = preferinteCursuri;
	}
	
}
