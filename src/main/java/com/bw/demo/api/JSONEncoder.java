/**
 * 
 */
package com.bw.demo.api;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Component;

/**
 *
 * @project 百望股份云门户
 * @package com.bw.demo.api
 * @file JSONEncoder.java 创建时间:2015年12月10日下午10:25:10
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
public class JSONEncoder implements Encoder {
    
    /**
     *@constructor 构造方法
     */
    public JSONEncoder() {
        System.out.println("JSONEncoder");
    }
    /**
     *@name    中文名称
     *@description 相关说明
     *@time    创建时间:2015年12月10日下午10:26:14
     *@param obj
     *@return
     * @author   作者
     *@history 修订历史（历次修订内容、修订人、修订时间等）
     */
    public String encode(Object obj) {
        final ObjectMapper objectMapper = new ObjectMapper();
        String json = "";
        if(obj != null){
            try {
                json = objectMapper.writeValueAsString(obj);
            } catch (JsonGenerationException e) {
                e.printStackTrace();
            } catch (JsonMappingException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return json;
    }
}
