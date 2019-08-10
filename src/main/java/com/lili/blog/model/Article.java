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

	/** 文章分类id */
	private String typeId;
	/** 文章分类名称 */
	private String typeName;

	/** 访问量 */
	private int visits;

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

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public int getVisits() {
		return visits;
	}

	public void setVisits(int visits) {
		this.visits = visits;
	}

}
