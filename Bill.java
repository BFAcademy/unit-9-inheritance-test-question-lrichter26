public class Bill extends Money {
    
    public Bill(int value) {
        super(value);
    }
    
    public String toString() {
        return "$" + (int) getAmount();
    }
}