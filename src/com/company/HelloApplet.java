package com.company;
import java.applet.Applet;
import java.awt.*;


public class HelloApplet extends Applet{
    Font font = new Font("TimesRoman" , Font.BOLD, 36);

    public void paint ( Graphics graphics ) {
        graphics.setFont(font);
        graphics.setColor(Color.green);
        graphics.drawString("HelloApplet", 5, 40);

    }
}
