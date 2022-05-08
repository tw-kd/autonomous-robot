package com.tw;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class GridTest {
    @Test
    void shouldBeAbleToReturnRobotsPositions() {
        Robot[] robots = new Robot[]{
                new Robot(0, 0, Facing.N),
                new Robot(1, 1, Facing.S),
        };
        Grid grid = new Grid(5, 5, robots);

        String actualPositions = grid.getRobotsPositions();

        assertThat(actualPositions, is(equalTo("0 0 N\n1 1 S\n")));
    }
}
