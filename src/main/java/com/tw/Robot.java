package com.tw;

public class Robot {
    private int xCoordinate;
    private int yCoordinate;
    private Facing facing;

    public Robot(int xCoordinate, int yCoordinate, Facing facing) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.facing = facing;
    }

    public void move() {
        switch (facing) {
            case N:
                yCoordinate++;
                break;
            case E:
                xCoordinate++;
                break;
            case S:
                yCoordinate--;
                break;
            case W:
                xCoordinate--;
                break;
        }
    }

    public int getXCoordiante() {
        return xCoordinate;
    }
    public int getYCoordiante() {
        return yCoordinate;
    }
}
