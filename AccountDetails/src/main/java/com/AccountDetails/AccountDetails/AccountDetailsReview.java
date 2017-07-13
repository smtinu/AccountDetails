package com.AccountDetails.AccountDetails;

public class AccountDetailsReview {
	public String id;
	public String MSISDN; 
    public String Status;
    public String Package;
    public String ServiceAccountNumber;
    public String BillingNumber;
    public String BillPreference;
    public String Vanity;
	public AccountDetailsReview(String id, String mSISDN, String status, String package1, String serviceAccountNumber,
			String billingNumber, String billPreference, String vanity) {
		super();
		this.id = id;
		MSISDN = mSISDN;
		Status = status;
		Package = package1;
		ServiceAccountNumber = serviceAccountNumber;
		BillingNumber = billingNumber;
		BillPreference = billPreference;
		Vanity = vanity;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMSISDN() {
		return MSISDN;
	}
	public void setMSISDN(String mSISDN) {
		MSISDN = mSISDN;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getPackage() {
		return Package;
	}
	public void setPackage(String package1) {
		Package = package1;
	}
	public String getServiceAccountNumber() {
		return ServiceAccountNumber;
	}
	public void setServiceAccountNumber(String serviceAccountNumber) {
		ServiceAccountNumber = serviceAccountNumber;
	}
	public String getBillingNumber() {
		return BillingNumber;
	}
	public void setBillingNumber(String billingNumber) {
		BillingNumber = billingNumber;
	}
	public String getBillPreference() {
		return BillPreference;
	}
	public void setBillPreference(String billPreference) {
		BillPreference = billPreference;
	}
	public String getVanity() {
		return Vanity;
	}
	public void setVanity(String vanity) {
		Vanity = vanity;
	}
   
	
	
	
	

}
