package com.podio.item;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.podio.app.ApplicationMicro;
import com.podio.comment.Comment;
import com.podio.rating.ObjectRatings;

@XmlRootElement
public class Item {

	/**
	 * The id of the item
	 */
	private int id;

	/**
	 * The app where the item belongs
	 */
	private ApplicationMicro application;

	/**
	 * The external id of the item. This can be used to hold a reference to the
	 * item in an external system.
	 */
	private String externalId;

	/**
	 * The information on who created the first revision of the item
	 */
	private ItemRevision initialRevision;

	/**
	 * The latest revision
	 */
	private ItemRevision currentRevision;

	/**
	 * The title of the item. This is made of up one of the fields below, or by
	 * the item name and id
	 */
	private String title;

	/**
	 * The values for each field
	 */
	private List<FieldValues> fields;

	/**
	 * The latest 8 revisions of the item sorted descending by date
	 */
	private List<ItemRevision> revisions;

	/**
	 * All the comments on the item
	 */
	private List<Comment> comments;

	/**
	 * The ratings on the item
	 */
	private ObjectRatings ratings;

	@XmlElement(name = "item_id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@XmlElement(name = "app")
	public ApplicationMicro getApplication() {
		return application;
	}

	public void setApplication(ApplicationMicro application) {
		this.application = application;
	}

	@XmlElement(name = "external_id")
	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	@XmlElement(name = "initial_revision")
	public ItemRevision getInitialRevision() {
		return initialRevision;
	}

	public void setInitialRevision(ItemRevision initialRevision) {
		this.initialRevision = initialRevision;
	}

	@XmlElement(name = "current_revision")
	public ItemRevision getCurrentRevision() {
		return currentRevision;
	}

	public void setCurrentRevision(ItemRevision currentRevision) {
		this.currentRevision = currentRevision;
	}

	@XmlElement(name = "title")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@XmlElement(name = "fields")
	public List<FieldValues> getFields() {
		return fields;
	}

	public void setFields(List<FieldValues> fields) {
		this.fields = fields;
	}

	@XmlElement(name = "revisions")
	public List<ItemRevision> getRevisions() {
		return revisions;
	}

	public void setRevisions(List<ItemRevision> revisions) {
		this.revisions = revisions;
	}

	@XmlElement(name = "comments")
	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	@XmlElement(name = "ratings")
	public ObjectRatings getRatings() {
		return ratings;
	}

	public void setRatings(ObjectRatings ratings) {
		this.ratings = ratings;
	}
}
