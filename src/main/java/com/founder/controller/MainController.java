package com.founder.controller;

import com.founder.cron.datacheck.relevance.EhrHealthEventRelev;
import com.founder.entity.PageBean;
import com.founder.service.EhrHealthEventService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;

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
    @Autowired
    EhrHealthEventRelev ehrHealthEventRelev;

    PageBean pageBean;


    @RequestMapping(value = "/fenye",method = RequestMethod.GET)
    public ModelAndView fenye(Integer currentPage, Integer pageSize){
        ModelAndView modelAndView = new ModelAndView();
        if (ObjectUtils.isEmpty(pageBean)){
            initPageBean(eventService.selectAllByUploadTime("2019/1/21 0:0:0","2019/1/22 0:29:1"));
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

    @RequestMapping(value = "/doCheck")
    public String doCheck(Date date){
        ehrHealthEventRelev.checkOutpatient(date);
        return "forward:/fenye";
    }

    public <T> void initPageBean(ArrayList<T> lists){
        pageBean= new PageBean<>();
        pageBean.setTotalCount(lists.size());
        pageBean.setCurrPage(1);
        pageBean.setLists(lists);
        pageBean.setPageSize(10);
        pageBean.setTotalPage(pageBean.getTotalCount()/pageBean.getPageSize());
    }

}
