public class FinancialForecast 
{

    public static double forecast(double currentValue, double growthRate, int years) {
        if(years==0) 
        {
            return currentValue;
        } 
        else 
        {
            double nextYearValue=forecast(currentValue,growthRate, years-1);
            return nextYearValue*(1+growthRate);
        }
    }
    public static void main(String[] args) 
    {
        double currentValue = 1000;
        double growthRate = 0.05;   
        int years = 3;

        double futureValue = forecast(currentValue, growthRate, years);
        System.out.println("Future Value after "+years+" years: ₹"+futureValue);
    }
}
