package com.automation.entities.models;

import jakarta.xml.bind.annotation.XmlRootElement;
import org.junit.platform.commons.util.ToStringBuilder;

import java.util.List;

@XmlRootElement
public class UserModel {
    private DataModel data = new DataModel();
    private SupportModel support = new SupportModel();

    public DataModel getData() {
        return data;
    }

    public void setData(DataModel data) {
        this.data = data;
    }

    public SupportModel getSupport() {
        return support;
    }

    public void setSupport(SupportModel support) {
        this.support = support;
    }
}
