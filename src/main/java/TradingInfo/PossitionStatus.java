package TradingInfo;


import PriceEvolution.StockHistory;

public class PossitionStatus {
    private enum HoldingState {//TODO remake into interface?
        HOLD,
        SELL,
        BUY,
        notEnoughInfo
    }

    private HoldingState holdingState;
    private final StockHistory stockHistory;

    public PossitionStatus(StockHistory stockHistory) {
        this.stockHistory = stockHistory;
        this.holdingState = tradeStatus();
    }

    private HoldingState tradeStatus() {
        if (this.stockHistory.getPriceEvaluation().size() < 2) {
            return HoldingState.notEnoughInfo;//not enough info
        } else if (this.stockHistory.getPriceEvaluation().getLast().getSell() > this.stockHistory.getPriceEvaluation().getFirst().getBuy()) {
            return HoldingState.SELL;
        } else {
            return HoldingState.BUY;
        }

    }

    public String tradeStatusToString() {
        return "PossitionStatus{" +
                "holdingState=" + tradeStatus() +
                '}';
    }

    public HoldingState getHoldingState() {
        return holdingState;
    }

    public void setHoldingState(HoldingState holdingState) {
        this.holdingState = holdingState;
    }
}
