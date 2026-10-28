public class ResidentialSite extends Site {
    public ResidentialSite(double units, double rate){
        super(units, rate);
    }

    double getBillableAmount(){
        double tax = getTaxAmount();
        return getBaseAmount() + tax;
    }

    protected double getTaxAmount() {
        return getBaseAmount() * Site.TAX_RATE;
    }

    protected double getBaseAmount() {
        double base = _units * _rate;
        return base;
    }
}
