package com.es.service;

import javax.ejb.Stateless;

@Stateless
public class StringConverterBean implements StringConverter {
    @Override
    public String convert(String s) {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (String.valueOf(c).matches("[aeiouy]")) {
                res.append(i);
            } else {
                res.append(c);
            }
        }

        return res.toString();
    }
}
