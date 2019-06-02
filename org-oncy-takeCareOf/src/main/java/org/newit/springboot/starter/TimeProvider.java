package org.newit.springboot.starter;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class TimeProvider {

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date currentTime;

    public Date provideTime(){
        return currentTime;
    }

    public Date getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
    }
}
