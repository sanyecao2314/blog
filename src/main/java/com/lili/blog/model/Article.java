package com.lili.blog.model;

import com.lili.base.model.BaseModel;

/**
 * 文章model
 *
 * @author lili
 * @date 2019年8月4日
 * @email 1059997113@qq.com
 */
public class Article extends BaseModel {
	private String id;
	private String title;
	/** 摘要 */
	private String summary;
	private String content;

	public String getId() {
		return id;
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

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
