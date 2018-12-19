package com.tt.teach.pojo;
/**
 *@作者：sufangfang
 *@时间：2018/12/19 10:25
 *@描述：实体类Grade——》年级类
 */
public class Grade {
    private Integer gradeID;
    private String gradeName;

    public Grade(Integer gradeID, String gradeName) {
        this.gradeID = gradeID;
        this.gradeName = gradeName;
    }

    public Grade() {
    }

    public Integer getGradeID() {
        return gradeID;
    }

    public void setGradeID(Integer gradeID) {
        this.gradeID = gradeID;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }
}
