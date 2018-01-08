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
@Table(name = "Ingredient")
public class Ingredient implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ingredientId")
	private String ingredientId;
	
	@Column(name="ingredientName")
	private String ingredientName;
	
	@Column(name="groupIngredient")
	private String groupIngredient;
	
	
//	@ManyToMany(mappedBy="ingredients")
	
	@OneToMany(mappedBy="ingredient", cascade = ALL, orphanRemoval = true)
	private List<IngredientAmount> ingredientAmount = new ArrayList<>();
	
	@OneToMany(mappedBy="ingredient", cascade = ALL, orphanRemoval = true)
	private List<RecipeAmount> recipeAmount = new ArrayList<>();

	public String getIngredientId() {
		return ingredientId;
	}

	public void setIngredientId(String ingredientId) {
		this.ingredientId = ingredientId;
	}

	public String getIngredientName() {
		return ingredientName;
	}

	public void setIngredientName(String ingredientName) {
		this.ingredientName = ingredientName;
	}

	public String getGroupIngredient() {
		return groupIngredient;
	}

	public void setGroupIngredient(String groupIngredient) {
		this.groupIngredient = groupIngredient;
	}

	public List<IngredientAmount> getIngredientAmount() {
		return ingredientAmount;
	}

	public void setIngredientAmount(List<IngredientAmount> ingredientAmount) {
		this.ingredientAmount = ingredientAmount;
	}

	public List<RecipeAmount> getRecipeAmount() {
		return recipeAmount;
	}

	public void setRecipeAmount(List<RecipeAmount> recipeAmount) {
		this.recipeAmount = recipeAmount;
	}

	public Ingredient() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Ingredient [ingredientId=" + ingredientId + ", ingredientName=" + ingredientName + ", groupIngredient="
				+ groupIngredient + "]";
	}
	
}
