package com.apnahotel.model;

import java.util.Date;

public class Booking {
                 private long bookingId;
                 private String roomId;
                 private String custId;
                 private Date checkInDate;
                 private Date checkOutDate;
                 private long billAmount;
                 private long paidAmount;
                 
				public Booking() {
					super();
				}

				public Booking(long bookingId, String roomId, String custId, Date checkInDate, Date checkOutDate,
						long billAmount, long paidAmount) {
					super();
					this.bookingId = bookingId;
					this.roomId = roomId;
					this.custId = custId;
					this.checkInDate = checkInDate;
					this.checkOutDate = checkOutDate;
					this.billAmount = billAmount;
					this.paidAmount = paidAmount;
				}

				public long getBookingId() {
					return bookingId;
				}

				public void setBookingId(long bookingId) {
					this.bookingId = bookingId;
				}

				public String getRoomId() {
					return roomId;
				}

				public void setRoomId(String roomId) {
					this.roomId = roomId;
				}

				public String getCustId() {
					return custId;
				}

				public void setCustId(String custId) {
					this.custId = custId;
				}

				public Date getCheckInDate() {
					return checkInDate;
				}

				public void setCheckInDate(Date checkInDate) {
					this.checkInDate = checkInDate;
				}

				public Date getCheckOutDate() {
					return checkOutDate;
				}

				public void setCheckOutDate(Date checkOutDate) {
					this.checkOutDate = checkOutDate;
				}

				public long getBillAmount() {
					return billAmount;
				}

				public void setBillAmount(long billAmount) {
					this.billAmount = billAmount;
				}

				public long getPaidAmount() {
					return paidAmount;
				}

				public void setPaidAmount(long paidAmount) {
					this.paidAmount = paidAmount;
				}

				@Override
				public String toString() {
					return "Booking [bookingId=" + bookingId + ", roomId=" + roomId + ", custId=" + custId
							+ ", checkInDate=" + checkInDate + ", checkOutDate=" + checkOutDate + ", billAmount="
							+ billAmount + ", paidAmount=" + paidAmount + "]";
				}
                 
                 
                
}          
