package com.mudanza.service.impl;

import com.mudanza.entity.Provincias;
import com.mudanza.repository.ProvinciasJpaRepository;
import com.mudanza.service.ProvinciasService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service("provinciasService")
public class ProvinciasServiceImpl implements ProvinciasService {

    private static final int CTN = 10;

    private static final Log LOG = LogFactory.getLog(ProvinciasServiceImpl.class);

    @Autowired
    @Qualifier("provinciasJpaRepository")
    private ProvinciasJpaRepository provinciasJpaRepository;

    @Override
    public List<Provincias> listProvincias(Double veg1) {
        LOG.info("CALL: listProvincias(Double veg1) -- PARAMS: " + veg1);
        List<Provincias> list = provinciasJpaRepository.findByVeg1Between(new BigDecimal(veg1 - CTN),new BigDecimal(veg1 + CTN));
        LOG.info("List size: " + list.size());
        for (Provincias provincias : list) {
            LOG.info(provincias.getVeg1());
        }
        return list;
    }
}