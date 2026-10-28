public class LifelineSite extends Site {
    public LifelineSite(double units, double rate){
        super(units, rate);
    }

    public double getBillableAmount(){
        return getBaseAmount() + getTaxAmount();
    }

    @Override
    protected double getTaxAmount() {
        return getBaseAmount() * Site.TAX_RATE * 0.2;
    }

    @Override
    protected double getBaseAmount() {
        return _units * _rate * 0.5;
    }
}
