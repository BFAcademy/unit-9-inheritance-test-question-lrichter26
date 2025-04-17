public class Coin extends Money {
    
    private String name;

    public Coin(String name, double value) {
        super(value);
        this.name = name;
    }


    public String toString() {
        return name;
    }

    public boolean equals(Object other) {
        // Same object check
        if (this == other)
            return true;
        // Check if both name and amount are equal
        if (other instanceof Coin) {
            Coin c = (Coin) other;
            if (this.name.equals(c.name) && this.getAmount() == c.getAmount())
                return true;
        }
        return false;
    }
}