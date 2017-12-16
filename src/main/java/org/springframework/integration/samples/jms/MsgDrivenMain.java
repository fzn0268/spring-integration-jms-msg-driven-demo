package org.springframework.integration.samples.jms;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.jms.JmsMessageDrivenEndpoint;

import java.util.concurrent.TimeUnit;

public class MsgDrivenMain {
    public static void main(String... args) throws Exception {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/spring/integration/messageDrivenChannelAdapter.xml");
        JmsMessageDrivenEndpoint msgDrivenIn = applicationContext.getBean("msgDrivenIn", JmsMessageDrivenEndpoint.class);
        msgDrivenIn.start();
        while (true) {
            TimeUnit.MICROSECONDS.sleep(1);
        }
    }
}
