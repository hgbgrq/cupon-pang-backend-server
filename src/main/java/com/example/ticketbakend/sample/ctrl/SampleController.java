package com.example.ticketbakend.sample.ctrl;

import com.example.ticketbakend.sample.model.Sample;
import com.example.ticketbakend.sample.svc.SampleSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    private SampleSvc sampleSvc;

    @GetMapping("/")
    public String sampleGetMapping(){
        return sampleSvc.selectTest();
    }

    @GetMapping("/{id}")
    public Sample sampleGetMappingParameter(@PathVariable String id){
        return sampleSvc.selectSample(id);
    }


}
