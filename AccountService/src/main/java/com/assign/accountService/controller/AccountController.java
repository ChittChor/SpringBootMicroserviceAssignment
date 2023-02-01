package com.assign.accountService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assign.accountService.model.Account;
import com.assign.accountService.repository.AccountRepository;

@RestController
@RequestMapping("/api/")
public class AccountController {

	@Autowired
	AccountRepository accRepo;
	
	@GetMapping(value = "getAccountByEmployeeId")
	public Account getAccountByEmployeeId(@RequestParam("empId") int empID) {
		return accRepo.findByEmpID(empID);
	}
	
	@GetMapping(value = "getAccounts")
	public List<Account> getAccounts() {
		return accRepo.findAll();
	}
}
