package com.itheima.ssm.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.util.Date;

public class MyConverter implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        if (source == null){
            throw new RuntimeException("请填写日期");
        }
        try {
            return DateUtils.String2Date(source, "yyyy-MM-dd HH:mm");
        } catch (ParseException e) {
            throw new RuntimeException("类型转换错误！！！");
        }
    }
}
