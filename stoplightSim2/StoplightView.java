package stoplightSim2;


import mvc.View;

import java.awt.*;

public class StoplightView extends View {

    public StoplightView(Stoplight light) {
        super(light);
    }

    public void paintComponent(Graphics gc) {
        super.paintComponent(gc);
        Color oldColor = gc.getColor();
        Stoplight light = (Stoplight)model;
        stopLight.StopLightShape shape = new stopLight.StopLightShape(light);
        shape.draw((Graphics2D) gc);
        gc.setColor(oldColor);
    }
}
