package org.htwdresden.informatik.pkademo.SpringPKAdemo;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Scheduled;

/*
@SpringBootApplication
public class SchedulerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchedulerDemoApplication.class, args);

	}
	// 2000L: 2 * 1000 ms
	//@Scheduled(fixedRate = 2000L)
	// PT60M, PT1H
	//@Scheduled(initialDelay = 1000L, fixedDelayString = "PT5S")
	// property
	@Scheduled(initialDelay = 1000L, fixedDelayString = "${someJob.delay}")
	// cron
	// sec, min, hour, day of month, month, day of week
	// see more at: www.crontab.guru (format with no second)
	//@Scheduled(initialDelay = 1000L, cron = "* * * * * *")
	//@Scheduled(initialDelay = 1000L, cron = "0 0 18 * * MON-FRI")
	// must be void and have no parameters
	// print current time
	void someJob() {
		System.out.println("Now is " + new Date());
	}

}
*/
