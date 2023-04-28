 package com.harsha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.harsha.entity.Bank_det;
import com.harsha.repo.BankRepo;


@Controller
public class BankController {
    @Autowired
	private BankRepo br;
    
    @RequestMapping("/")
    public String home() {
    	
    	return "/home";
    }
    
    @RequestMapping("/newaccount")
    public String newac(Bank_det bank) {
    	
    	return "/newacc";
    }
    
    @RequestMapping("/v")
    public String welcome(Bank_det b) {
    	String msg="";
    	Bank_det b1= new Bank_det();
    	
    	if(b.getPassword().equals(b.getCpassword())) {
    		br.save(b);
    		msg="/success";
    	}else {
    		msg="fail";
    	}
    	return msg;
    }
    
    @RequestMapping("/balance")
	public String BalanceForm(Bank_det bank) {
		
		
		return "/balform";
	}
    
    
    @RequestMapping("/vb")
	public String viewBalance(Bank_det b,Model m) {
		String message="";
		
		try {
			
		
		Bank_det b1=br.findById(b.getAc()).get();
		
		if((b.getPassword().equals(b1.getPassword())) && (b.getAc().equals(b1.getAc())) && 
				(b.getName().equals(b1.getName()))) {
			
			Bank_det bnew=br.findById(b.getAc()).get();
			m.addAttribute("user", bnew);
		
		message="/viewbalance";
		
		}else {
			message="/fail";
		}
		
		}
		catch (Exception e) {
			message="/Notfound";
		}
		return message;
	}

         
    @RequestMapping("/deposit")
	public String DepositForm() {
		
		
		return "/deposit";
	}
	
	@RequestMapping("/vd")
	public String viewDeposit(Bank_det b,Model m) {
		String message="";
		
		try {
		
		Bank_det b1=br.findById(b.getAc()).get();
		if(b.getPassword().equals(b1.getCpassword())&&b.getAc().equals(b1.getAc())&&b.getPassword().equals(b1.getPassword())) {
			
			
			b1.setAmount(b.getAmount()+b1.getAmount());
			br.save(b1);
		m.addAttribute("users", br.findAll());
		

		message="/viewbalance";
		}else {
			message="/fail";
		}
		}
		catch (Exception e) {
			message="/Notfound";
		}
		return message;
	}
	

	@RequestMapping("/withdraw")
	public String withdrawForm() {
			
		
		return "/withdraw";
	}
	
	@RequestMapping("/w")
	public String viewWithdraw(Bank_det b,Model m) {
		String message="";
		
		try {
			
		
		Bank_det b1=br.findById(b.getAc()).get();
		if(b.getPassword().equals(b1.getCpassword())&&b.getAc().equals(b1.getAc())&&b.getPassword().equals(b1.getPassword())) {
			
			
			b1.setAmount(b1.getAmount()-b.getAmount());
			br.save(b1);
		m.addAttribute("users", br.findAll());
		

		message="/viewbalance";
		}else {
			message="/fail";
		}
		}
		catch (Exception e) {
			message="/Notfound";
		}
		return message;
	}
	

	@RequestMapping("/transfer")
	public String Transfer() {
			
		
		return "/transfer";
	}
	
	@RequestMapping("/t")
	public String viewTransfer(Bank_det b,Model m) {
		String message="";
		
		try {
			
		Bank_det b1=br.findById(b.getAc()).get();
		if(b.getPassword().equals(b1.getPassword())&&b.getAc().equals(b1.getAc())
				&& b.getTranac().equals(b1.getAc())) {
			
			
			b1.setAmount(b1.getAmount()-b.getAmount());
			br.save(b1);
		m.addAttribute("users", br.findAll());
		

		message="/viewbalance";
		}else {
			message="/fail";
		}
		}
		catch (Exception e) {
			System.out.println("Entered details are wrong");
			message="/Notfound";
		}
			
		
		return message;
	}
	
       
	@RequestMapping("/close")
	public String closeAccount() {
			
		
		return "/close";
	}
	@RequestMapping("/c")
	public String closeAccount(Bank_det b,Model m) {
		String message="";
		
		try {
			
	
		Bank_det b1=br.findById(b.getAc()).get();
		if(b.getPassword().equals(b1.getCpassword())&&b.getAc().equals(b1.getAc())&&b.getPassword().equals(b1.getPassword())) {
			
			
		
			br.deleteById(b.getAc());
		m.addAttribute("users", br.findAll());
		

		message="/delete";
		}else {
			message="/fail";
		}
		}
		catch (Exception e) {
			message="/Notfound";
		}
		return message;
	}
	@RequestMapping("/about")
	public String aboutAccount() {
			
		
		return "/about";
	}
	
	
	
	
	
}

