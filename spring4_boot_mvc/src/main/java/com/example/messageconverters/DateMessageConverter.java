package com.example.messageconverters;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.IOException;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by sungang on 2016/12/15.
 */
public class DateMessageConverter extends AbstractHttpMessageConverter<Date> {


    public DateMessageConverter() {
        super(new MediaType("application", "x-wisely", Charset.forName("UTF-8")));//2
    }


    @Override
    protected Date readInternal(Class<? extends Date> aClass, HttpInputMessage httpInputMessage) throws IOException, HttpMessageNotReadableException {
        return null;
    }

    @Override
    protected boolean supports(Class<?> clazz) {
        return Date.class.isAssignableFrom(clazz);
    }


    @Override
    protected void writeInternal(Date date, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        SimpleDateFormat s = new SimpleDateFormat("YYYY-hh-ss");
        String d = s.format(date);
        outputMessage.getBody().write(d.getBytes());
    }
}
