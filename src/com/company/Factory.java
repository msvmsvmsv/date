package com.company;

public class Factory {

    static enum TableType{
        TYPE1, TYPE2
    }

    public static  Table createTable(TableType t){
        switch (t){
            case TYPE1:
                return new Table(10,10);
            case TYPE2:
                return new Table(5,5);
            default:
                new Exception();
        }
        //branch changes2
        return null;
    }
}
