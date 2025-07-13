package Exercise15_07;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * 15.7 (Change color using a mouse) – Displays a circle that becomes black
 * while the mouse button is pressed and returns to white when released.
 */
public class Exercise15_07 extends Application {

    private static final double RADIUS = 80;

    @Override
    public void start(Stage stage) {

        // white-filled circle with a black outline
        Circle circle = new Circle(RADIUS, Color.WHITE);
        circle.setStroke(Color.BLACK);

        /*  press  → fill black  */
        circle.setOnMousePressed(e -> circle.setFill(Color.BLACK));

        /*  release → fill white */
        circle.setOnMouseReleased(e -> circle.setFill(Color.WHITE));

        StackPane root = new StackPane(circle);
        Scene scene   = new Scene(root, 250, 250);

        stage.setTitle(getClass().getSimpleName());
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
