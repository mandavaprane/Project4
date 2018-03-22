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
public class SimpleMonitor implements Observer, DisplayElement {
    
    private int healthLevel;
    private Subject cars;
    
    public SimpleMonitor(Subject cars){
        this.cars=cars;
        cars.registerObserver(this);
    }

    @Override
    public void update(Cars car) {
        this.healthLevel=car.healthLevel;
        display();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void display() {
        
        
        if(healthLevel <40 ){             
             System.out.println("--the car has problem\n");
        }          
       // else if(healthLevel < 40 ){            
         //   System.out.println("--the car needs REPAIR\n");
        //}
            
        
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
    

