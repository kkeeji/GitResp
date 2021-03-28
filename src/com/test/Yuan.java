package com.test;

public class Yuan {
    private double banJing;

    public void setBanJing(double banJing){
        this.banJing = banJing;
    }

    public double getBanJing(){
        return banJing;
    }

    public double mianJi(){
        double mianji = 3.14 * banJing * banJing;
        return mianji;
    }
}
