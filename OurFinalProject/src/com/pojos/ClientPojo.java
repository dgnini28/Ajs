package com.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="client")
public class ClientPojo {
	@Id
	@Column(name="clnt_name")
	private String clnt_name;
	@Column(name="clnt_address")
	private String clnt_address;
	@Column(name="clnt_email")
	private String clnt_email;
	@Column(name="clnt_domain")
	private String clnt_domain;
	@Column(name="clnt_revenue")
	private String clnt_revenue;
	@Column(name="clnt_empnum")
	private int  clnt_empnum;
	@Column(name="clnt_ceo")
	private String clnt_ceo;
	@Column(name="clnt_contact")
	private int clnt_contact;
	@Column(name="clnt_offices")
	private String clnt_offices;
	@Column(name="clnt_status")
	private String clnt_status;
	public ClientPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ClientPojo(String clnt_name, String clnt_address, String clnt_email,
			String clnt_domain, String clnt_revenue, int clnt_empnum,
			String clnt_ceo, int clnt_contact, String clnt_offices,
			String clnt_status) {
		super();
		this.clnt_name = clnt_name;
		this.clnt_address = clnt_address;
		this.clnt_email = clnt_email;
		this.clnt_domain = clnt_domain;
		this.clnt_revenue = clnt_revenue;
		this.clnt_empnum = clnt_empnum;
		this.clnt_ceo = clnt_ceo;
		this.clnt_contact = clnt_contact;
		this.clnt_offices = clnt_offices;
		this.clnt_status = clnt_status;
	}
	public void setClnt_name(String clnt_name) {
		this.clnt_name = clnt_name;
	}
	public void setClnt_address(String clnt_address) {
		this.clnt_address = clnt_address;
	}
	public void setClnt_email(String clnt_email) {
		this.clnt_email = clnt_email;
	}
	public void setClnt_domain(String clnt_domain) {
		this.clnt_domain = clnt_domain;
	}
	public void setClnt_revenue(String clnt_revenue) {
		this.clnt_revenue = clnt_revenue;
	}
	public void setClnt_empnum(int clnt_empnum) {
		this.clnt_empnum = clnt_empnum;
	}
	public void setClnt_ceo(String clnt_ceo) {
		this.clnt_ceo = clnt_ceo;
	}
	public void setClnt_contact(int clnt_contact) {
		this.clnt_contact = clnt_contact;
	}
	public void setClnt_offices(String clnt_offices) {
		this.clnt_offices = clnt_offices;
	}
	public void setClnt_status(String clnt_status) {
		this.clnt_status = clnt_status;
	}
	
	
	public String getClnt_name() {
		return clnt_name;
	}
	public String getClnt_address() {
		return clnt_address;
	}
	public String getClnt_email() {
		return clnt_email;
	}
	public String getClnt_domain() {
		return clnt_domain;
	}
	public String getClnt_revenue() {
		return clnt_revenue;
	}
	public int getClnt_empnum() {
		return clnt_empnum;
	}
	public String getClnt_ceo() {
		return clnt_ceo;
	}
	public int getClnt_contact() {
		return clnt_contact;
	}
	public String getClnt_offices() {
		return clnt_offices;
	}
	public String getClnt_status() {
		return clnt_status;
	}
	@Override
	public String toString() {
		return "ClientPojo [clnt_name=" + clnt_name + ", clnt_address="
				+ clnt_address + ", clnt_email=" + clnt_email
				+ ", clnt_domain=" + clnt_domain + ", clnt_revenue="
				+ clnt_revenue + ", clnt_empnum=" + clnt_empnum + ", clnt_ceo="
				+ clnt_ceo + ", clnt_contact=" + clnt_contact
				+ ", clnt_offices=" + clnt_offices + ", clnt_status="
				+ clnt_status + "]";
	}
	
	
}
