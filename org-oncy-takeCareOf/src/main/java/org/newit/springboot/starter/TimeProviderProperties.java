package org.newit.springboot.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Date;

@ConfigurationProperties(prefix = "org.oncy.timeprovider")
public class TimeProviderProperties {
    private static Date CURRENT_TIME = new Date();

    private Date currentTime = CURRENT_TIME;

    public Date getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
    }
}
