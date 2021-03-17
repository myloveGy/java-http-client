package io.github.mylovegy;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class HelperTest {

    @Test
    public void test() {
        Map<String, Object> query = new HashMap<>();
        String url = Helper.getQueryString("http://www.baidu.com", query);
        System.out.println(url);
        Assert.assertEquals("http://www.baidu.com", url);

        query.put("username", "jinxing.liu");
        query.put("age", 25);
        query.put("name", "hello");

        url = Helper.getQueryString("http://www.baidu.com", query);
        System.out.println(url);

        Assert.assertEquals("http://www.baidu.com?name=hello&age=25&username=jinxing.liu", url);

        url = Helper.getQueryString("http://www.baidu.com?s=123&", query);
        System.out.println(url);
        Assert.assertEquals("http://www.baidu.com?s=123&name=hello&age=25&username=jinxing.liu", url);
    }
}