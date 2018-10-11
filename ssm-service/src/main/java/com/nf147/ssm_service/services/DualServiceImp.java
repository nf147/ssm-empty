package com.nf147.ssm_service.services;


import org.springframework.stereotype.Service;

@Service
public class DualServiceImp implements DualService {
    @Override
    public void dual() {
        System.out.println("dual");
    }
}
