/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carmonitor;

/**
 *
 * @author Praneetha
 */
public class CarMonitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Cars toyotaCar = new Cars("toyota");
       Cars audiCar = new Cars("audi");
       Cars benzCar = new Cars("benz");
        
       SimpleMonitor simple = new SimpleMonitor(toyotaCar);
                   
        System.out.println("***************************SIMPLE CAR MONITORING SYSTEM*************************\n\n");
       // toyotaCar.setMeasurements(85);
        //toyotaCar.setMeasurements(55);
        toyotaCar.setMeasurements(20);
        System.out.println("------------------------------------------------------------------------------\n\n");
       
        System.out.println("***********************ADVANCED CAR MONITORING SYSTEM*************************\n\n");
        AdvancedMonitor advanceAudi = new AdvancedMonitor(audiCar);
        
        audiCar.setMeasurements(80);
        audiCar.setMeasurements(55);
        audiCar.setMeasurements(20);
        System.out.println("******************************************************");
        
        AdvancedMonitor advanceBenz = new AdvancedMonitor(benzCar);
        benzCar.setMeasurements(85);
        benzCar.setMeasurements(55);
        benzCar.setMeasurements(20);
        System.out.println("-------------------------------------------------------------------------------\n\n");
        
    }
    
}
