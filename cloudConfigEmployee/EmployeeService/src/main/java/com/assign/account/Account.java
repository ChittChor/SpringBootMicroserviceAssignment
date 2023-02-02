package com.assign.account;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {

	private Integer accountID;	
	private double accSalary;	
	private Integer empID;
}
