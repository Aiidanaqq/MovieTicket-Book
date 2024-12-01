package org.example.movieticketbooking;

import java.util.Date;

public class Booking {

    private int id;
    private String userName;
    private String movieTitle;
    private String showtime;
    private int seatCount;
    private Date bookingDate; // Added for additional tracking


    public Booking(int id, String userName, String movieTitle, String showtime, int seatCount, Date bookingDate) {
        this.id = id;
        this.userName = userName;
        this.movieTitle = movieTitle;
        this.showtime = showtime;
        this.seatCount = seatCount;
        this.bookingDate = bookingDate;
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

    public String getShowtime() {
        return showtime;
    }

    public void setShowtime(String showtime) {
        this.showtime = showtime;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", userId=" + userName +
                ", movieId=" + movieTitle +
                ", showtime='" + showtime + '\'' +
                ", seatCount=" + seatCount +
                ", bookingDate=" + bookingDate +
                '}';
    }
}

