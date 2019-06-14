package com.jing.service;

import com.jing.YmlApplicationTests;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @author ruanjiayu
 * @dateTime 2019/6/14 14:33
 */
public class ConfigServiceTest extends YmlApplicationTests{

    @Resource
    private ConfigService configService;

    @Test
    public void getConfig() throws Exception {
        configService.getConfig();
    }

}