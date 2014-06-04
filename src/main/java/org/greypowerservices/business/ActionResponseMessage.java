package org.greypowerservices.business;

public class ActionResponseMessage {
	
	private boolean isActionOk;
	private String actionMessage;
	private Object result;
	
	public boolean isActionOk() {
		return isActionOk;
	}
	public void setActionOk(boolean isActionOk) {
		this.isActionOk = isActionOk;
	}
	public String getActionMessage() {
		return actionMessage;
	}
	public void setActionMessage(String actionMessage) {
		this.actionMessage = actionMessage;
	}
	public Object getResult() {
		return result;
	}
	public void setResult(Object result) {
		this.result = result;
	}
	
}
