package cmcc.dbi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@Slf4j
@SpringBootApplication
public class DatabasesInspectionApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatabasesInspectionApplication.class, args);
        log.info("server started");
    }

}
