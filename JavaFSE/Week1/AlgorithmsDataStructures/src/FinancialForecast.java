public class FinancialForecast {


    public static double movingAverageForecast(double[] pastRevenue, int window) {
        double sum = 0;
        int count = 0;

        for (int i = pastRevenue.length - window; i < pastRevenue.length; i++) {
            sum += pastRevenue[i];
            count++;
        }
        return sum / count;
    }


    public static double growthRate(double previous, double current) {
        return ((current - previous) / previous) * 100;
    }

    public static void main(String[] args) {
        double[] quarterlyRevenue = {10000, 12000, 11500, 13000, 14500, 15000};

        double forecast = movingAverageForecast(quarterlyRevenue, 3);
        System.out.println("Forecasted next quarter revenue: " + forecast);

        double rate = growthRate(quarterlyRevenue[4], quarterlyRevenue[5]);
        System.out.printf("Growth rate (Q5 to Q6): %.2f%%\n", rate);
    }
}
