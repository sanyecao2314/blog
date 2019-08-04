package com.lili.blog.model;

import com.lili.base.model.BaseModel;

/**
 * 回复model
 *
 * @author lili
 * @date 2019年8月4日
 * @email 1059997113@qq.com
 */
public class Reply extends BaseModel {
	private String id;
	private String articleId;
	private String commentId;
	private String content;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getArticleId() {
		return articleId;
	}

	public void setArticleId(String articleId) {
		this.articleId = articleId;
	}

	public String getCommentId() {
		return commentId;
	}

	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
