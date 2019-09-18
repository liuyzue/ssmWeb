package com.founder.service.impl;

import com.founder.entity.PageBean;
import com.founder.service.PageBeanService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.service.impl
 * @date:2019/9/18
 * @time:9:30
 */
@Service
public class PageBeanServiceImpl implements PageBeanService {
    PageBean pageBean;

    /**
     * 初始化pageBean
     *
     * @param lists
     */
    @Override
    public <T> void initPageBean(List<T> lists) {
        pageBean= new PageBean<>();
        pageBean.setTotalCount(lists.size());
        pageBean.setCurrPage(1);
        pageBean.setLists(lists);
        pageBean.setPageSize(10);
        pageBean.setTotalPage(pageBean.getTotalCount()/pageBean.getPageSize());
    }

    /**
     * 是否为空
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        return false;
    }
}

