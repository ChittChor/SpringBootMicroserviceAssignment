package com.assign.employee.feign.model;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.assign.account.Account;

@FeignClient(name = "ACCOUNT-SERVICE" , url = "http://localhost:8097")
public interface AccountRestConsumer {
	@GetMapping(value = "/api/getAccountByEmployeeId")
	public Account getAccountByEmployeeId(@RequestParam("empId") Integer empID);
}
