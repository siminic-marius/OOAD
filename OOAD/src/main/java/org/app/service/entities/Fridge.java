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
@Table(name = "Fridge")
public class Fridge implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2066369289514959212L;

	@Id
	@Column(name="fridgeId")
	private Integer fridgeId;
	
	@Column(name="fridgeName")
	private String fridgeName;
	
	@Column(name="capacityFridge")
	private Integer capacityFridge;
	
	private FridgeState fridgeState;
	
//	@ManyToMany(cascade = ALL)
//	@JoinTable(
//		name = "Fridge_Ingredients",
//		joinColumns = {@JoinColumn(name="fridgeId")},
//			inverseJoinColumns = {@JoinColumn(name = "ingredientId")}
//	)
	
	@OneToMany(mappedBy="fridge", cascade = ALL, orphanRemoval = true)
	private List<IngredientAmount> ingredientsAmounts = new ArrayList<>();

	public Integer getFridgeId() {
		return fridgeId;
	}

	public void setFridgeId(Integer fridgeId) {
		this.fridgeId = fridgeId;
	}

	public String getFridgeName() {
		return fridgeName;
	}

	public void setFridgeName(String fridgeName) {
		this.fridgeName = fridgeName;
	}

	public Integer getCapacityFridge() {
		return capacityFridge;
	}

	public void setCapacityFridge(Integer capacityFridge) {
		this.capacityFridge = capacityFridge;
	}

	public FridgeState getFridgeState() {
		return fridgeState;
	}

	public void setFridgeState(FridgeState fridgeState) {
		this.fridgeState = fridgeState;
	}

	public List<IngredientAmount> getIngredientsAmounts() {
		return ingredientsAmounts;
	}

	public void setIngredientsAmounts(List<IngredientAmount> ingredientsAmounts) {
		this.ingredientsAmounts = ingredientsAmounts;
	}

	@Override
	public String toString() {
		return "Fridge [fridgeId=" + fridgeId + ", fridgeName=" + fridgeName + ", capacityFridge=" + capacityFridge
				+ ", fridgeState=" + fridgeState + "]";
	}

	public Fridge() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
