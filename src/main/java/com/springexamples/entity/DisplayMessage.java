package com.springexamples.entity;

public class DisplayMessage {
    private String message;

    public DisplayMessage()
    {
        System.out.println("Display Message Bean Created !!!");
    }
    public void setMessage(String message){
        this.message  = message;
    }
    public String  getMessage(){
        return this.message;
    }
}
