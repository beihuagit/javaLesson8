package com.design.template;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * @author ÂåË®Çç´¨
 * @date 2021/5/2 23:23
 * */
public class TemplateMethodTest extends TestCase {

    @Test
    public void test1() throws Exception {
        TemplateMethod t1 = new TemplateMethod(){
            @Override
            protected void wrapPrint(String message, String prefix) {
                super.wrapPrint(message, prefix);
            }
        };

        TemplateMethod t2 = new TemplateMethod(){
            @Override
            protected void wrapPrint(String message, String prefix) {
                super.wrapPrint(message, prefix);
            }
        };
        t2.print("Hello Thread", "+");
        t1.print("Hello Thread", "*");
    }
}
