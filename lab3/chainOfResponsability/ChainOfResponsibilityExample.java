package lab3.chainOfResponsability;

import lab3.chainOfResponsability.handlers.EmailHandler;
import lab3.chainOfResponsability.handlers.FileHandler;
import lab3.chainOfResponsability.handlers.Handler;
import lab3.chainOfResponsability.utils.RequestType;

public class ChainOfResponsibilityExample {
    public static void main(String[] args) {
        Handler emailHandler = new EmailHandler();
        Handler fileHandler = new FileHandler();

        emailHandler.setNextHandler(fileHandler);

        Request emailRequest = new Request(RequestType.EMAIL, "Email request");
        Request fileRequest = new Request(RequestType.FILE, "File request");
        Request otherRequest = new Request(RequestType.OTHER, "Other request");

        emailHandler.handleRequest(emailRequest);
        emailHandler.handleRequest(fileRequest);
        emailHandler.handleRequest(otherRequest);
    }
}
