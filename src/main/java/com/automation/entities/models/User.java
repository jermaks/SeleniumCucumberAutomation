package com.automation.entities.models;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
    private Data data = new Data();
    private Support support = new Support();

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Support getSupport() {
        return support;
    }

    public void setSupport(Support support) {
        this.support = support;
    }
}
