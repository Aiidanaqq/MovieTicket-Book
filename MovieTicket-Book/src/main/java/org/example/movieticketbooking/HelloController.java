package org.example.movieticketbooking;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class HelloController {

    @FXML
    private ComboBox<String> movieDropdown;

    @FXML
    private TextField userNameField;

    @FXML
    private TextField ticketCountField;

    @FXML
    private TextField showtimeField; // For entering the showtime

    @FXML
    private DatePicker bookingDateField; // For selecting the booking date

    @FXML
    private Label notificationLabel;

    @FXML
    public void initialize() {
        // Populate the dropdown with sample movie titles (can be replaced with database data)
        movieDropdown.getItems().addAll("Titanic", "Avatar", "The Dark Knight", "The Matrix");
    }

    @FXML
    public void handleBookNow() {
        String selectedMovie = movieDropdown.getValue();
        String userName = userNameField.getText();
        String ticketCountText = ticketCountField.getText();
        String showtime = showtimeField.getText();
        LocalDate bookingDate = bookingDateField.getValue();

        try {
            if (selectedMovie == null || selectedMovie.isEmpty()) {
                throw new IllegalArgumentException("Please select a movie.");
            }
            if (userName.isEmpty()) {
                throw new IllegalArgumentException("Please enter your name.");
            }
            if (showtime.isEmpty()) {
                throw new IllegalArgumentException("Please enter the showtime.");
            }
            if (bookingDate == null) {
                throw new IllegalArgumentException("Please select a booking date.");
            }
            int ticketCount = Integer.parseInt(ticketCountText);
            if (ticketCount <= 0) {
                throw new IllegalArgumentException("Please enter a valid number of tickets.");
            }

            // Booking logic (to be connected with the controller and database)
            notificationLabel.setStyle("-fx-text-fill: green;");
            notificationLabel.setText(
                    "Booking successful for " + ticketCount + " ticket(s) to " + selectedMovie +
                            ". Showtime: " + showtime + ", Date: " + bookingDate + "."
            );
        } catch (NumberFormatException e) {
            notificationLabel.setStyle("-fx-text-fill: red;");
            notificationLabel.setText("Invalid ticket count. Please enter a number.");
        } catch (IllegalArgumentException e) {
            notificationLabel.setStyle("-fx-text-fill: red;");
            notificationLabel.setText(e.getMessage());
        }
    }
}
