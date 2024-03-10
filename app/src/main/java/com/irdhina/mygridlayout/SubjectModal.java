package com.irdhina.mygridlayout;

public class SubjectModal {
    // string course_name for storing course_name
    // and imgid for storing image id.
    private String subj_name;
    private int imgid;
    public SubjectModal(String course_name, int imgid) {
        this.subj_name = course_name;
        this.imgid = imgid;
    }
    public String getSubj_name() {
        return subj_name;
    }
    public void setSubj_name(String subj_name) {
        this.subj_name = subj_name;
    }
    public int getImgid() {
        return imgid;
    }
    public void setImgid(int imgid) {
        this.imgid = imgid;
    }
}