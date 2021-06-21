package it.eplastic.amazonintegration.api.obj.feeds;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SubmitFeedResponse implements Serializable {
	
	@JsonProperty("SubmitFeedResult")
	private SubmitFeedResult submitFeedResult;

	public SubmitFeedResult getSubmitFeedResult() {
		return submitFeedResult;
	}

	public void setSubmitFeedResult(SubmitFeedResult submitFeedResult) {
		this.submitFeedResult = submitFeedResult;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SubmitFeedResponse [submitFeedResult=");
		builder.append(submitFeedResult);
		builder.append("]");
		return builder.toString();
	}

}
