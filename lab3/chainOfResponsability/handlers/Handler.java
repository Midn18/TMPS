package lab3.chainOfResponsability.handlers;

import lab3.chainOfResponsability.Request;

public abstract class Handler {
    protected Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(Request request);
}
