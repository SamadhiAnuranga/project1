package com.example.OnlineLoan.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table (name="users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="fname")
	private String fname;
	@Column(name="lname")
	private String lname;
	@Column (name="birthday")
	private LocalDate birthday;
	@Column (name="loan_balance")
	private Float loanBalance;
	@Column (name="amount")
	private Float amount;
	@Column (name="installment_p")
	private String installment_p;
	
	
	public User() {
		
	}
	
	
	public User(String fname, String lname, LocalDate birthday, Float loanBalance, Float amount, String installment_p) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.birthday = birthday;
		this.loanBalance = loanBalance;
		this.amount = amount;
		this.installment_p = installment_p;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	public Float getLoanBalance() {
		return loanBalance;
	}
	public void setLoanBalance(Float loanBalance) {
		this.loanBalance = loanBalance;
	}
	public Float getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	public String getInstallment_p() {
		return installment_p;
	}
	public void setInstallment_p(String installment_p) {
		this.installment_p = installment_p;
	}
	
	
	
	

}
