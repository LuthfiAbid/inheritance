/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan5;

/**
 *
 * @author SMK TELKOM
 */
public class truk {
    public int cadence;
    public int gear;
    public int speed;
    public truk(int startcadence, int startspeed,int startgear)
    {
    gear=startgear;
    cadence=startcadence;
    speed=startspeed;
    }
    public void setcadence(int newValue)
    {
    cadence=newValue;
    }
    public void setspeed(int newValue)
    {
    speed=newValue;
    }
    public void setgear(int newValue)
    {
    gear=newValue;
    }
    public void applybrake(int decrement)
    {
    speed=decrement;
    }
    public void speedUp(int increment)
    {
    speed=increment;
    }
}
