package org.icefaces.view;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.icefaces.ace.event.DateSelectEvent;

@ManagedBean(name= "yourBean")
@ViewScoped
public class YourBean implements Serializable {
	
	/**
	 * ID generated. 
	 */
	private static final long serialVersionUID = 5058131064162864510L;

	private Date selectDateProperty = new Date(System.currentTimeMillis());

	public Date getSelectDateProperty() {
		return selectDateProperty;
	}

	public void setSelectDateProperty(Date selectDateProperty) {
		this.selectDateProperty = selectDateProperty;
	}
	
	public void dateSelectListener(DateSelectEvent event) {
		setSelectDateProperty(event.getDate());
    }
}