public class Main {
    public static void main(String[] args){
        ResidentialSite house = new ResidentialSite(100, 0.1);
        LifelineSite lifeline = new LifelineSite(100, 0.5);
        System.out.printf("House billable amount: %.3f\n", house.getBillableAmount());
        System.out.printf("Lifeline billable amount: %.3f\n", lifeline.getBillableAmount());
    }
}
