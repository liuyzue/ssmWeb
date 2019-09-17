package com.founder.controller;

import com.founder.entity.EhrHealthEvent;
import com.founder.entity.PageBean;
import com.founder.service.EhrHealthEventService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.controller
 * @date:2019/9/16
 * @time:15:14
 */
@Controller
@RequestMapping(value = "/main")
public class MainController {

    private static final Logger logger= LogManager.getLogger(MainController.class.getName());

    @Autowired
    EhrHealthEventService eventService;

    PageBean<EhrHealthEvent> pageBean;


    @RequestMapping(value = "/fenye",method = RequestMethod.GET)
    public ModelAndView fenye(Integer currentPage, Integer pageSize){
        ModelAndView modelAndView = new ModelAndView();
        if (ObjectUtils.isEmpty(pageBean)){
            initPageBean(eventService.selectAllByUploadTime("2019/8/21 0:0:0","2019/8/21 0:29:1"));
        }
        if (!ObjectUtils.isEmpty(currentPage)) {
            pageBean.setCurrPage(currentPage);
        }
        if (!ObjectUtils.isEmpty(pageSize)) {
            pageBean.setPageSize(pageSize);
        }
        modelAndView.addObject("resultPage",pageBean);
        modelAndView.setViewName("main");

        return modelAndView;
    }

    public void initPageBean(ArrayList<EhrHealthEvent> ehrHealthEvents){
        pageBean= new PageBean<>();
        pageBean.setTotalCount(ehrHealthEvents.size());
        pageBean.setCurrPage(1);
        pageBean.setLists(ehrHealthEvents);
        pageBean.setPageSize(10);
        pageBean.setTotalPage(pageBean.getTotalCount()/pageBean.getPageSize());
    }

}
