package com.rest.repository;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rest.domain.Billionaires;
import com.rest.domain.BillionairesMapper;

@Repository
public class BillionairesDaoImpl implements BillionairesDao {

	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	/*
	 * public BillionairesDaoImpl(DataSource dataSource) { jdbcTemplate = new
	 * JdbcTemplate(dataSource); }
	 */
	
	@PostConstruct
	  private void postConstruct() {
	      jdbcTemplate = new JdbcTemplate(dataSource);
	  }
	
	public List<Billionaires> getBillionaires() {
		List<Billionaires> billionaires = null;
		
		billionaires=  jdbcTemplate.query("SELECT * FROM BILLIONAIRES;", new BillionairesMapper());

		/*
		 * try { billionaires = jdbcTemplate.query("SELECT * FROM trn_employee", new
		 * BeanPropertyRowMapper<Billionaires>(Billionaires.class)); } catch
		 * (DataAccessException e) { e.printStackTrace(); }
		 */
		return billionaires;
	}

	public Billionaires getBillionaire(Long billionaireiD) {
		Billionaires billionaires = null;
		return billionaires;

	}

	public int deleteBillionaire(Long billionaireiD) {
		//return 2;
		System.out.println("deleteing user-"+billionaireiD);
		int deleted = jdbcTemplate.update("delete from billionaires where id = ?", billionaireiD) ;
		return deleted;
	}

	public int updateBillionaire(Billionaires billionaires) {
		return 0;
	}

	public int createBillionaires(Billionaires billionaires) {
		
		int save = jdbcTemplate.update("insert into billionaires(first_name, last_name, career) values(?,?,?);", billionaires.getFirstName(), billionaires.getLastName()
				,billionaires.getCareer());
	return save;	
	}

}