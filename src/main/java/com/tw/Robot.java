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
        xCoordinate += facing.getXMovement();
        yCoordinate += facing.getYMovement();
    }

    public void turnRight() {
        facing = facing.getDirection("Right");
    }

    public void turnLeft() {
        facing = facing.getDirection("Left");
    }

    public int getXCoordinate() {
        return xCoordinate;
    }
    public int getYCoordinate() {
        return yCoordinate;
    }
    public Facing getFacing() {
        return facing;
    }

    public String getCurrentPosition() {
        return xCoordinate + " " + yCoordinate + " " + getFacingStringValue();
    }

    private String getFacingStringValue() {
        return facing.getFacingStringValue();
    }
}
