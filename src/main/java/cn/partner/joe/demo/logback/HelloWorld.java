package cn.partner.joe.demo.logback;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HelloWorld {
	public static void main(String[] args) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (;;) {
					log.info("why are you so busy ?safsaaa");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}
}
