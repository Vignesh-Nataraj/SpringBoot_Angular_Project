package com.vicky.spring.jpa.h2.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;

@Entity
@Table(name = "tutorials")
@Schema(
		name = "Tutorial",
		description = "Schema to hold Tutorial information"
)
public class Tutorial {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Schema(
			description = "Id value of the tutorial", example = "To be auto generated while creation"
	)
	private long id;

	@Column(name = "title")
	@Schema(
			description = "Title of the tutorial", example = "Title"
	)
	private String title;

	@Column(name = "description")
	@Schema(
			description = "Title of the tutorial", example = "Description of Tutorial"
	)
	private String description;

	@Column(name = "published")
	@Schema(
			description = "Flag to check if tutorial is published or not", example = "true/false"
	)
	private boolean published;

	public Tutorial() {

	}

	public Tutorial(String title, String description, boolean published) {
		this.title = title;
		this.description = description;
		this.published = published;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isPublished() {
		return published;
	}

	public void setPublished(boolean isPublished) {
		this.published = isPublished;
	}

	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
	}

}
