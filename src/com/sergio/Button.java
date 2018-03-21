package com.sergio;

public class Button {
	private String title;
	private OnClickListener onClickListener;
	
	public Button(String title) {
		super();
		this.title = title;
	}

	
	public String getTitle() {
		return title;
	}

	
	public void setOnClickListener(OnClickListener oncClickListener) {
		this.onClickListener = oncClickListener;
	}
	
	public void onClick() {
		this.onClickListener.onClick(this.title);
	}
	
	public interface OnClickListener {
		public void onClick(String title);
		
	}
}
