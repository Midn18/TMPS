package lab3.chainOfResponsability.handlers;

import lab3.chainOfResponsability.Request;
import lab3.chainOfResponsability.utils.RequestType;
import lombok.Data;

public class FileHandler extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType().equals(RequestType.FILE)) {
            System.out.println("FileHandler: " + request.getRequestDescription());
        } else {
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            }
        }
    }
}
