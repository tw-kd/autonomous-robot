package com.tw;

public enum Facing {
    N(0, 1),
    S(0, -1),
    E(1, 0),
    W(-1, 0);

    private int xMovement;
    private int yMovement;

    Facing(int xMovement, int yMovement) {
        this.xMovement = xMovement;
        this.yMovement = yMovement;
    }

    public int getXMovement() {
        return xMovement;
    }
    public int getYMovement() {
        return yMovement;
    }

    public Facing getDirection(String direction) {
        switch (this) {
            case N:
                if (direction.equals("Right")) return E;
                else if (direction.equals("Left")) return W;
            case S:
                if (direction.equals("Right")) return E;
                else if (direction.equals("Left")) return W;
            case E:
                if (direction.equals("Right")) return S;
                else if (direction.equals("Left")) return N;
            case W:
                if (direction.equals("Right")) return S;
                else if (direction.equals("Left")) return N;
        }
        return null;
    }

    public String getFacingStringValue() {
        switch (this) {
            case N:
                return "N";
            case S:
                return "S";
            case E:
                return "E";
            case W:
                return "W";
        }
        return null;
    }
}
