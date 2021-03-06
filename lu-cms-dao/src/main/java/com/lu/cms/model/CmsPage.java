package com.lu.cms.model;

public class CmsPage {
    private Integer pageId;

    private Integer pid;

    private String title;

    private String alias;

    private String keywords;

    private String description;

    private Long ctime;

    private Long orders;

    private String content;

    public CmsPage(Integer pageId, Integer pid, String title, String alias, String keywords, String description, Long ctime, Long orders, String content) {
        this.pageId = pageId;
        this.pid = pid;
        this.title = title;
        this.alias = alias;
        this.keywords = keywords;
        this.description = description;
        this.ctime = ctime;
        this.orders = orders;
        this.content = content;
    }

    public CmsPage() {
        super();
    }

    public Integer getPageId() {
        return pageId;
    }

    public void setPageId(Integer pageId) {
        this.pageId = pageId;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias == null ? null : alias.trim();
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Long getCtime() {
        return ctime;
    }

    public void setCtime(Long ctime) {
        this.ctime = ctime;
    }

    public Long getOrders() {
        return orders;
    }

    public void setOrders(Long orders) {
        this.orders = orders;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}