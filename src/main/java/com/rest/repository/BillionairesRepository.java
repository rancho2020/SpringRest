package com.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.rest.domain.Billionaires;

@Repository
public interface BillionairesRepository extends JpaRepository<Billionaires, Long> {

}
