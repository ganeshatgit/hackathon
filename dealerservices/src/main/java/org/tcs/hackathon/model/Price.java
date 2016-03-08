package org.tcs.hackathon.model;

public class Price 
{
	private double baseMSRP;
	private double baseInvoice;
	private double deliveryCharges;
	private double usedTmvRetail;
	private double usedPrivateParty;
	private double usedTradeIn;
	private boolean estimateTmv;
	private int tmvRecommendedRating;
	public double getBaseMSRP() {
		return baseMSRP;
	}
	public void setBaseMSRP(double baseMSRP) {
		this.baseMSRP = baseMSRP;
	}
	public double getBaseInvoice() {
		return baseInvoice;
	}
	public void setBaseInvoice(double baseInvoice) {
		this.baseInvoice = baseInvoice;
	}
	public double getDeliveryCharges() {
		return deliveryCharges;
	}
	public void setDeliveryCharges(double deliveryCharges) {
		this.deliveryCharges = deliveryCharges;
	}
	public double getUsedTmvRetail() {
		return usedTmvRetail;
	}
	public void setUsedTmvRetail(double usedTmvRetail) {
		this.usedTmvRetail = usedTmvRetail;
	}
	public double getUsedPrivateParty() {
		return usedPrivateParty;
	}
	public void setUsedPrivateParty(double usedPrivateParty) {
		this.usedPrivateParty = usedPrivateParty;
	}
	public double getUsedTradeIn() {
		return usedTradeIn;
	}
	public void setUsedTradeIn(double usedTradeIn) {
		this.usedTradeIn = usedTradeIn;
	}
	public boolean isEstimateTmv() {
		return estimateTmv;
	}
	public void setEstimateTmv(boolean estimateTmv) {
		this.estimateTmv = estimateTmv;
	}
	public int getTmvRecommendedRating() {
		return tmvRecommendedRating;
	}
	public void setTmvRecommendedRating(int tmvRecommendedRating) {
		this.tmvRecommendedRating = tmvRecommendedRating;
	}
}
