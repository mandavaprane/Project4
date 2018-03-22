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
public class AdvancedMonitor implements Observer, DisplayElement {
    
    private int healthLevel;
    public Subject cars;
    
    public AdvancedMonitor(Subject cars){
        this.cars=cars;
        cars.registerObserver(this);
    }

    @Override
    public void update(Cars car) {
        this.healthLevel=car.healthLevel;
        System.out.println(car.cname);
        display();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void display() {
        
        
        if(healthLevel >=75 ){ 
            //System.out.println("--the health level of the car is: "+ healthLevel);
             System.out.println("   its okay.....car needs NO_REPAIR\n");
        }
           
        else if(healthLevel >=40 && healthLevel<75 ){     
            //System.out.println("--the health level of the car is: "+healthLevel);
             System.out.println("   maybe car needs IMMINENT_REPAIR\n");
        }
           
        else if(healthLevel < 40 ){      
            //System.out.println("--the health level of the car is: "+healthLevel);
            System.out.println("   oh no.... car needs ugent REPAIR_OR_IT_WILL_EXPLODE\n");
        }
            
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

    

