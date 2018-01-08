package org.app.service.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "RecipePreferencesChef")
public class RecipePreferencesChef implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8046937504833652888L;

	@Id
	@Column(name="RecipesPreferencesId")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="recipeId")
	private Recipe recipe;
	
	@ManyToOne
	@JoinColumn(name="chefId")
	private Chef chef;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Recipe getRecipe() {
		return recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}

	public Chef getChef() {
		return chef;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	@Override
	public String toString() {
		return "RecipePreferences [id=" + id + ", recipe=" + recipe + ", chef=" + chef + "]";
	}

	public RecipePreferencesChef() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
