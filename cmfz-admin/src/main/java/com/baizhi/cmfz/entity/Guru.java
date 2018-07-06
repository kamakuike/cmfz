package com.baizhi.cmfz.entity;

import java.io.Serializable;

/**
 * Created by 13659 on 2018/7/6.
 */
public class Guru implements Serializable {
    private String guruId;
    private String guruName;
    private String guruPhoto;
    private String guruIntro;

    @Override
    public String toString() {
        return "Guru{" +
                "guruId='" + guruId + '\'' +
                ", guruName='" + guruName + '\'' +
                ", guruPhoto='" + guruPhoto + '\'' +
                ", guruIntro='" + guruIntro + '\'' +
                '}';
    }

    public Guru() {
    }

    public String getGuruId() {
        return guruId;
    }

    public void setGuruId(String guruId) {
        this.guruId = guruId;
    }

    public String getGuruName() {
        return guruName;
    }

    public void setGuruName(String guruName) {
        this.guruName = guruName;
    }

    public String getGuruPhoto() {
        return guruPhoto;
    }

    public void setGuruPhoto(String guruPhoto) {
        this.guruPhoto = guruPhoto;
    }

    public String getGuruIntro() {
        return guruIntro;
    }

    public void setGuruIntro(String guruIntro) {
        this.guruIntro = guruIntro;
    }
}
