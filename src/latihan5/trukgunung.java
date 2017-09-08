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
public class trukgunung extends truk{
    public int seattinggi;
    public trukgunung(int starttinggi, int startcadence, int startspeed,int startgear)
    {
    super (startcadence, startspeed, startgear);
    seattinggi=starttinggi;
    }
    public void settinggi(int newValue)
    {
    seattinggi = newValue;
    }
      public static void main(String [] aku)
      {
      System.out.println("mulai berjalan");
      trukgunung MB=new trukgunung(0,0,0,0);
      System.out.println("gear = "+MB.gear);
      System.out.println("speed = "+MB.speed);
      MB.setgear(2);
      MB.speedUp(2);
      System.out.println("gear = "+MB.gear);
      System.out.println("speed = "+MB.speed);
      MB.speedUp(2);
      System.out.println("gear = "+MB.gear);
      System.out.println("speed = "+MB.speed);
      }
        
}
