package com.example.addressapp.service;

import com.example.addressapp.entity.Address;
import com.example.addressapp.repository.AddressRepo;
import com.example.addressapp.response.AddressResponse;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class AddressService //implements InitializingBean, DisposableBean
{

    @Autowired
    private AddressRepo addressRepo;

    @Autowired
    private ModelMapper mapper;

    @Cacheable("AddressData")
    public AddressResponse findAddressByEmployeeId(int employeeId) {
        Optional<Address> AddressOp = addressRepo.findAddressByEmployeeId(employeeId);
        AddressResponse addressResponse = mapper.map(AddressOp, AddressResponse.class);
        log.info("In findAddressByEmployeeId");
        return addressResponse;
    }

    //@Override
    @PostConstruct
    public void afterPropertiesSet() throws Exception {
        log.error("In afterPropertiesSet");
        log.info("In afterPropertiesSet");
        log.warn("In afterPropertiesSet");
        log.debug("In afterPropertiesSet");
        log.trace("In afterPropertiesSet");


    }

    @PostConstruct
    public void AddressControllerPostConstruct() throws Exception {
        log.info("In AddressControllerPostConstruct");
    }
    //@Override
    @PreDestroy
    public void destroy() throws Exception {
       log.info("In destroy");
    }
}

