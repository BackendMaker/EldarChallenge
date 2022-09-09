package com.example.EldarChallenge.Service;

import com.example.EldarChallenge.Dto.Request;
import com.example.EldarChallenge.Dto.Response;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;

@Service
public class FeeService {

    public Response calculateFees(Request request){
        LocalDate dateNow = LocalDate.now();
        Double interest = null;
        String invalidBrand = null;
        switch (request.getCardBrand().toUpperCase()) {
            case "VISA":
                String yearString = String.valueOf(dateNow.getYear()).substring(2,4);
                int year = Integer.parseInt(yearString);
                interest = Double.valueOf((year / dateNow.getMonthValue()));
                break;
            case "NARA":
                interest = dateNow.getDayOfMonth() * 0.5;
                break;
            case "AMEX":
                interest = dateNow.getMonthValue() * 0.1;
                break;
            default:
                invalidBrand = "Marca invalida";

          }


        Response response = new Response();
        if(invalidBrand == null){

            response.setInterest(String.valueOf(interest) + "%" );
        }
        else{
            response.setInterest(invalidBrand);
        }



        return response;
    }

}
