package org.app.service.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import static javax.persistence.CascadeType.ALL;

@Entity
@Table(name = "Recipe")
public class Recipe implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 551803129035799854L;
	
	@Id
	@Column(name="recipeId")
	private Integer recipeId;
	
	@Column(name="nameRecipe")
	private String nameRecipe;
	
	@Column(name="descriptionRecipe")
	private String descriptionRecipe;
	
	private RecipeState recipeState;
	
	@Column(name="ingredientsRecipe")
	private Integer ingredientsRecipe;
	
	private Chef chef;
	
	@OneToMany(mappedBy="recipe", cascade = ALL, orphanRemoval = true )
	private List<RecipeAmount> recipeAmount = new ArrayList<>();
	
	@OneToMany(mappedBy="recipe", cascade = ALL, orphanRemoval = true)
	private List<RecipePreferencesChef> recipePreferences = new ArrayList<>();
	
	@OneToMany(mappedBy="recipe", cascade = ALL, orphanRemoval = true)
	private List<RecipePreferencesChefWannaBe> recipePreferencesChefWannaBe = new ArrayList<>();
	
	@ManyToOne
	private Chef chefForRecipe;
	
	@ManyToOne
	private ChefWannabe chefwannabe;

	public Integer getRecipeId() {
		return recipeId;
	}

	public void setRecipeId(Integer recipeId) {
		this.recipeId = recipeId;
	}

	public String getNameRecipe() {
		return nameRecipe;
	}

	public void setNameRecipe(String nameRecipe) {
		this.nameRecipe = nameRecipe;
	}

	public String getDescriptionRecipe() {
		return descriptionRecipe;
	}

	public void setDescriptionRecipe(String descriptionRecipe) {
		this.descriptionRecipe = descriptionRecipe;
	}

	public RecipeState getRecipeState() {
		return recipeState;
	}

	public void setRecipeState(RecipeState recipeState) {
		this.recipeState = recipeState;
	}

	public Integer getIngredientsRecipe() {
		return ingredientsRecipe;
	}

	public void setIngredientsRecipe(Integer ingredientsRecipe) {
		this.ingredientsRecipe = ingredientsRecipe;
	}

	public Chef getChef() {
		return chef;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public List<RecipeAmount> getRecipeAmount() {
		return recipeAmount;
	}

	public void setRecipeAmount(List<RecipeAmount> recipeAmount) {
		this.recipeAmount = recipeAmount;
	}

	public List<RecipePreferencesChef> getRecipePreferences() {
		return recipePreferences;
	}

	public void setRecipePreferences(List<RecipePreferencesChef> recipePreferences) {
		this.recipePreferences = recipePreferences;
	}

	public List<RecipePreferencesChefWannaBe> getRecipePreferencesChefWannaBe() {
		return recipePreferencesChefWannaBe;
	}

	public void setRecipePreferencesChefWannaBe(List<RecipePreferencesChefWannaBe> recipePreferencesChefWannaBe) {
		this.recipePreferencesChefWannaBe = recipePreferencesChefWannaBe;
	}

	public Chef getChefForRecipe() {
		return chefForRecipe;
	}

	@Override
	public String toString() {
		return "Recipe [recipeId=" + recipeId + ", nameRecipe=" + nameRecipe + ", descriptionRecipe="
				+ descriptionRecipe + ", recipeState=" + recipeState + ", ingredientsRecipe=" + ingredientsRecipe
				+ ", chef=" + chef + ", chefForRecipe=" + chefForRecipe + ", chefwannabe=" + chefwannabe + "]";
	}

	public void setChefForRecipe(Chef chefForRecipe) {
		this.chefForRecipe = chefForRecipe;
	}

	public ChefWannabe getChefwannabe() {
		return chefwannabe;
	}

	public void setChefwannabe(ChefWannabe chefwannabe) {
		this.chefwannabe = chefwannabe;
	}

	public Recipe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
