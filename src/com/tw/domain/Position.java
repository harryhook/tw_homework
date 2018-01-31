package com.tw.domain;

public class Position {
    String id;
    private int x;
    private int y;
    private int z;

    private int offsetx;
    private int offsety;
    private int offsetz;

    private String s1;
    private String s2;
    private String s3;

    public Position(String id, int x, int y, int z) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Position(String id, int x, int y, int z, int offsetx, int offsety, int offsetz) {
        this.id = id;
        this.x = x + offsetx;
        this.y = y + offsety;
        this.z = z + offsetz;
    }

    private Position(String s1, String s2, String s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public static Position getErrorPos() {
        return new Position("NA", "NA", "NA");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getOffsetx() {
        return offsetx;
    }

    public void setOffsetx(int offsetx) {
        this.offsetx = offsetx;
    }

    public int getOffsety() {
        return offsety;
    }

    public void setOffsety(int offsety) {
        this.offsety = offsety;
    }

    public int getOffsetz() {
        return offsetz;
    }

    public void setOffsetz(int offsetz) {
        this.offsetz = offsetz;
    }


    public static boolean isErrorPos(Position pos) {
        if (pos.s1 == "NA" && pos.s2 == "NA" && pos.s3 == "NA") {
            return true;
        }
        return false;
    }
}
