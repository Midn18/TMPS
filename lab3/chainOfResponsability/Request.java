package lab3.chainOfResponsability;

import lab3.chainOfResponsability.utils.RequestType;

public class Request {
    private final RequestType requestType;
    private final String requestDescription;

    public Request(RequestType requestType, String requestDescription) {
        this.requestType = requestType;
        this.requestDescription = requestDescription;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public String getRequestDescription() {
        return requestDescription;
    }
}
