package org.app.service.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "RecipePreferencesChefWannaBe")
public class RecipePreferencesChefWannaBe implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1094060208711510121L;

	@Id
	@Column(name="idRecPrefChefWannaBe")
	private Integer id;
	
	@ManyToOne
	private Recipe recipe;
	
	@ManyToOne
	private ChefWannabe chefWannaBe;

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

	public ChefWannabe getChefWannaBe() {
		return chefWannaBe;
	}

	public void setChefWannaBe(ChefWannabe chefWannaBe) {
		this.chefWannaBe = chefWannaBe;
	}

	@Override
	public String toString() {
		return "RecipePreferencesChefWannaBe [id=" + id + ", recipe=" + recipe + ", chefWannaBe=" + chefWannaBe + "]";
	}

	public RecipePreferencesChefWannaBe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
