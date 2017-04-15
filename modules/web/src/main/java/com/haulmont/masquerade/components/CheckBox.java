package com.haulmont.masquerade.components;

public interface CheckBox extends Field<CheckBox> {
    void set();
    void unset();
    void isSet();

    String getCaption();
}