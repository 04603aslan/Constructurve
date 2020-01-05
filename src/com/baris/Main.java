package com.baris;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        Dikdortgen first = new Dikdortgen();
        /*first.boy=65;
        first.en=98;*/
        first.setBoy(2);
        first.setEn(4);
        first.getBoy();
        first.getEn();
        JOptionPane.showMessageDialog(null,first.field());

        Dikdortgen second= new Dikdortgen();
        second.setBoy(23);
        second.getBoy();
        System.out.println(second.field());


    }
}
