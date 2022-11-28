package com.example.workflow.delegates;
import org.springframework.stereotype.Component;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.delegate.DelegateExecution;

//In this class we are trying to read a variable from the delegate class
@Component
public class myVarDelegate implements JavaDelegate {
	@Override
	public void execute(DelegateExecution delegateExecution) throws Exception {
		String Myvar = (String) delegateExecution.getVariable("sample");
		System.out.println(Myvar);
	}
}
