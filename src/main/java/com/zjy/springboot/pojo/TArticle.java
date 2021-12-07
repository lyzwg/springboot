package com.zjy.springboot.pojo;

import java.io.Serializable;
import java.util.Date;

public class TArticle implements Serializable {
    private Long id;

    private String title;

    private String description;

    private String pic;

    private Long author;

    private Date updatetime;

    private Date createtime;

    private Long commentnum;

    private Long goodnum;

    private Long badnum;

    private Long collectnum;

    private Long viewnum;

    private Long postbarid;

    private String recommend;

    private String top;

    private Long lastcomment;

    private Date lastcommenttime;

    private String status;

    private String bak1;

    private String bak2;

    private String bak3;

    private String content;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public Long getAuthor() {
        return author;
    }

    public void setAuthor(Long author) {
        this.author = author;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Long getCommentnum() {
        return commentnum;
    }

    public void setCommentnum(Long commentnum) {
        this.commentnum = commentnum;
    }

    public Long getGoodnum() {
        return goodnum;
    }

    public void setGoodnum(Long goodnum) {
        this.goodnum = goodnum;
    }

    public Long getBadnum() {
        return badnum;
    }

    public void setBadnum(Long badnum) {
        this.badnum = badnum;
    }

    public Long getCollectnum() {
        return collectnum;
    }

    public void setCollectnum(Long collectnum) {
        this.collectnum = collectnum;
    }

    public Long getViewnum() {
        return viewnum;
    }

    public void setViewnum(Long viewnum) {
        this.viewnum = viewnum;
    }

    public Long getPostbarid() {
        return postbarid;
    }

    public void setPostbarid(Long postbarid) {
        this.postbarid = postbarid;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend == null ? null : recommend.trim();
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top == null ? null : top.trim();
    }

    public Long getLastcomment() {
        return lastcomment;
    }

    public void setLastcomment(Long lastcomment) {
        this.lastcomment = lastcomment;
    }

    public Date getLastcommenttime() {
        return lastcommenttime;
    }

    public void setLastcommenttime(Date lastcommenttime) {
        this.lastcommenttime = lastcommenttime;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", description=").append(description);
        sb.append(", pic=").append(pic);
        sb.append(", author=").append(author);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", createtime=").append(createtime);
        sb.append(", commentnum=").append(commentnum);
        sb.append(", goodnum=").append(goodnum);
        sb.append(", badnum=").append(badnum);
        sb.append(", collectnum=").append(collectnum);
        sb.append(", viewnum=").append(viewnum);
        sb.append(", postbarid=").append(postbarid);
        sb.append(", recommend=").append(recommend);
        sb.append(", top=").append(top);
        sb.append(", lastcomment=").append(lastcomment);
        sb.append(", lastcommenttime=").append(lastcommenttime);
        sb.append(", status=").append(status);
        sb.append(", bak1=").append(bak1);
        sb.append(", bak2=").append(bak2);
        sb.append(", bak3=").append(bak3);
        sb.append(", content=").append(content);
        sb.append("]");
        return sb.toString();
    }
}