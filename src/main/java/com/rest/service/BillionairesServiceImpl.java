package com.rest.service;

import com.rest.dao.BillionairesDao;
import com.rest.domain.Billionaires;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillionairesServiceImpl implements BillionairesService {

	@Autowired
	private BillionairesDao billionairesJPADao;

	public List<Billionaires> listAll() {
		return (List<Billionaires>) billionairesJPADao.getBillionaires();
	}

	@Override
	public int deleteBillionaire(Long bilionaireiD) {
		return billionairesJPADao.deleteBillionaire(bilionaireiD);
	}

	@Override
	public int createBillionaires(Billionaires billionaires) {
		return billionairesJPADao.createBillionaires(billionaires);
	}

	@Override
	public Billionaires updateBillionaire(Billionaires billionaires) {
		return billionairesJPADao.updateBillionaire(billionaires);
	}

}
