package com.parker.sptformapi.dao;

import com.parker.sptformapi.dto.SpecialPaymentTermForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SPTRepository extends JpaRepository <SpecialPaymentTermForm, Integer> {

}
