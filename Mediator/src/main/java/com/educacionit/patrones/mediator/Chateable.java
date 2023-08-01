package com.educacionit.patrones.mediator;

public interface Chateable {
    public void recibe(String de, String msg);
    public void envia(String a, String msg);
}
