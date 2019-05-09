package configuration;

import mathOperations.Addition;
import mathOperations.MathOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    static MathOperation getMathOperation(){
        return new Addition();
    }


}
