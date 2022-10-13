package xyz.jhse.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//최초 생성시 DB 세팅정보를 입력하지않으면 실행되지 않아 일시적으로 DB 사용 안함 설정. 추후 DB 사용시 exclude 제거
//@SpringBootApplication
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class BlogApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogApiApplication.class, args);
    }

}
