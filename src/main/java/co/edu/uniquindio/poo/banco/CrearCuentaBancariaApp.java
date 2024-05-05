package co.edu.uniquindio.poo.banco;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * La clase CreatCuentaBancariaApp representa una aplicacion de creacion de cuentas bancarias con una interfaz grafica utilizando javaFX
 */
public class CrearCuentaBancariaApp extends Application {

    /**
     * El metodo Start es llamado cuando se inicia la aplicacion y se utiliza para configurar la interfaz grafica
     * Metodo Star que se ejecuta al iniciar la aplicacion
     *      * - se crea una ventana (Stage) principal donde se mostrara la interfaz grafica
     *      * Dentro de esta ventana:
     *      * - se crean etiquetas (Label) para mostrar textos descriptivos
     *      * - se crea campos de texto (TextField) para que el usuario pueda ingresar informacion
     *      * - se crea un boton (Button) para permitir al usuario crear una cuenta bancaria.
     * @param primaryStage //El escenario principal de la aplicacion
     */
    @Override
    public void start(Stage primaryStage) {
        Label lblNombreTitular = new Label("Nombre Titular:");
        TextField txtNombreTitular = new TextField();
        Label lblApellidoTitular = new Label("Apellido Titular:");
        TextField txtApellidoTitular = new TextField();
        Label lblNumeroCuenta = new Label("Número de Cuenta:");
        TextField txtNumeroCuenta = new TextField();
        Label lblSaldo = new Label("Saldo:");
        TextField txtSaldo = new TextField();
        Button btnCrearCuenta = new Button("Crear Cuenta");

        /**
         * Se crea un area organizada en forma de cuadricula llamada root.
         * - se le añade un espacio de 10 pixeles alrededor para que los elemntos no queden pegados a los bordes
         * - hay un espacio de 5 pixeñes entre las columnas y otro de 5 pixeles entre las filas
         *
         * Dentro de esta cuadricula, se colocan diferentes elementos para que el usuario pueda ingresar informacion:
         * nombre, apellido, numero de cuenta y saldo
         * - boton para crear la cuenta bancaria
         */
        GridPane root = new GridPane();
        root.setPadding(new Insets(10));
        root.setHgap(5);
        root.setVgap(5);
        root.add(lblNombreTitular, 0, 0);
        root.add(txtNombreTitular, 1, 0);
        root.add(lblApellidoTitular, 0, 1);
        root.add(txtApellidoTitular, 1, 1);
        root.add(lblNumeroCuenta, 0, 2);
        root.add(txtNumeroCuenta, 1, 2);
        root.add(lblSaldo, 0, 3);
        root.add(txtSaldo, 1, 3);
        root.add(btnCrearCuenta, 1, 4);

        /**
         * Configura el evento de accion del boton para crear una cuenta bancaria
         * cuando se hace clic en el boton, se ejecuta el codigo.
         * 1. se obtiene el texto ingresado en el campo y lo aguarda en la variable correspondiente
         */
        btnCrearCuenta.setOnAction(event -> {
            String nombreTitular = txtNombreTitular.getText();
            String apellidoTitular = txtApellidoTitular.getText();
            String numeroCuenta = txtNumeroCuenta.getText();
            double saldo = Double.parseDouble(txtSaldo.getText());

            //Imprime en la consola la informacion de la cuenta bancaria creada
            System.out.println("Cuenta creada: ");
            System.out.println("Nombre Titular: " + nombreTitular);
            System.out.println("Apellido Titular: " + apellidoTitular);
            System.out.println("Número de Cuenta: " + numeroCuenta);
            System.out.println("Saldo: " + saldo);
        });

        /**
         * se crea una ventana para mostrar la interfaz grafica de usuario.
         * - la venta se crea con un tamaño predeterminado de 300 pixeles de ancho y 200 pixeles de alto
         * - en esta ventana se mostraran los elementos visuales como etiquetas, campos de texto y botones.
         *
         * se establece el titulo de la ventana "Crear cuenta bancaria" para identificar su proposito
         *
         * se configura una escena (Scene) que contendra todos los elementos visuales de la interfaz grafica
         * - la escena se crea con un ancho de 300 pixeles y una altura de 200 pixeles
         * - la escena define el contenido visual que se mostrara dentro de la ventana
         *
         * finalmente, se muestra la venta al usuario para que pueda interactuar con ella.
         * . la ventaba aparecera en la pantalla del dispositivo con todas las configuraciones y elemntos visuales definidos
         */
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("Crear Cuenta Bancaria");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Metodo principal que inicia la aplicacion, este metodo es el punto de entrada a la aplicacion javaFX
     *
     * se llama al metodo Launch() para iniciar la aplicacion javaFX
     * - el metodo launch() carga la clase principal de la aplicacion y comienza el ciclo de vida de la interfaz grafica
     * - el argumento 'args' puede contener argumentos de linea comandos que se pueden utlizar al iniciar la aplicacion
     * @param args
     */
    public static void main(String[] args) {
        launch(args);
    }
}
