package com.tw.autonomusRobot;

import com.tw.exceptions.ExceedingGridBoundaryException;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GridTest {
    @Test
    void shouldBeAbleToReturnRobotsPositions() {
        Robot[] robots = new Robot[]{
                new Robot(0, 0, Facing.N),
                new Robot(1, 1, Facing.S),
        };
        String[] moves = new String[]{
                "",
                ""
        };
        Grid grid = new Grid(5, 5, robots, moves);

        String actualPositions = grid.getRobotsPositions();

        assertThat(actualPositions, is(equalTo("0 0 N\n1 1 S\n")));
    }

    @Test
    void shouldBeAbleToReturnMovedRobotsPosition() throws ExceedingGridBoundaryException {
        Robot[] robots = new Robot[]{
                new Robot(1, 2, Facing.N),
                new Robot(3, 3, Facing.E),
        };
        String[] operations = new String[]{
                "LMLMLMLMM",
                "MMRMMRMRRM"
        };
        Grid grid = new Grid(5, 5, robots, operations);

        grid.executeOperations();
        String actualPositions = grid.getRobotsPositions();

        assertThat(actualPositions, is(equalTo("1 3 N\n5 1 E\n")));
    }

    @Test
    void shouldNotBeAbleToMoveRobotsBeyondGrid() {
        Robot[] robots = new Robot[]{
                new Robot(0, 0, Facing.N),
        };
        String[] operations = new String[]{
                "MMMM"
        };
        Grid grid = new Grid(2, 2, robots, operations);

        assertThrows(ExceedingGridBoundaryException.class, grid::executeOperations);
    }
}
