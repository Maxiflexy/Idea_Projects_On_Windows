module com.practice.junitlearningpractice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.practice.junitlearningpractice to javafx.fxml;
    exports com.practice.junitlearningpractice;
}