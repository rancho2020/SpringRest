package com.rest.service;

import java.util.List;

import com.rest.domain.Billionaires;

//@Service
public interface BillionairesService {
	
	//@Autowired
	//BillionairesRepository repository;
	
	public void save(Billionaires customer) ;
     
    public List<Billionaires> listAll() ;
     
    public Billionaires get(Long id) ;     
    public void delete(Long id) ;

}
