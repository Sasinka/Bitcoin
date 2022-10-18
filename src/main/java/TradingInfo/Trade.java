package TradingInfo;

public class Trade {
    private long last;
    private long buy;
    private long sell;

    public Trade(long last, long buy, long sell) {
        this.last = last;
        this.buy = buy;
        this.sell = sell;
    }

    public long getLast() {
        return last;
    }

    public void setLast(long last) {
        this.last = last;
    }

    public long getBuy() {
        return buy;
    }

    public void setBuy(long buy) {
        this.buy = buy;
    }

    public long getSell() {
        return sell;
    }

    public void setSell(long sell) {
        this.sell = sell;
    }
}
