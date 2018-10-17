package com.project.api.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="business")
public class Business {
	
  @Id
  @GeneratedValue(generator = "uuid")
  @GenericGenerator(name = "uuid", strategy = "uuid2")
  @Column(name = "id")
  private String id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="street")
	private String street;
	
	@Column(name="state")
	private String state;
	
	@Column(name="city")
	private String city;
	
	@Column(name="zip")
	private String zip;
	
	@Column(name="primaryPhone")
	private String primaryPhone;
	
	@Column(name="altPhone")
	private String altPhone;
	
	@Column(name="email")
	private String email;
	
	@Column(name="about")
	private String about;
	
  @OneToOne
	private AppUser owner;
	
	// @OneToMany(cascade=CascadeType.MERGE)
	// private Set<AppUser> employees;
	
	// @OneToMany(cascade=CascadeType.MERGE)
	// private Set<Rating> ratings;
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPrimaryPhone() {
		return primaryPhone;
	}

	public void setPrimaryPhone(String primaryPhone) {
		this.primaryPhone = primaryPhone;
	}
	
	public void setAltPhone(String altPhone) {
		this.altPhone = altPhone;
	}
	
	public String getAltPhone() {
		return altPhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public AppUser getOwner() {
		return owner;
	}

	public void setOwner(AppUser owner) {
		this.owner = owner;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	// public Set<AppUser> getEmployees() {
	// 	return employees;
	// }

	// public void setEmployees(Set<AppUser> employees) {
	// 	this.employees = employees;
	// }

	// public Set<Rating> getRatings() {
	// 	return ratings;
	// }

	// public void setRatings(Set<Rating> ratings) {
	// 	this.ratings = ratings;
	// }
	
}
