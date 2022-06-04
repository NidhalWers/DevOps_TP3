package com.nidhalteyeb.devops.internal.http;

public enum HttpStatusCode {

    OK(200),

    BAD_REQUEST(400),

    UNAUTHORIZED(401),

    FORBIDDEN(403),

    INTERNAL_SERVER_ERROR5(500);

    private int code;

    HttpStatusCode(final int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static boolean isOK(final int statusCode) {
        return OK.getCode() == statusCode;
    }
}
