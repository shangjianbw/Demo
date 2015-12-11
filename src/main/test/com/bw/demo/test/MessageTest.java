/**
 * 
 */
package com.bw.demo.test;

import java.net.URI;
import java.net.URISyntaxException;

import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.junit.Test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import junit.framework.TestCase;

/**
 *
 * @project 百望股份云门户
 * @package com.bw.demo.test
 * @file MessageTest.java 创建时间:2015年12月10日下午10:55:11
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
public class MessageTest extends TestCase {
    private String testUrl = "http://127.0.0.1:8080/message";

    @Test
    public void testUtilHello() throws URISyntaxException, JSONException {
        JSONObject param = new JSONObject();
        param.put("user", "foo1");
        param.put("message", "bar2");
        URI url = new URI(testUrl);  
        Client client = Client.create();  
        WebResource resource = client.resource(url);  
        ClientResponse response = resource.type(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .post(ClientResponse.class, param.toString());
        System.out.println("result : " + response.getEntity(String.class));
    }
}
