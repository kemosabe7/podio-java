package com.podio.item;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class ItemUpdate {

	/**
	 * The external id of the item. This can be used to hold a reference to the
	 * item in an external system.
	 */
	private String externalId;

	/**
	 * The values for each field
	 */
	private List<FieldValues> fields;

	public ItemUpdate() {
		super();
	}

	public ItemUpdate(String externalId, List<FieldValues> fields) {
		super();
		this.externalId = externalId;
		this.fields = fields;
	}

	@JsonProperty("external_id")
	public String getExternalId() {
		return externalId;
	}

	@JsonProperty("external_id")
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public List<FieldValues> getFields() {
		return fields;
	}

	public void setFields(List<FieldValues> fields) {
		this.fields = fields;
	}
}
