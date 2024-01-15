module com.example.codingtest {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.codingtest to javafx.fxml;
    exports com.example.codingtest;
    exports com.example.codingtest.inflearn1;
    opens com.example.codingtest.inflearn1 to javafx.fxml;
}
