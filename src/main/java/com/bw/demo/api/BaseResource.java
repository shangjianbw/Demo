/**
 * 
 */
package com.bw.demo.api;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @project 百望股份云门户
 * @package com.bw.demo.api
 * @file BaseResource.java 创建时间:2015年12月10日下午10:22:30
 * @title 标题（要求能简洁地表达出类的功能和职责）
 * @description 描述（简要描述类的职责、实现方式、使用注意事项等）
 * @copyright Copyright (c) 2015 百望股份有限公司
 * @company 百望股份有限公司
 * @module 模块: 模块名称
 * @author   商健
 * @reviewer 审核人
 * @version 1.0
 * @history 修订历史（历次修订内容、修订人、修订时间等）
 *
 */
public class BaseResource {
    @Autowired
    private Encoder encoder;
    
    public Encoder getEncoder() {
        return encoder;
    }

    public void setEncoder(Encoder encoder) {
        this.encoder = encoder;
    }

    protected String convertReturn(Object o){
        return encoder.encode(o);
    }
}
