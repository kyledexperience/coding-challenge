package co.referrals;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Link {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String title;
	@Column
	private Integer clicks;

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getClicks() {
		return clicks;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setClicks(Integer clicks) {
		this.clicks = clicks;
	}

	public Link(String title, Integer clicks) {
		super();
		this.title = title;
		this.clicks = clicks;
	}

	public Link() {
		super();
	}

	@Override
	public String toString() {
		return "Link [id=" + id + ", title=" + title + ", clicks=" + clicks + "]";
	}

}
