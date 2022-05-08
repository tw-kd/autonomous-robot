# Autonomous Robot

### Focus: Java, TDD, Clean Code

### Problem Statement:
You are supposed to design a robot that can move on an N * N grid based on the commands
you give to it.
A robot's position and location is represented by a combination of x and y
co-ordinates and a letter representing one of the four cardinal compass
points. An
example position might be 0, 0, N, which means the robot is in the bottom
left corner and facing North.
In order to control the robot, we have 3 simple commands. The
possible letters are 'L', 'R' and 'M'. 'L' and 'R' makes the robot spin 90
degrees left or right respectively, without moving from its current spot.
'M' means move forward one grid point, and maintain the same heading.
Assume that the square directly North from (x, y) is (x, y+1).

INPUT:<br/>
The first line of input is the upper-right coordinates of the grid, the
lower-left coordinates are assumed to be 0,0.
The rest of the input is information pertaining to the robots that have
been deployed. Each robot has two lines of input. The first line gives the
robot's position, and the second line is a series of instructions telling
the robot how to explore the grid.
The position is made up of two integers and a letter separated by spaces,
corresponding to the x and y co-ordinates and the robot's orientation.
Each robot will be finished sequentially, which means that the second robot
won't start to move until the first one has finished moving.

OUTPUT<br/>
The output for each robot should be its final co-ordinates and heading.

<hr/>

Test Input
```
5 5
1 2 N
LMLMLMLMM
3 3 E
MMRMMRMRRM
```
Test Output
```
1 3 N
5 1 E
```