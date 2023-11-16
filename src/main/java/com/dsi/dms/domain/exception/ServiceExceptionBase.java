package com.dsi.dms.domain.exception;

public abstract class ServiceExceptionBase extends  RuntimeException
{
    private String messageResourceKey;
    private ErrorCode errorCode;
    public String getMessageResourceKey()
    {
        return messageResourceKey;
    }

    public ErrorCode getErrorCode()
    {
        return errorCode;
    }

    public ServiceExceptionBase(String messageResourceKey, ErrorCode errorCode)
    {
        this.messageResourceKey = messageResourceKey;
        this.errorCode = errorCode;
    }
}