package com.tw;

public class Grid {
    private final int edgeX;
    private final int edgeY;
    private final Robot[] robots;
    private final String[] operations;

    public Grid(int edgeX, int edgeY, Robot[] robots, String[] operations) {
        this.edgeX = edgeX;
        this.edgeY = edgeY;
        this.robots = robots;
        this.operations = operations;
    }

    public String getRobotsPositions() {
        StringBuilder positions = new StringBuilder();
        for (Robot robot : robots) {
            positions.append(robot.getCurrentPosition()).append("\n");
        }
        return positions.toString();
    }

    public void executeOperations() {
        for (int i = 0; i < robots.length; i++) {
            for (int j = 0; j < operations[i].length(); j++) {
                robots[i].performOperation(operations[i].charAt(j));
            }
        }
    }
}
