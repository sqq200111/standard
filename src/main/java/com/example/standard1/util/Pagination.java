package com.example.standard1.util;

import java.util.ArrayList;
import java.util.List;

public class Pagination<E>{
    //当前页面数
    private Integer currentPageIndex;

    public Pagination(Integer currentPageIndex, Integer pageCount, List<E> results) {
        this.currentPageIndex = currentPageIndex;
        this.pageCount = pageCount;
        this.results = results;
    }

    @Override
    public String toString() {
        return "Pagination{" +
                "currentPageIndex=" + currentPageIndex +
                ", pageCount=" + pageCount +
                ", results=" + results +
                '}';
    }

    public Integer getCurrentPageIndex() {
        return currentPageIndex;
    }

    public void setCurrentPageIndex(Integer currentPageIndex) {
        this.currentPageIndex = currentPageIndex;
    }

    public static Integer getPAGESIZE() {
        return PAGESIZE;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Pagination() {
    }

    public List<E> getResults() {
        return results;
    }

    public void setResults(List<E> results) {
        this.results = results;
    }
    //一次查看几页
    private  static final Integer PAGESIZE = 5;
    //行数
    private Integer pageCount;
    //结果
    private List<E> results = new ArrayList<>(PAGESIZE);
}
