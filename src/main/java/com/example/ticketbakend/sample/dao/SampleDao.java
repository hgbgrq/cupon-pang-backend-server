package com.example.ticketbakend.sample.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SampleDao {
    String selectTestId();
}
