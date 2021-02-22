package com.example.bookstore.Brcko.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class BillingAddress {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String BillingAddressName;
	private String BillingAddressStreet;
	private String BillingAddressCity;
	private String BillingAddressZipcode;

	@OneToOne
	private Order order;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBillingAddressName() {
		return BillingAddressName;
	}

	public void setBillingAddressName(String billingAddressName) {
		BillingAddressName = billingAddressName;
	}

	public String getBillingAddressStreet() {
		return BillingAddressStreet;
	}

	public void setBillingAddressStreet(String billingAddressStreet) {
		BillingAddressStreet = billingAddressStreet;
	}


	public String getBillingAddressCity() {
		return BillingAddressCity;
	}

	public void setBillingAddressCity(String billingAddressCity) {
		BillingAddressCity = billingAddressCity;
	}

	public String getBillingAddressZipcode() {
		return BillingAddressZipcode;
	}

	public void setBillingAddressZipcode(String billingAddressZipcode) {
		BillingAddressZipcode = billingAddressZipcode;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

}
