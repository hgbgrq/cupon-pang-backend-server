package com.example.ticketbakend.sample.dao;

import com.example.ticketbakend.sample.model.Sample;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SampleDao {
    String selectTestId();

    Sample selectSample(String id);
}
