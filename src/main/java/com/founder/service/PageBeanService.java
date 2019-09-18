package com.founder.service;

import java.util.List;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.service
 * @date:2019/9/18
 * @time:9:29
 */
public interface PageBeanService {

    /**
     * 初始化pageBean
     * @param lists
     */
    <T> void  initPageBean(List<T> lists);

    /**
     * 是否为空
     * @return
     */
    boolean isEmpty();

}
