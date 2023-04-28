package com.harsha.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harsha.entity.Bank_det;
@Repository
public interface BankRepo extends JpaRepository<Bank_det, String>{

}
