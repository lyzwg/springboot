package com.zjy.springboot.pojo;

import java.io.Serializable;
import java.util.Date;

public class TReport implements Serializable {
    private Long id;

    private Long reportuser;

    private Date reporttime;

    private String reporttype;

    private String content;

    private Long reportdataid;

    private String reportdatatype;

    private String status;

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

    public Long getReportuser() {
        return reportuser;
    }

    public void setReportuser(Long reportuser) {
        this.reportuser = reportuser;
    }

    public Date getReporttime() {
        return reporttime;
    }

    public void setReporttime(Date reporttime) {
        this.reporttime = reporttime;
    }

    public String getReporttype() {
        return reporttype;
    }

    public void setReporttype(String reporttype) {
        this.reporttype = reporttype == null ? null : reporttype.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Long getReportdataid() {
        return reportdataid;
    }

    public void setReportdataid(Long reportdataid) {
        this.reportdataid = reportdataid;
    }

    public String getReportdatatype() {
        return reportdatatype;
    }

    public void setReportdatatype(String reportdatatype) {
        this.reportdatatype = reportdatatype == null ? null : reportdatatype.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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
        sb.append(", reportuser=").append(reportuser);
        sb.append(", reporttime=").append(reporttime);
        sb.append(", reporttype=").append(reporttype);
        sb.append(", content=").append(content);
        sb.append(", reportdataid=").append(reportdataid);
        sb.append(", reportdatatype=").append(reportdatatype);
        sb.append(", status=").append(status);
        sb.append(", bak1=").append(bak1);
        sb.append(", bak2=").append(bak2);
        sb.append(", bak3=").append(bak3);
        sb.append("]");
        return sb.toString();
    }
}