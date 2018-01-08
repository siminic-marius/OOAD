package org.app.service.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import java.io.Serializable;
import java.time.LocalDateTime;;

@Entity
@Table(name = "IngredientAmount")
public class IngredientAmount implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 345057058589031914L;

	@Id
	@Column(name="IngredientAmountId")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="ingredientId")
	private Ingredient ingredient;
	
	@ManyToOne
	@JoinColumn(name="fridgeId")
	private Fridge fridge;
	
	@Column(name="quantity")
	private Integer quantity;
	
	@Column(name = "expirationDate")
	private LocalDateTime expirationDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Ingredient getIngredient() {
		return ingredient;
	}

	public void setIngredient(Ingredient ingredient) {
		this.ingredient = ingredient;
	}

	public Fridge getFridge() {
		return fridge;
	}

	public void setFridge(Fridge fridge) {
		this.fridge = fridge;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public LocalDateTime getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(LocalDateTime expirationDate) {
		this.expirationDate = expirationDate;
	}

	public IngredientAmount() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "IngredientAmount [id=" + id + ", ingredient=" + ingredient + ", fridge=" + fridge + ", quantity="
				+ quantity + ", expirationDate=" + expirationDate + "]";
	}
	
	
	
}
