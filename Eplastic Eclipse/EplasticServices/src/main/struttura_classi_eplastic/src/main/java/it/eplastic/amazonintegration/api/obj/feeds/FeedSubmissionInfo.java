package it.eplastic.amazonintegration.api.obj.feeds;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FeedSubmissionInfo implements Serializable {
	
	@JsonProperty("FeedSubmissionId")
	private String feedSubmissionId;
	@JsonProperty("FeedType")
	private String feedType;
	@JsonProperty("SubmittedDate")
	private String submittedDate;
	@JsonProperty("FeedProcessingStatus")
	private String feedProcessingStatus;
	public String getFeedSubmissionId() {
		return feedSubmissionId;
	}
	public void setFeedSubmissionId(String feedSubmissionId) {
		this.feedSubmissionId = feedSubmissionId;
	}
	public String getFeedType() {
		return feedType;
	}
	public void setFeedType(String feedType) {
		this.feedType = feedType;
	}
	public String getSubmittedDate() {
		return submittedDate;
	}
	public void setSubmittedDate(String submittedDate) {
		this.submittedDate = submittedDate;
	}
	public String getFeedProcessingStatus() {
		return feedProcessingStatus;
	}
	public void setFeedProcessingStatus(String feedProcessingStatus) {
		this.feedProcessingStatus = feedProcessingStatus;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FeedSubmissionInfo [feedSubmissionId=");
		builder.append(feedSubmissionId);
		builder.append(", feedType=");
		builder.append(feedType);
		builder.append(", submittedDate=");
		builder.append(submittedDate);
		builder.append(", feedProcessingStatus=");
		builder.append(feedProcessingStatus);
		builder.append("]");
		return builder.toString();
	}

}
