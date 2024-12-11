module org.example.movieticketbooking {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.movieticketbooking to javafx.fxml;
    exports org.example.movieticketbooking;
}