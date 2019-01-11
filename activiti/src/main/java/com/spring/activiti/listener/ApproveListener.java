package com.spring.activiti.listener;

import lombok.extern.slf4j.Slf4j;
import org.activiti.engine.delegate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ApproveListener implements TaskListener {
    private Expression expression;

    @Override
    public void notify(DelegateTask delegateTask) {
        log.info("sfddfd{}",(String)expression.getValue(delegateTask));
    }
}
