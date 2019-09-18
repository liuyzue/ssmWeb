package com.founder.util;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.util
 * @date:2019/9/17
 * @time:16:17
 */
public class DateUtilTest {

    @Test
    public void lastDay() {
        String dateStr = DateUtil.lastDay(new Date());

        System.out.println(dateStr);
    }
}