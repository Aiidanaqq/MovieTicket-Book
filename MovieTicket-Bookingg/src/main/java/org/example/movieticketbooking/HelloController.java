package org.example.movieticketbooking;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.time.LocalDate;
import java.util.List;

public class HelloController {

    private static final MovieDAO movieDAO = new MovieDAO();
    private static final BookingDAO bookingDAO = new BookingDAO();

    @FXML
    private ComboBox<String> movieDropdown;

    @FXML
    private TextField userNameField;

    @FXML
    private TextField ticketCountField;

    @FXML
    private DatePicker bookingDateField;

    @FXML
    private Label notificationLabel;

    @FXML
    public void initialize() {
        // Populate the dropdown with movie titles fetched from the database
        List<Movie> movies = movieDAO.findAll();
        for (Movie movie : movies) {
            movieDropdown.getItems().add(movie.getTitle());
        }
    }

    @FXML
    public void handleBookNow() {
        String selectedMovie = movieDropdown.getValue();
        String userName = userNameField.getText();
        String ticketCountText = ticketCountField.getText();
        LocalDate bookingDate = bookingDateField.getValue();

        try {
            // Validate inputs
            if (selectedMovie == null || selectedMovie.isEmpty()) {
                throw new IllegalArgumentException("Please select a movie.");
            }
            if (userName.isEmpty()) {
                throw new IllegalArgumentException("Please enter your name.");
            }
            if (bookingDate == null) {
                throw new IllegalArgumentException("Please select a booking date.");
            }

            int ticketCount = Integer.parseInt(ticketCountText);
            if (ticketCount <= 0) {
                throw new IllegalArgumentException("Please enter a valid number of tickets.");
            }

            // Convert LocalDate to java.sql.Date
            java.sql.Date sqlBookingDate = java.sql.Date.valueOf(bookingDate);

            // Fetch the movie from the database by title
            Movie movie = movieDAO.findAll().stream()
                    .filter(m -> m.getTitle().equals(selectedMovie))
                    .findFirst()
                    .orElseThrow(() -> new IllegalArgumentException("Movie not found in the database."));

            // Create and insert the booking
            Booking booking = new Booking(0, userName, selectedMovie, ticketCount, sqlBookingDate);
            bookingDAO.insert(booking);

            // Notify the user of a successful booking
            notificationLabel.setStyle("-fx-text-fill: green;");
            notificationLabel.setText(String.format(
                    "Booking successful for %d ticket(s) to %s. Date: %s.",
                    ticketCount, selectedMovie, bookingDate
            ));
        } catch (NumberFormatException e) {
            notificationLabel.setStyle("-fx-text-fill: red;");
            notificationLabel.setText("Invalid ticket count. Please enter a number.");
        } catch (IllegalArgumentException e) {
            notificationLabel.setStyle("-fx-text-fill: red;");
            notificationLabel.setText(e.getMessage());
        }
    }
}
