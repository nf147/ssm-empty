package com.nf147.ssm.dao;

import com.nf147.ssm.entity.Echo;

import java.util.List;

public interface EchoDAO {
    Echo findById(int id);

    List<Echo> findAll();
}
