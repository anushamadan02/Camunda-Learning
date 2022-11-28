package com.example.workflow.delegates;
import org.springframework.stereotype.Component;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.delegate.DelegateExecution;


@Component
public class myDelegates implements JavaDelegate {

	@Override
	public void execute(DelegateExecution delegateExecution) throws Exception {
		System.out.println("Hey I am here");
	}
}
