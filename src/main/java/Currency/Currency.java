package Currency;
//todo přidat timestamp
public class Currency {
    private String name;
    private int buy;
    private int sell;
    private int before15min;
    private int last;

    public Currency(String name, int buy, int sell, int before15min, int last) {
        this.name = name;
        this.buy = buy;
        this.sell = sell;
        this.before15min = before15min;
        this.last = last;
    }

    public Currency() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBuy(int buy) {
        this.buy = buy;
    }

    public void setSell(int sell) {
        this.sell = sell;
    }

    public void setBefore15min(int before15min) {
        this.before15min = before15min;
    }

    public void setLast(int last) {
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
