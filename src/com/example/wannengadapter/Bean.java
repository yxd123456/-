package com.example.wannengadapter;

import android.widget.ImageView;
import android.widget.TextView;

public class Bean {
	
	private String name;
	private int pic;
	
	
	
	public Bean(String name, int icLauncher) {
		super();
		this.name = name;
		this.pic = icLauncher;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPic() {
		return pic;
	}
	public void setPic(int pic) {
		this.pic = pic;
	}
	
	
	
}
