package com.nf147.ssm.services;


import org.springframework.stereotype.Service;

@Service
public class DualServiceImp implements DualService {
    @Override
    public void dual() {
        System.out.println("dual");
    }
}
