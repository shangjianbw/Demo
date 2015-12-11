/**
 * 
 */
package com.bw.demo.vo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @project 百望股份云门户
 * @package com.bw.demo.vo
 * @file MessageDTO.java 创建时间:2015年12月10日下午9:50:42
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
@XmlRootElement
public class MessageDTO implements Serializable {

    /**
     * @description 字段功能描述
     * @value value:serialVersionUID
     */
    private static final long serialVersionUID = -43471572523170701L;

    private String id;
    
    private String user;
    
    private String message;
    
    private String postedAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPostedAt() {
        return postedAt;
    }

    public void setPostedAt(String postedAt) {
        this.postedAt = postedAt;
    }
}
