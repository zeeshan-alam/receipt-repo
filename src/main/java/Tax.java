public class Tax {

    private double percentage;
    private double fixed;
    public Tax(double percentage, double fixed) {
        this.percentage=percentage;
        this.fixed=fixed;
    }
    public double getPercentage() {
        return percentage;
    }

    public double getFixed() {
        return fixed;
    }

}
