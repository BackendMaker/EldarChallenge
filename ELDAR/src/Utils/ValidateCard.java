package Utils;

import Challenge.Transaction;
import Challenge.Card;

import javax.swing.*;
import java.time.LocalDate;

public class ValidateCard {

    public static void validateAmount(Transaction transaction){
         double amount = transaction.getAmount();
        if (amount > 1000) {
            System.out.println("El monto debe ser menor a $1000, usted ingreso $" + amount);

            System.exit(1);
        }
    }

    public static void validateCard(Card card, Transaction transaction){
        LocalDate dateTransaction = transaction.getDate();
        LocalDate expirationDateCard = card.getExpirationDate();
        boolean isBefore = dateTransaction.isBefore(expirationDateCard);
        LocalDate expirationDate = card.getExpirationDate();
        LocalDate dateNow = transaction.getDate();

        if(!isBefore){
            System.out.println("Tarjeta expirada");
            System.exit(1);
        }


    }

    public static boolean notEqualCard (Card card1, Card card2 ){
        boolean isEqualCardNumber = (card1.getCardNumber() == card2.getCardNumber());

        boolean isEqualCardExpirationDate = (card1.getExpirationDate() == card2.getExpirationDate());

        boolean isEqualCardHolder = (card1.getCardHolder().getName().equals(card2.getCardHolder().getName())
                && card1.getCardHolder().getLastName().equals(card2.getCardHolder().getLastName()));

        return (isEqualCardNumber && isEqualCardExpirationDate  && isEqualCardHolder);

    }
}
