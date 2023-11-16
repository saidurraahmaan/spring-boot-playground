package com.dsi.dms.domain.exception;

public enum ErrorCode
{
    InternalServerError(999);
    private final int value;

    private ErrorCode(int value)
    {
        this.value = value;
    }

}
