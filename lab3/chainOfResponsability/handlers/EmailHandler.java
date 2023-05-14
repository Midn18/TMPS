package lab3.chainOfResponsability.handlers;

import lab3.chainOfResponsability.Request;
import lab3.chainOfResponsability.utils.RequestType;

public class EmailHandler extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType().equals(RequestType.EMAIL)) {
            System.out.println("EmailHandler: " + request.getRequestDescription());
        } else {
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            }
        }
    }
}
