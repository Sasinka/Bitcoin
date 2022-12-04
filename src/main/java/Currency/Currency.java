package Currency;

//todo přidat timestamp
public class Currency {
    private final String name;
    private final int buy;
    private final int sell;
    private final int before15min;
    private final int last;

    public Currency(String name, int buy, int sell, int before15min, int last) {
        this.name = name;
        this.buy = buy;
        this.sell = sell;
        this.before15min = before15min;
        this.last = last;
    }

    public String getName() {
        return name;
    }

    public int getBuy() {
        return buy;
    }

    public int getSell() {
        return sell;
    }

    public int getBefore15min() {
        return before15min;
    }

    public int getLast() {
        return last;
    }
}
