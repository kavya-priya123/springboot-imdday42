package com.jobiak.imd;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.jobiak.imd.model.Customer;
import com.jobiak.imd.repository.CustomerRepo;
@Component
public class MyCommandLineClass implements CommandLineRunner
{

	@Autowired
	CustomerRepo repo;
	
	@Autowired
	Customer cust;
	
	@Override
	public void run(String... args) throws Exception 
	{
		cust.setAcctno(1);
		cust.setName("Prayan");
		cust.setBalance(4000);
		repo.save(cust);
		/*Customer c1=new Customer();
		c1.setAcctno(101);
		c1.setName("Xiang");
		c1.setBalance(4000);
		repo.save(c1);
		
		Customer c2=new Customer();
		c2.setAcctno(102);
		c2.setName("Nobitha");
		c2.setBalance(5000);
		repo.save(c2);
		
		Customer c3=new Customer();
		c3.setAcctno(103);
		c3.setName("Deki-suki");
		c3.setBalance(9000);
		repo.save(c3);
		
		Customer c4=new Customer();
		c4.setAcctno(104);
		c4.setName("Sichan");
		c4.setBalance(97000);
		repo.save(c4);
		
		Optional<Customer> cust=repo.findById(102L);
		if(cust.isPresent())
		{
			System.out.println(cust.get());
		}
		
		List<Customer> list=repo.findAll();
		for(Customer c:list)
		{
			System.out.println(c);
		}
		*/
	}
}
//Java configuration {1.xml configuration,2.annotation based and 3.now java}
@Configuration
class CustomerConfiguration
{
	@Bean
	public Customer createCustomer()
	{
		return new Customer();
	}

}


