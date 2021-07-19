package com.company;

public class TableBuilder {
    private int height;
    private int width;

    public TableBuilder height(int height){
        this.height = height;
        return this;
    }

    public TableBuilder width(int width){
        this.width = width;
        return this;
    }

    public Table build(){
        return new Table(height, width);
    }
}
