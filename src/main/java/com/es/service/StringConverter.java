package com.es.service;

import javax.ejb.Local;

@Local
public interface StringConverter {
    String convert(String s);
}
