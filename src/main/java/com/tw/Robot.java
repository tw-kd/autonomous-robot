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

    public void turnRight() {
        switch (facing) {
            case N:
                facing = Facing.E;
                break;
            case E:
                facing = Facing.S;
                break;
            case S:
                facing = Facing.W;
                break;
            case W:
                facing = Facing.N;
                break;
        }
    }

    public Facing getFacing() {
        return facing;
    }

    public void turnLeft() {
        switch (facing) {
            case N:
                facing = Facing.W;
                break;
            case E:
                facing = Facing.N;
                break;
            case S:
                facing = Facing.E;
                break;
            case W:
                facing = Facing.S;
                break;
        }
    }
}
