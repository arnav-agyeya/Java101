package com.apnahotel.model;

public class Room {
             private String rID;
             private String rLocation;
             private int rPrice;
             private int rStatus;
             private String rType;
             
             public Room() {
 				super();
 			}
             
             
			public Room(String rID, String rLocation, int rPrice, int rStatus, String rType) {
				super();
				this.rID = rID;
				this.rLocation = rLocation;
				this.rPrice = rPrice;
				this.rStatus = rStatus;
				this.rType = rType;
			}


			public String getrID() {
				return rID;
			}

			public void setrID(String rID) {
				this.rID = rID;
			}

			public String getrLocation() {
				return rLocation;
			}

			public void setrLocation(String rLocation) {
				this.rLocation = rLocation;
			}

			public int getrPrice() {
				return rPrice;
			}

			public void setrPrice(int rPrice) {
				this.rPrice = rPrice;
			}

			public int getrStatus() {
				return rStatus;
			}

			public void setrStatus(int rStatus) {
				this.rStatus = rStatus;
			}

			public String getrType() {
				return rType;
			}

			public void setrType(String rType) {
				this.rType = rType;
			}


			@Override
			public String toString() {
				return "Room [rID=" + rID + ", rLocation=" + rLocation + ", rPrice=" + rPrice + ", rStatus=" + rStatus
						+ ", rType=" + rType + "]";
			}
             
		
             
}
