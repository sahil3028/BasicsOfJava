package OverloadedConstructors;

public class Pizza {
    String bread;
    String sauce;
    String cheese;
    String topping;
    Pizza(){

    }
    Pizza(String bread, String sauce, String cheese,String topping){
        this.bread=bread;
        this.sauce=sauce;
        this.cheese=cheese;
        this.topping=topping;

    }
    Pizza(String bread, String sauce, String cheese){
        this.bread=bread;
        this.sauce=sauce;
        this.cheese=cheese;
    }

}
