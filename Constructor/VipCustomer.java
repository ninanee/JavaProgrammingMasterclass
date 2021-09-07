package com.yunni;

public class VipCustomer {
    private String vipName;
    private double vipCreditLimit;
    private String vipEmailAddress;

    public String getVipName() {
        return this.vipName;
    }

    public double getVipCreditLimit() {
        return this.vipCreditLimit;
    }

    public String getVipEmailAddress() {
        return this.vipEmailAddress;
    }

    public VipCustomer(){
        this("Default Name", 9999999.99, "default@fakeemail.com");
        System.out.println("this is my default ctor");
    }

    public VipCustomer(String vipName, double vipCreditLimit) {
        this(vipName, vipCreditLimit, "defaultvalue@fakeemail.com");
    }

    public VipCustomer(String vipName, double vipCreditLimit, String vipEmailAddress) {
        this.vipName = vipName;
        this.vipCreditLimit = vipCreditLimit;
        this.vipEmailAddress = vipEmailAddress;
    }
}
