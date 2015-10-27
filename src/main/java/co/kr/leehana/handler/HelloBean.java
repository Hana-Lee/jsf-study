package co.kr.leehana.handler;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

import java.io.Serializable;

/**
 * @author Hana Lee
 * @since 2015-10-26 18:18
 */
@ManagedBean
@SessionScoped
public class HelloBean implements Serializable {

	private static final long serialVersionUID = 5689027078131617496L;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String showWelcomPageActionListener() {
		return "welcome_nav";
	}
}
