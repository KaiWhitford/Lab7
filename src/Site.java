public abstract class Site {
    public static final double TAX_RATE = 0.15;
    protected double _units;
    protected double _rate;

    public Site(double units, double rate){
        _units = units;
        _rate = rate;
    }

    double getBillableAmount(){
        return getBaseAmount() + getTaxAmount();
    }

    protected abstract double getTaxAmount();
    protected abstract double getBaseAmount();
}
