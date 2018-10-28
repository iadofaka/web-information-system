package com.cafe.maria.isabel.system.requestBean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TestRequest {

    private String value;

    public TestRequest(@JsonProperty("value") String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
