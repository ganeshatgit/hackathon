package org.tcs.hackathon.model;

public class Rating {

	  private float overallRating;
      private int count;
      private int recommendedCount;
      private int notRecommendedCount;
	public float getOverallRating() {
		return overallRating;
	}
	public void setOverallRating(float overallRating) {
		this.overallRating = overallRating;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getRecommendedCount() {
		return recommendedCount;
	}
	public void setRecommendedCount(int recommendedCount) {
		this.recommendedCount = recommendedCount;
	}
	public int getNotRecommendedCount() {
		return notRecommendedCount;
	}
	public void setNotRecommendedCount(int notRecommendedCount) {
		this.notRecommendedCount = notRecommendedCount;
	}
}
