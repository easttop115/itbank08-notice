package link.itbank08.notice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class NoticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(NoticeApplication.class, args);
	}

}
