package org.app.service.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "UserCooking")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class UserCooking implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -124138618091734304L;
	@Id
	@Column(name="idUserCooking")
	private Integer idUserCooking;
	
	@Column(name="nameUser")
	private String nameUser;
	
	@Column(name="cityUser")
	private String cityUser;
	
	@Column(name="phoneNumber")
	private Integer phoneNumber;
	
	@Column(name="sexUser")
	private String sexUser;

	public Integer getIdUserCooking() {
		return idUserCooking;
	}

	public void setIdUserCooking(Integer idUserCooking) {
		this.idUserCooking = idUserCooking;
	}

	public String getNameUser() {
		return nameUser;
	}

	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}

	public String getCityUser() {
		return cityUser;
	}

	public void setCityUser(String cityUser) {
		this.cityUser = cityUser;
	}

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getSexUser() {
		return sexUser;
	}

	public void setSexUser(String sexUser) {
		this.sexUser = sexUser;
	}
	
	public UserCooking() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UserCooking [idUserCooking=" + idUserCooking + ", nameUser=" + nameUser + ", cityUser=" + cityUser
				+ ", phoneNumber=" + phoneNumber + ", sexUser=" + sexUser + "]";
	}

}
