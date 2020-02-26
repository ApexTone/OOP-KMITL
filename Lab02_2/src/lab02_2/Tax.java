/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02_2;

/**
 *
 * @author Predator
 */
public class Tax {

    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1;
    public static final int MARRIED_SEPARATELY = 2;
    public static final int HEAD_OF_HOUSEHOLD = 3;

    private int filingStatus;
    private int[][] brackets;
    private double[] rates;
    private double taxableIncome;

    public Tax() {
    }

    public Tax(int filingStatus, int[][] brackets, double[] rate, double taxableIncome) {
        setFilingStatus(filingStatus);
        setBrackets(brackets);
        setRates(rate);
        setTaxableIncome(taxableIncome);
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public int getFilingStatus() {
        return filingStatus;
    }

    public double[] getRates() {
        return rates;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }

    public void setRates(double[] rates) {
        this.rates = rates;

    }

    public void setTaxableIncome(double taxableIncome) {
        if (taxableIncome < 0) {
            this.taxableIncome = 0;
        } else {
            this.taxableIncome = taxableIncome;
        }
    }

    public double getTax2001() {
        double tax = 0;
        if (brackets[filingStatus].length == 4 && rates.length == 5) {
            int[] filingBrac = {
                brackets[filingStatus][0],
                brackets[filingStatus][1],
                brackets[filingStatus][2],
                brackets[filingStatus][3]
            };
            if (taxableIncome <= filingBrac[0]) {
                //System.out.println("1");

                tax = taxableIncome * rates[0] / 100;
            } else if (taxableIncome <= filingBrac[1]) {
                //System.out.println("2");

                tax = filingBrac[0] * rates[0] / 100 + (taxableIncome - filingBrac[0]) * rates[1] / 100;
            } else if (taxableIncome <= filingBrac[2]) {
                //System.out.println("3");

                tax = filingBrac[0] * rates[0] / 100 + (filingBrac[1] - filingBrac[0]) * rates[1] / 100
                        + (taxableIncome - filingBrac[1]) * rates[2] / 100;
            } else if (taxableIncome <= filingBrac[3]) {
                //System.out.println("4");

                tax = filingBrac[0] * rates[0] / 100 + (filingBrac[1] - filingBrac[0]) * rates[1] / 100
                        + (filingBrac[2] - filingBrac[1]) * rates[2] / 100 + (taxableIncome - filingBrac[2]) * rates[3] / 100;
            } else if (taxableIncome > filingBrac[3]) {
                //System.out.println("5");

                tax = filingBrac[0] * rates[0] / 100 + (filingBrac[1] - filingBrac[0]) * rates[1] / 100
                        + (filingBrac[2] - filingBrac[1]) * rates[2] / 100 + (filingBrac[3] - filingBrac[2]) * rates[3] / 100
                        + (taxableIncome - filingBrac[3]) * rates[4] / 100;
            }
        } else {
            System.out.println("Non suitable bracket/rates");
        }
        return tax;
    }

    public double getTax2009() {
        double tax = 0;

        if (brackets[filingStatus].length == 5 && rates.length == 6) {
            int[] filingBrac = {
                brackets[filingStatus][0],
                brackets[filingStatus][1],
                brackets[filingStatus][2],
                brackets[filingStatus][3],
                brackets[filingStatus][4]
            };
            if (taxableIncome <= filingBrac[0]) {
                //System.out.println("1");

                tax = taxableIncome * rates[0] / 100;
            } else if (taxableIncome <= filingBrac[1]) {
                //System.out.println("2");

                tax = filingBrac[0] * rates[0] / 100 + (taxableIncome - filingBrac[0]) * rates[1] / 100;
            } else if (taxableIncome <= filingBrac[2]) {
                //System.out.println("3");

                tax = filingBrac[0] * rates[0] / 100 + (filingBrac[1] - filingBrac[0]) * rates[1] / 100
                        + (taxableIncome - filingBrac[1]) * rates[2] / 100;
            } else if (taxableIncome <= filingBrac[3]) {
                //System.out.println("4");

                tax = filingBrac[0] * rates[0] / 100 + (filingBrac[1] - filingBrac[0]) * rates[1] / 100
                        + (filingBrac[2] - filingBrac[1]) * rates[2] / 100 + (taxableIncome - filingBrac[2]) * rates[3] / 100;
            } else if (taxableIncome <= filingBrac[4]) {
                //System.out.println("5");

                tax = filingBrac[0] * rates[0] / 100 + (filingBrac[1] - filingBrac[0]) * rates[1] / 100
                        + (filingBrac[2] - filingBrac[1]) * rates[2] / 100 + (filingBrac[3] - filingBrac[2]) * rates[3] / 100
                        + (taxableIncome - filingBrac[3]) * rates[4] / 100;
            } else if (taxableIncome > filingBrac[4]) {
               // System.out.println("6");

                tax = filingBrac[0] * rates[0] / 100 + (filingBrac[1] - filingBrac[0]) * rates[1] / 100
                        + (filingBrac[2] - filingBrac[1]) * rates[2] / 100 + (filingBrac[3] - filingBrac[2]) * rates[3] / 100
                        + (filingBrac[4] - filingBrac[3]) * rates[4] / 100 + (taxableIncome - filingBrac[4]) * rates[5] / 100;
            }
        } else {
            System.out.println("Non suitable bracket/rate");
        }
        return tax;
    }
}
