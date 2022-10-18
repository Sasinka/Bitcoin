package TradingInfo;



public class HoldingPossition {
    enum HoldingState {//TODO remake into interface?
        HOLD,
        SELL,
        BUY
    }

    HoldingState holdingState;

    public HoldingPossition(HoldingState holdingState) { //TODO Function
        this.holdingState = holdingState;
    }



    public HoldingState getHoldingState() {
        return holdingState;
    }

    public void setHoldingState(HoldingState holdingState) {
        this.holdingState = holdingState;
    }
}
