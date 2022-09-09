package com.example.EldarChallenge.Controllers;

import com.example.EldarChallenge.Dto.Request;
import com.example.EldarChallenge.Dto.Response;
import com.example.EldarChallenge.Service.FeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RestController
public class FeeController {

    @Autowired
    private FeeService service;

    @GetMapping(value = "/getInterest")
    public ResponseEntity<Response> feePercentaje(@Valid @RequestBody Request request){
        Response response = service.calculateFees(request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
