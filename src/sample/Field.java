package sample;

import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;

import java.awt.*;
import java.util.Timer;

public class Field extends Pane {
    private final int Size = 620;
    private final int DotSize = 16;
    private final int AllDots = 1600;
    private int objectX;
    private int objectY;
    private int[] x = new int[AllDots];
    private int[] y = new int[AllDots];
    private int dots;
    private Timer timer;
    private boolean left;
    private boolean right = true;
    private boolean up;
    private boolean donw;
    private boolean inField = true;


//  public Field(){
//
//  }
}

