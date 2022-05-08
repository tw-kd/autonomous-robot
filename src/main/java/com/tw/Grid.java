package com.tw;

public class Grid {
    private final int edgeX;
    private final int edgeY;
    private final Robot[] robots;

    public Grid(int edgeX, int edgeY, Robot[] robots) {
        this.edgeX = edgeX;
        this.edgeY = edgeY;
        this.robots = robots;
    }

    public String getRobotsPositions() {
        StringBuilder positions = new StringBuilder();
        for (Robot robot : robots) {
            positions.append(robot.getCurrentPosition()).append("\n");
        }
        return positions.toString();
    }
}
