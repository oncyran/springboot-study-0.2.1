package org.newit.springboot.starter;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(TimeProviderProperties.class)
@ConditionalOnClass(TimeProvider.class)
@ConditionalOnProperty(prefix = "org.oncy.timeprovider", value = "enabled", matchIfMissing = true)
public class TimeProviderAutoConfiguration{
    @Autowired
    private TimeProviderProperties timeProviderProperties;

    @Bean
    @ConditionalOnMissingBean(TimeProvider.class)
    public TimeProvider getTimeProvider(){
        TimeProvider timeProvider = new TimeProvider();
        timeProvider.setCurrentTime(timeProviderProperties.getCurrentTime());
        return timeProvider;
    }
}
