package com.project.shop.vo;

public class MemberVO {

	private String memberID;
	private String memberPW;
	private String memberName;
	private char memberGender;
	private String memberPhoneNumber;
	private String memberAddress;
	private String memberEmail;
	private boolean memberEmailAlarm;
	private int memberPoint;
	private boolean selfAuthentication;
	private boolean sellerConfirm;

	public MemberVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MemberVO(String memberID, String memberPW, String memberName, char memberGender, String memberPhoneNumber,
			String memberAddress, String memberEmail, boolean memberEmailAlarm, int memberPoint,
			boolean selfAuthentication, boolean sellerConfirm) {
		super();
		this.memberID = memberID;
		this.memberPW = memberPW;
		this.memberName = memberName;
		this.memberGender = memberGender;
		this.memberPhoneNumber = memberPhoneNumber;
		this.memberAddress = memberAddress;
		this.memberEmail = memberEmail;
		this.memberEmailAlarm = memberEmailAlarm;
		this.memberPoint = memberPoint;
		this.selfAuthentication = selfAuthentication;
		this.sellerConfirm = sellerConfirm;
	}

	@Override
	public String toString() {
		return "MemberVO [memberID=" + memberID + ", memberPW=" + memberPW + ", memberName=" + memberName
				+ ", memberGender=" + memberGender + ", memberPhoneNumber=" + memberPhoneNumber + ", memberAddress="
				+ memberAddress + ", memberEmail=" + memberEmail + ", memberEmailAlarm=" + memberEmailAlarm
				+ ", memberPoint=" + memberPoint + ", selfAuthentication=" + selfAuthentication + ", sellerConfirm="
				+ sellerConfirm + "]";
	}

	public String getMemberID() {
		return memberID;
	}

	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}

	public String getMemberPW() {
		return memberPW;
	}

	public void setMemberPW(String memberPW) {
		this.memberPW = memberPW;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public char getMemberGender() {
		return memberGender;
	}

	public void setMemberGender(char memberGender) {
		this.memberGender = memberGender;
	}

	public String getMemberPhoneNumber() {
		return memberPhoneNumber;
	}

	public void setMemberPhoneNumber(String memberPhoneNumber) {
		this.memberPhoneNumber = memberPhoneNumber;
	}

	public String getMemberAddress() {
		return memberAddress;
	}

	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public boolean isMemberEmailAlarm() {
		return memberEmailAlarm;
	}

	public void setMemberEmailAlarm(boolean memberEmailAlarm) {
		this.memberEmailAlarm = memberEmailAlarm;
	}

	public int getMemberPoint() {
		return memberPoint;
	}

	public void setMemberPoint(int memberPoint) {
		this.memberPoint = memberPoint;
	}

	public boolean isSelfAuthentication() {
		return selfAuthentication;
	}

	public void setSelfAuthentication(boolean selfAuthentication) {
		this.selfAuthentication = selfAuthentication;
	}

	public boolean isSellerConfirm() {
		return sellerConfirm;
	}

	public void setSellerConfirm(boolean sellerConfirm) {
		this.sellerConfirm = sellerConfirm;
	}

}
