module co.edu.uniquindio.poo.banco {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.poo.banco to javafx.fxml;
    exports co.edu.uniquindio.poo.banco;
}