package com.tw.autonomusRobot;

import com.tw.exceptions.ExceedingGridBoundaryException;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class RobotTest {
    @Test
    void shouldBeAbleToMove() throws ExceedingGridBoundaryException {
        Robot robot = new Robot(0, 0, Facing.N);

        robot.move(1, 1);
        int actualYCoordinate = robot.getYCoordinate();

        assertThat(actualYCoordinate, is(equalTo(1)));
    }

    @Test
    void shouldBeAbleToTurnRight() {
        Robot robot = new Robot(0, 1, Facing.E);
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
