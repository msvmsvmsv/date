package com.company;

public class Factory2 {
    public static Table createRoundTableWithRadius(int r){
        return new Table(10,10);
    }

    public static Table createRectTable(){
        return new Table(5, 5);
    }

}
