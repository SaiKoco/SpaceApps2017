package com.mudanza.repository;

import com.mudanza.entity.Provincias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Repository("provinciasJpaRepository")
public interface ProvinciasJpaRepository extends JpaRepository<Provincias,Serializable> {
    public abstract List<Provincias> findByVeg1Between(BigDecimal veg1min, BigDecimal veg1max);
}
