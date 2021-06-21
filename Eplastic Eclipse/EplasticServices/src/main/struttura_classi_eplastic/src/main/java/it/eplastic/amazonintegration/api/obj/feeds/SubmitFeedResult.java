package it.eplastic.amazonintegration.api.obj.feeds;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import it.eplastic.amazonintegration.api.obj.generic.ResponseMetadata;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SubmitFeedResult implements Serializable {

	@JsonProperty("FeedSubmissionInfo")
	private FeedSubmissionInfo feedSubmissionInfo;
	@JsonProperty("ResponseMetadata")
	private ResponseMetadata responseMetadata;
	
	public FeedSubmissionInfo getFeedSubmissionInfo() {
		return feedSubmissionInfo;
	}
	public void setFeedSubmissionInfo(FeedSubmissionInfo feedSubmissionInfo) {
		this.feedSubmissionInfo = feedSubmissionInfo;
	}
	public ResponseMetadata getResponseMetadata() {
		return responseMetadata;
	}
	public void setResponseMetadata(ResponseMetadata responseMetadata) {
		this.responseMetadata = responseMetadata;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SubmitFeedResult [feedSubmissionInfo=");
		builder.append(feedSubmissionInfo);
		builder.append(", responseMetadata=");
		builder.append(responseMetadata);
		builder.append("]");
		return builder.toString();
	}
	
}
