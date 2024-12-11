package org.example.movieticketbooking;

import java.sql.Date;

public class Booking {

    private int id;
    private String userName;
    private String movieTitle;
    private int seatCount;
    private Date bookingDate;  // New field for booking date

    public Booking(int id, String userName, String movieTitle, int seatCount, Date bookingDate) {
        this.id = id;
        this.userName = userName;
        this.movieTitle = movieTitle;
        this.seatCount = seatCount;
        this.bookingDate = bookingDate;  // Initialize bookingDate
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public Date getBookingDate() {
        return bookingDate;  // Getter for bookingDate
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;  // Setter for bookingDate
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", movieTitle='" + movieTitle + '\'' +
                ", seatCount=" + seatCount +
                ", bookingDate=" + bookingDate +  // Include bookingDate in the string representation
                '}';
    }
}
