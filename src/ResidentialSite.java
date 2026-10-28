public class ResidentialSite extends Site {
    public ResidentialSite(double units, double rate){
        super(units, rate);
    }

    double getBillableAmount(){
        double tax = getBaseAmount() * Site.TAX_RATE;
        return getBaseAmount() + tax;
    }

    protected double getBaseAmount() {
        double base = _units * _rate;
        return base;
    }
}
