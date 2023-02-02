package com.assign.accountService.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "account")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "account_id")
	private Integer accountID;
	
	@Column(name = "salary")
	private double accSalary;
	
	@Column(name = "emp_id", unique = true)
	private Integer empID;

	public Integer getAccountID() {
		return accountID;
	}

	public void setAccountID(Integer accountId) {
		this.accountID = accountId;
	}

	public double getAccSalary() {
		return accSalary;
	}

	public void setAccSalary(double accSalary) {
		this.accSalary = accSalary;
	}

	public Integer getEmpID() {
		return empID;
	}

	public void setEmpID(Integer empID) {
		this.empID = empID;
	}	
	
}
