package Challenge;

import java.time.LocalDate;

public class Card {
    private String brand;
    private long cardNumber;
    private LocalDate expirationDate;
    private CardHolder cardHolder;


    public CardHolder getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(CardHolder cardHolder) {
        this.cardHolder = cardHolder;
    }

    public String getMarca() {
        return brand;
    }

    public void setMarca(String marca) {
        this.brand = marca;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }


    @Override
    public String toString() {
        return "Tarjeta{" +
                "marca='" + brand + '\'' +
                ", numeroTarjeta=" + cardNumber +
                ", fechaVencimiento=" + expirationDate +
                ", cardHolder=" + cardHolder.getName() + " " + cardHolder.getLastName() +
                '}';
    }
}
