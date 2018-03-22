/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carmonitor;

import java.util.ArrayList;

/**
 *
 * @author Praneetha
 */
public class Cars implements Subject {
    private ArrayList observers;
    int healthLevel;
    public String cname;
    
    Cars(String name){
        observers = new ArrayList();
        cname=name;
    }
        
    @Override
    public void registerObserver(Observer o) {
         observers.add(o);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeObserver(Observer o) {
        int i=observers.indexOf(o);
        if (i<=0)
        observers.remove(i);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notifyObservers() {
        for(int i=0;i<observers.size();i++){
            Observer observer=(Observer)observers.get(i);
            observer.update(Cars.this);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
       
    }
    public void measurementsChanged(){
        notifyObservers();
    }
     
    public void setMeasurements(int healthLevel){
        this.healthLevel=healthLevel;
        measurementsChanged();
    }
}
