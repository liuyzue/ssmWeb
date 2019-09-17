package com.founder.entity;

import java.util.List;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.entity
 * @date:2019/9/16
 * @time:14:42
 */
public class PageBean<T> {

    private int currPage;
    private int pageSize;
    private int totalCount;
    private int totalPage;
    private List<T> lists;

    public PageBean() {
        super();
    }

    public int getCurrPage() {
        return currPage;
    }

    public void setCurrPage(int currPage) {
        this.currPage = currPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getLists() {
        return lists;
    }

    public void setLists(List<T> lists) {
        this.lists = lists;
    }



}
