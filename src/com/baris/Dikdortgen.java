package com.baris;

import java.util.ArrayList;

public class Dikdortgen
{

   /* public double boy;
    public  double en;*/
   private  double boy;
   private double en;
   public Dikdortgen()
   {
       en=12;
   }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }

    public double getEn() {
        return en;
    }

    public void setEn(double en) {
        this.en = en;
    }

    public double field()
    {
        double field=en*boy;
        return field;
    }
    private ArrayList<String> deneme = new ArrayList<String>();
}
