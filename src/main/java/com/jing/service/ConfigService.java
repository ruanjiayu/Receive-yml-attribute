package com.jing.service;

import com.jing.config.Config;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ruanjiayu
 * @dateTime 2019/6/14 14:30
 */

@Service
@Slf4j
public class ConfigService {

    @Resource
    private Config config;

    public void getConfig(){
        log.info(config.toString());
    }
}
