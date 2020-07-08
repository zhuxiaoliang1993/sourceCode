package com.ynet.shedlockInfo;

import net.javacrumbs.shedlock.core.SchedulerLock;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

public class shedlockStudy  implements SchedulingConfigurer {
    @Scheduled
    @SchedulerLock
    public void myShedl(){

    }

    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {


    }
}
