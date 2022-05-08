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
        int xCoordinate = robot.getXCoordiante();
        int yCoordinate = robot.getYCoordiante();

        assertThat(yCoordinate, is(equalTo(1)));
    }
}
