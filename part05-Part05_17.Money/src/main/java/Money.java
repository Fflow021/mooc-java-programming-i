
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        int totalCents = this.cents + addition.cents;
        int totalEuros = this.euros + addition.euros;
        Money newMoney = new Money(totalEuros, totalCents);
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (euros < compared.euros) {
            return true;
        }
        if (euros == compared.euros) {
            if (cents < compared.cents) {
                return true;
            }
        }
        return false;
    }
    
    public Money minus(Money decreaser) {
        int totalCents = this.cents - decreaser.cents;
        int totalEuros = this.euros - decreaser.euros;
        
        if (totalEuros >= 0){
            if (totalCents < 0) {
                totalEuros -= 1;
                totalCents += 100;
            }
        } else {
            totalEuros = 0;
            totalCents = 0;
        }
        Money newMoney = new Money(totalEuros, totalCents);
        return newMoney;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
