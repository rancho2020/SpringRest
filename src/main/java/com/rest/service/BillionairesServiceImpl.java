package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.dao.BillionairesDaoImpl;
import com.rest.domain.Billionaires;

@Service
public class BillionairesServiceImpl implements BillionairesService {

	@Autowired
	private BillionairesDaoImpl billionairesDaoImpl;

	public List<Billionaires> listAll() {
		return (List<Billionaires>) billionairesDaoImpl.getBillionaires();
	}

	@Override
	public int deleteBillionaire(Long bilionaireiD) {
		return billionairesDaoImpl.deleteBillionaire(bilionaireiD);
	}

	@Override
	public int createBillionaires(Billionaires billionaires) {
		return billionairesDaoImpl.createBillionaires(billionaires);
	}

	@Override
	public boolean updateBillionaire(Billionaires billionaires) {
		return billionairesDaoImpl.updateBillionaire(billionaires);
	}

}
