package com.example.ticketbakend.sample.ctrl;

import com.example.ticketbakend.sample.model.Sample;
import com.example.ticketbakend.sample.svc.SampleSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    private SampleSvc sampleSvc;

    @GetMapping("/")
    public ResponseEntity<String> sampleGetMapping(){
        return new ResponseEntity<>(sampleSvc.selectTest(),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Sample> sampleGetMappingParameter(@PathVariable String id){
        return new ResponseEntity<>(sampleSvc.selectSample(id) , HttpStatus.OK);
    }


}
