package com.zjy.springboot.pojo;

import java.io.Serializable;
import java.util.Date;

public class TFollow implements Serializable {
    private Long id;

    private Long userid;

    private Long followdataid;

    private String followtype;

    private Date followtime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getFollowdataid() {
        return followdataid;
    }

    public void setFollowdataid(Long followdataid) {
        this.followdataid = followdataid;
    }

    public String getFollowtype() {
        return followtype;
    }

    public void setFollowtype(String followtype) {
        this.followtype = followtype == null ? null : followtype.trim();
    }

    public Date getFollowtime() {
        return followtime;
    }

    public void setFollowtime(Date followtime) {
        this.followtime = followtime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userid=").append(userid);
        sb.append(", followdataid=").append(followdataid);
        sb.append(", followtype=").append(followtype);
        sb.append(", followtime=").append(followtime);
        sb.append("]");
        return sb.toString();
    }
}