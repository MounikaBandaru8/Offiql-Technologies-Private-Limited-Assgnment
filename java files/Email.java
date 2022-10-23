package com.example.demo;

public class Email {
	private String From;
	 private String To;
	 private String Subject;
	 private String Body;
 public String getFrom() {
		return From;
	}
	public void setFrom(String from) {
		From = from;
	}
	public String getTo() {
		return To;
	}
	public void setTo(String to) {
		To = to;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public String getBody() {
		return Body;
	}
	public void setBody(String body) {
		Body = body;
	}
	@Override
	public String toString() {
		return "Email [From=" + From + ", To=" + To + ", Subject=" + Subject + ", Body=" + Body + "]";
	}

}
