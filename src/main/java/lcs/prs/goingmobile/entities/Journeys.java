package lcs.prs.goingmobile.entities;
// Generated Aug 19, 2016 11:55:51 AM by Hibernate Tools 5.1.0.Beta1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Journeys generated by hbm2java
 */
@Entity
@Table(name = "journeys", catalog = "goingmobile")
public class Journeys implements java.io.Serializable {

	private Integer id;
	private Clients clients;
	private String journeyName;
	private String rawData;
	private float kilometers;
	private double gmPoints;
	private float cycledProbability;
	private Date addedDate;
	private boolean isActive;
	private boolean isPublic;

	public Journeys() {
	}

	public Journeys(Clients clients, String journeyName, String rawData, float kilometers, double gmPoints,
			float cycledProbability, Date addedDate, boolean isActive, boolean isPublic) {
		this.clients = clients;
		this.journeyName = journeyName;
		this.rawData = rawData;
		this.kilometers = kilometers;
		this.gmPoints = gmPoints;
		this.cycledProbability = cycledProbability;
		this.addedDate = addedDate;
		this.isActive = isActive;
		this.isPublic = isPublic;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Client_Id", nullable = false)
	public Clients getClients() {
		return this.clients;
	}

	public void setClients(Clients clients) {
		this.clients = clients;
	}

	@Column(name = "journeyName", nullable = false, length = 45)
	public String getJourneyName() {
		return this.journeyName;
	}

	public void setJourneyName(String journeyName) {
		this.journeyName = journeyName;
	}

	@Column(name = "rawData", nullable = false)
	public String getRawData() {
		return this.rawData;
	}

	public void setRawData(String rawData) {
		this.rawData = rawData;
	}

	@Column(name = "kilometers", nullable = false, precision = 12, scale = 0)
	public float getKilometers() {
		return this.kilometers;
	}

	public void setKilometers(float kilometers) {
		this.kilometers = kilometers;
	}

	@Column(name = "gmPoints", nullable = false, precision = 22, scale = 0)
	public double getGmPoints() {
		return this.gmPoints;
	}

	public void setGmPoints(double gmPoints) {
		this.gmPoints = gmPoints;
	}

	@Column(name = "CycledProbability", nullable = false, precision = 12, scale = 0)
	public float getCycledProbability() {
		return this.cycledProbability;
	}

	public void setCycledProbability(float cycledProbability) {
		this.cycledProbability = cycledProbability;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "addedDate", nullable = false, length = 10)
	public Date getAddedDate() {
		return this.addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	@Column(name = "isActive", nullable = false)
	public boolean isIsActive() {
		return this.isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Column(name = "isPublic", nullable = false)
	public boolean isIsPublic() {
		return this.isPublic;
	}

	public void setIsPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}

}
