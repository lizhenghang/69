package entity;

/**
 * 导航器
 */
public class Navigator {

    private boolean north;      //北走一步
    private boolean south;      //南走一步
    private boolean west;       //西走一步
    private boolean east;       //东走一步
    private boolean middle;     //中间（默认在中）

    public boolean isNorth() {
        return north;
    }

    public void setNorth(boolean north) {
        this.north = north;
    }

    public boolean isSouth() {
        return south;
    }

    public void setSouth(boolean south) {
        this.south = south;
    }

    public boolean isWest() {
        return west;
    }

    public void setWest(boolean west) {
        this.west = west;
    }

    public boolean isEast() {
        return east;
    }

    public void setEast(boolean east) {
        this.east = east;
    }

    public boolean isMiddle() {
        return middle;
    }

    public void setMiddle(boolean middle) {
        this.middle = middle;
    }
}
