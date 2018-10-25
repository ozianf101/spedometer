/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speedo;

/**
 *
 * @author ozi
 */
public class Speedo {

    private boolean engine;
    private int rpmValue;
    private String gearState;
    private int speedValue;
    
    public Speedo(){
        engine = false;
        rpmValue = 0;
        gearState = "N";
        speedValue = 0;
    }
    
    public void setEngine(boolean starter){
        this.engine = starter;
    }
    public void setRPM(int valueRPM){
        if (valueRPM > 0 && valueRPM < 8000){
        this.rpmValue = valueRPM;
        }else if(valueRPM >8000){
            rpmValue = 8000;
        }
        else{
            rpmValue = 0;
        }
    }
    public void setSpeed(int valueOfSpeed){
        if (valueOfSpeed > 0 && valueOfSpeed < 100){
        this.speedValue=valueOfSpeed;
        }else if(valueOfSpeed >100){
            speedValue = 100;
        }
        else{
            speedValue = 0;
        }
    }
    public void setGear(String state){
        this.gearState = state;
    }
    public int getSpeed(){
        return speedValue;
    }
    public boolean getStarter(){
        return engine;
    }
    public String getGear(){
        return gearState;
    }
    public int getRPM(){
        return rpmValue;
    }
}
