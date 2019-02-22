package com.apnahotel.model;

public class Customer {
                  private String custId;
                  private String custName;
                  private String custSex;
                  private int custAge;
                  private String custMob;
                  private String custEmail;
                  private String custPassword;
                  
				public Customer() {
					super();
				}
				
				
				


				public Customer(String custId, String custName, String custSex, int custAge, String custMob,
						String custEmail, String custPassword) {
					super();
					this.custId = custId;
					this.custName = custName;
					this.custSex = custSex;
					this.custAge = custAge;
					this.custMob = custMob;
					this.custEmail = custEmail;
					this.custPassword = custPassword;
				}





				public String getCustId() {
					return custId;
				}





				public void setCustId(String custId) {
					this.custId = custId;
				}





				public String getCustName() {
					return custName;
				}





				public void setCustName(String custName) {
					this.custName = custName;
				}





				public String getCustSex() {
					return custSex;
				}





				public void setCustSex(String custSex) {
					this.custSex = custSex;
				}





				public int getCustAge() {
					return custAge;
				}





				public void setCustAge(int custAge) {
					this.custAge = custAge;
				}





				public String getCustMob() {
					return custMob;
				}





				public void setCustMob(String custMob) {
					this.custMob = custMob;
				}





				public String getCustEmail() {
					return custEmail;
				}





				public void setCustEmail(String custEmail) {
					this.custEmail = custEmail;
				}





				public String getCustPassword() {
					return custPassword;
				}





				public void setCustPassword(String custPassword) {
					this.custPassword = custPassword;
				}





				@Override
				public String toString() {
					return "Customer [custId=" + custId + ", custName=" + custName + ", custSex=" + custSex
							+ ", custAge=" + custAge + ", custMob=" + custMob + ", custEmail=" + custEmail
							+ ", custPassword=" + custPassword + "]";
				}





				@Override
				public int hashCode() {
					final int prime = 31;
					int result = 1;
					result = prime * result + custAge;
					result = prime * result + ((custEmail == null) ? 0 : custEmail.hashCode());
					result = prime * result + ((custId == null) ? 0 : custId.hashCode());
					result = prime * result + ((custMob == null) ? 0 : custMob.hashCode());
					result = prime * result + ((custName == null) ? 0 : custName.hashCode());
					result = prime * result + ((custPassword == null) ? 0 : custPassword.hashCode());
					result = prime * result + ((custSex == null) ? 0 : custSex.hashCode());
					return result;
				}





				@Override
				public boolean equals(Object obj) {
					if (this == obj)
						return true;
					if (obj == null)
						return false;
					if (getClass() != obj.getClass())
						return false;
					Customer other = (Customer) obj;
					if (custAge != other.custAge)
						return false;
					if (custEmail == null) {
						if (other.custEmail != null)
							return false;
					} else if (!custEmail.equals(other.custEmail))
						return false;
					if (custId == null) {
						if (other.custId != null)
							return false;
					} else if (!custId.equals(other.custId))
						return false;
					if (custMob == null) {
						if (other.custMob != null)
							return false;
					} else if (!custMob.equals(other.custMob))
						return false;
					if (custName == null) {
						if (other.custName != null)
							return false;
					} else if (!custName.equals(other.custName))
						return false;
					if (custPassword == null) {
						if (other.custPassword != null)
							return false;
					} else if (!custPassword.equals(other.custPassword))
						return false;
					if (custSex == null) {
						if (other.custSex != null)
							return false;
					} else if (!custSex.equals(other.custSex))
						return false;
					return true;
				}

				
				


                  
}
