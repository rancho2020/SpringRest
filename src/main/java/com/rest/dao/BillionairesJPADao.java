package com.rest.dao;

import com.rest.domain.Billionaires;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class BillionairesJPADao implements BillionairesDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Billionaires> getBillionaires() {
        return entityManager.createQuery("Select t from com.rest.domain.Billionaires t").getResultList();
    }

    @Override
    public Billionaires getBillionaire(Long billionaireiD) {
        return entityManager.find(Billionaires.class, new Billionaires(billionaireiD));
    }

    @Override
    public int deleteBillionaire(Long bilionaireiD) {
        Billionaires billionaire = new Billionaires(bilionaireiD);
        billionaire = entityManager.merge(billionaire);
        entityManager.remove(billionaire);
        return 0;
    }

    @Override
    public Billionaires updateBillionaire(Billionaires billionaires) {
        return entityManager.merge(billionaires);
    }

    @Override
    public int createBillionaires(Billionaires billionaires) {
        entityManager.persist(billionaires);
        return 0;
    }
}
