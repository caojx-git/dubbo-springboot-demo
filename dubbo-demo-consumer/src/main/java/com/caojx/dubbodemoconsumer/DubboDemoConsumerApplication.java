package com.caojx.dubbodemoconsumer;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;


@ImportResource("classpath:dubbo-demo-consumer.xml")
@SpringBootApplication
public class DubboDemoConsumerApplication {


	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(DubboDemoConsumerApplication.class, args);
		if (configurableApplicationContext.isRunning()) {
			System.out.println("=========DubboDemoConsumerApplication 启动成功！=========");
		}
	}


}
