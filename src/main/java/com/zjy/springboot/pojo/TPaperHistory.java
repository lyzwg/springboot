package com.zjy.springboot.pojo;

import java.io.Serializable;
import java.util.Date;

public class TPaperHistory implements Serializable {
    private Long id;

    private Long testPaperInfoId;

    private String siAnswers;

    private String oiAnswers;

    private Long sysUserId;

    private Long sysTeacherId;

    private Short score;

    private String evaluate;

    private String status;

    private Date createtime;

    private String bak1;

    private String bak2;

    private String bak3;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTestPaperInfoId() {
        return testPaperInfoId;
    }

    public void setTestPaperInfoId(Long testPaperInfoId) {
        this.testPaperInfoId = testPaperInfoId;
    }

    public String getSiAnswers() {
        return siAnswers;
    }

    public void setSiAnswers(String siAnswers) {
        this.siAnswers = siAnswers == null ? null : siAnswers.trim();
    }

    public String getOiAnswers() {
        return oiAnswers;
    }

    public void setOiAnswers(String oiAnswers) {
        this.oiAnswers = oiAnswers == null ? null : oiAnswers.trim();
    }

    public Long getSysUserId() {
        return sysUserId;
    }

    public void setSysUserId(Long sysUserId) {
        this.sysUserId = sysUserId;
    }

    public Long getSysTeacherId() {
        return sysTeacherId;
    }

    public void setSysTeacherId(Long sysTeacherId) {
        this.sysTeacherId = sysTeacherId;
    }

    public Short getScore() {
        return score;
    }

    public void setScore(Short score) {
        this.score = score;
    }

    public String getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate == null ? null : evaluate.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getBak1() {
        return bak1;
    }

    public void setBak1(String bak1) {
        this.bak1 = bak1 == null ? null : bak1.trim();
    }

    public String getBak2() {
        return bak2;
    }

    public void setBak2(String bak2) {
        this.bak2 = bak2 == null ? null : bak2.trim();
    }

    public String getBak3() {
        return bak3;
    }

    public void setBak3(String bak3) {
        this.bak3 = bak3 == null ? null : bak3.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", testPaperInfoId=").append(testPaperInfoId);
        sb.append(", siAnswers=").append(siAnswers);
        sb.append(", oiAnswers=").append(oiAnswers);
        sb.append(", sysUserId=").append(sysUserId);
        sb.append(", sysTeacherId=").append(sysTeacherId);
        sb.append(", score=").append(score);
        sb.append(", evaluate=").append(evaluate);
        sb.append(", status=").append(status);
        sb.append(", createtime=").append(createtime);
        sb.append(", bak1=").append(bak1);
        sb.append(", bak2=").append(bak2);
        sb.append(", bak3=").append(bak3);
        sb.append("]");
        return sb.toString();
    }
}