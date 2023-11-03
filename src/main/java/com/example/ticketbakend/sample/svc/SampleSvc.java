package com.example.ticketbakend.sample.svc;

import com.example.ticketbakend.sample.dao.SampleDao;
import com.example.ticketbakend.sample.model.Sample;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SampleSvc {

    @Autowired
    private SampleDao sampleDao;

    public String selectTest(){
        return sampleDao.selectTestId();
    }

    public Sample selectSample(String id){
        return sampleDao.selectSample(id);
    }

}
