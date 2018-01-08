package org.app.service.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "RecipeAmount")
public class RecipeAmount {
	
	@Id
	@Column(name="RecipeAmountId")
	private Integer id;
	
	@Column(name="amount")
	private String amount;
	
	@ManyToOne
	@JoinColumn(name="ingredientId")
	private Ingredient ingredient;
	
	@ManyToOne
	@JoinColumn(name="recipeId")
	private Recipe recipe;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Ingredient getIngredient() {
		return ingredient;
	}

	public void setIngredient(Ingredient ingredient) {
		this.ingredient = ingredient;
	}

	public Recipe getRecipe() {
		return recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}

	public RecipeAmount() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "RecipeAmount [id=" + id + ", amount=" + amount + ", ingredient=" + ingredient + ", recipe=" + recipe
				+ "]";
	}
	
	
}
