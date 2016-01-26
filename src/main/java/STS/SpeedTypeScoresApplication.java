package STS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import STS.profiles.DevProfile;
import STS.profiles.ProdProfile;

@SpringBootApplication
@Import({DevProfile.class, ProdProfile.class})
public class SpeedTypeScoresApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpeedTypeScoresApplication.class, args);
    }
}
