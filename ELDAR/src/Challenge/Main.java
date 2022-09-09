package Challenge;
import Utils.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

import static Utils.ParseDate.stringToDate;


public class Main {
   static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Transaction transaction = setOperacion();
        ValidateCard.validateAmount(transaction);

        // Invocar un método que devuelva toda la información de una tarjeta//
        Card card = setTarjeta(setCardHolder());
        ValidateCard.validateCard(card , transaction);
        System.out.println(card.toString());
        //

        //Calculo de intereses
        CalculateInterest calculateInterest = new CalculateInterest();
        BigDecimal interest= calculateInterest.interestByBrand(card.getMarca().toUpperCase() , transaction.getAmount() , transaction.getDate());
        System.out.println( "La taza de interes es del: " + interest + "%");
        //

        Card card1 = setTarjeta(setCardHolder());
        ValidateCard.validateCard(card1 , transaction);
        System.out.println(card1.toString());
        System.out.println( (ValidateCard.notEqualCard(card , card1))? "Las tarjetas son iguales" : "Las tarjetas son distintas");

    }

    public static CardHolder setCardHolder(){
        CardHolder cardHolder = new CardHolder();
        System.out.println("Ingrese su nombre");
        String nombre = input.nextLine();
        System.out.println("Ingrese su apellido");
        String apellido = input.nextLine();
        cardHolder.setName(nombre);
        cardHolder.setLastName(apellido);
        return cardHolder;
    }

    public static Card setTarjeta(CardHolder cardHolder){
        Card card = new Card();
        card.setCardHolder(cardHolder);
        System.out.println("Ingrese la marca de su tarjeta");
        String marca = input.nextLine();
        card.setMarca(marca);

        System.out.println("Ingrese los numeros de la tarjeta");
        long cardNumber = Long.parseLong(input.nextLine());
        card.setCardNumber(cardNumber);

        System.out.println("Ingrese la feha de vencimiento (Ingresar mes/año)");
        LocalDate expirationDate = stringToDate(input.nextLine());
        card.setExpirationDate(expirationDate);

        return card;
    }

    public static Transaction setOperacion(){
        Transaction transaction = new Transaction();
        System.out.println("Ingrese el monto de la operacion");
        double monto = Double.parseDouble(input.nextLine());
        transaction.setAmount(monto);
        transaction.setDate(LocalDate.now());

        return transaction;
    };

}
