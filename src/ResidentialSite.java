public class ResidentialSite extends Site {
    public ResidentialSite(double units, double rate){
        super(units, rate);
    }

    double getBillableAmount(){
        double base = getBaseAmount();
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }

    protected double getBaseAmount() {
        double base = _units * _rate;
        return base;
    }
}
