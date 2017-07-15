package cn.edu.nwpu;

import android.widget.ImageView;

public class ContentBean {
	private String id;
	private String title;
	private String content;
	private ImageView img;
	
	public String getId() {
		return id;
	}
	public ImageView getI(){
		return img;
	}
	public void setImg(int resId){
		img.setImageResource(resId);
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
