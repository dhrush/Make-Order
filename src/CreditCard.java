import java.util.Optional;
import java.util.UUID;

public class CreditCard {

    public final static int SHIPPING_RATE = 5;
    private final long cardNumber;

    public CreditCard(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Optional<Payment> mkPayment(int value) {
        if (Math.random() > 0.3) {
            return Optional.of(new Payment(this, value, UUID.randomUUID()));
        } else {
            return Optional.empty();
        }
    }

    @Override
    public String toString() {
        return "CreditCard{" + "cardNumber=" + cardNumber + '}';
    }
}
