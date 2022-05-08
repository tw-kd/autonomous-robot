package com.tw.autonomusRobot;

import com.tw.exceptions.ExceedingGridBoundaryException;

public class Robot {
    private int xCoordinate;
    private int yCoordinate;
    private Facing facing;

    public Robot(int xCoordinate, int yCoordinate, Facing facing) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.facing = facing;
    }

    public void move(int edgeX, int edgeY) throws ExceedingGridBoundaryException {
        int xMovement = facing.getXMovement();
        int yMovement = facing.getYMovement();
        if (!isValidMove(xMovement, yMovement, edgeX, edgeY)) {
            throw new ExceedingGridBoundaryException();
        }
        xCoordinate += xMovement;
        yCoordinate += yMovement;
    }

    private boolean isValidMove(int xMovement, int yMovement, int edgeX, int edgeY) {
        return xCoordinate + xMovement <= edgeX && xCoordinate + xMovement >= 0 &&
                yCoordinate + yMovement <= edgeY && yCoordinate + yMovement >= 0;
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

    public void performTurnOperation(char operation) {
        if (operation == 'R') {
            turnRight();
        } else if (operation == 'L') {
            turnLeft();
        }
    }
}
