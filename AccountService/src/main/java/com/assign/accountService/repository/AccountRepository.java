package com.assign.accountService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.assign.accountService.model.Account;

public interface AccountRepository extends JpaRepository<Account, Integer>{
	
	public Account findByEmpID(Integer empID);
}
