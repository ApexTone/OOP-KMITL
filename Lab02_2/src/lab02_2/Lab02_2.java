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
public class Lab02_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] brackets2001 = {
            {27050,65550,136750,297350},
            {45200,109250,166500,297350},
            {22600,54625,83250,148675},
            {36250,93650,151650,297350}
        };
        double[] rates2001 = {15,27.5,30.5,35.5,39.1};
        
        int[][] brackets2009 = {
            {8350,33950,82250,171550,372950},
            {16700,67900,137050,208850,372950},
            {8350,33950,68525,104425,186475},
            {11950,45500,117450,190200,372950}
        };
        double[] rates2009 = {10,15,25,28,33,35};
        
        
        Tax p1 = new Tax(Tax.SINGLE_FILER, brackets2001, rates2001, 400000);
        System.out.println(p1.getTax2001());
        //System.out.println(p1.getTax2009());
        p1 = new Tax(Tax.SINGLE_FILER, brackets2009, rates2009, 400000);
        //System.out.println(p1.getTax2001());
        System.out.println(p1.getTax2009());
    }
    
}
