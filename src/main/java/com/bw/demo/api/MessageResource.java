/**
 * 
 */
package com.bw.demo.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bw.demo.service.MessageService;
import com.bw.demo.vo.MessageDTO;

/**
 *
 * @project 百望股份云门户
 * @package com.bw.demo.api
 * @file MessageResource.java 创建时间:2015年12月10日下午9:32:51
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
@Component
@Path("/")
public class MessageResource {
    @Autowired
    private MessageService messageService;

    public MessageService getMessageService() {
        return messageService;
    }
    
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    @Path("/message")
    @POST
    @Consumes( MediaType.APPLICATION_JSON )  
    @Produces( MediaType.APPLICATION_JSON )
    public MessageDTO sayMessage(MessageDTO message) {
        return this.messageService.getMessage(message);
    }
}
