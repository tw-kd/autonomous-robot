package com.tw;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class RobotTest {
    @Test
    void shouldBeAbleToMove() {
        Robot robot = new Robot(0, 0, Facing.N);

        robot.move();
        int actualYCoordinate = robot.getYCoordinate();

        assertThat(actualYCoordinate, is(equalTo(1)));
    }

    @Test
    void shouldBeAbleToTurnRight() {
        Robot robot = new Robot(0, 1, Facing.E);
        Facing facing = robot.getFacing();
        System.out.println(facing);
        robot.turnRight();
        Facing actualFacing = robot.getFacing();

        assertThat(actualFacing, is(equalTo(Facing.S)));
    }

    @Test
    void shouldBeAbleToTurnLeft() {
        Robot robot = new Robot(0, 1, Facing.E);

        robot.turnLeft();
        Facing actualFacing = robot.getFacing();

        assertThat(actualFacing, is(equalTo(Facing.N)));
    }
}
