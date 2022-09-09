package Utils;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CalculateInterest {

    public BigDecimal interestByBrand(String brand, Double amount , LocalDate dateNow) {

        Double interest;
        BigDecimal interestAmount = null;
        switch (brand) {
            case "VISA":
                String yearString = String.valueOf(dateNow.getYear()).substring(2,4);
                int year = Integer.parseInt(yearString);
                interest = Double.valueOf((year / dateNow.getMonthValue()));
                interestAmount = BigDecimal.valueOf(amount * interest / 100);
                break;
            case "NARA":
                    interest = dateNow.getDayOfMonth() * 0.5;
                interestAmount = BigDecimal.valueOf(amount * interest / 100);
                break;
            case "AMEX":
                interest = dateNow.getMonthValue() * 0.1;
                interestAmount = BigDecimal.valueOf(amount * interest / 100);
                break;
            default:
                System.out.println("Marca invalida");
        }

        return interestAmount;
    }
}
