/**
 * 
 */
package com.bw.demo.service;

import com.bw.demo.vo.MessageDTO;

/**
 *
 * @project 百望股份云门户
 * @package com.bw.demo.service
 * @file MessageService.java 创建时间:2015年12月10日下午9:34:21
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
public interface MessageService {

    /**
     *@name    中文名称
     *@description 相关说明
     *@time    创建时间:2015年12月10日下午10:09:38
     *@param inVo
     *@return
     *@author   商健
     *@history 修订历史（历次修订内容、修订人、修订时间等）
     */
    MessageDTO getMessage(MessageDTO inVo);

}
