package app.controllers;

        import javafx.event.ActionEvent;
        import javafx.event.EventHandler;
        import javafx.fxml.FXML;
        import javafx.fxml.Initializable;
        import javafx.scene.Node;
        import javafx.scene.control.Button;
        import javafx.stage.Stage;
        import java.io.*;
        import java.net.Socket;
        import java.net.URL;
        import java.net.UnknownHostException;
        import java.nio.ByteBuffer;
        import java.util.ResourceBundle;
        import java.awt.AWTException;
        import java.awt.Rectangle;
        import java.awt.Robot;
        import java.awt.Toolkit;
        import java.awt.event.KeyEvent;
        import java.awt.image.BufferedImage;
        import java.util.concurrent.TimeUnit;
        import javax.imageio.ImageIO;

public class MainWindowsController implements Initializable {

    @FXML
    private Button buttonScreenshot;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        buttonScreenshot.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                ProcessBuilder pb = new ProcessBuilder("notepad");
                Robot r = null;
                try {
                    r = new Robot();
                } catch (AWTException e) {
                    e.printStackTrace();
                }


                //INICIA UN NOTEPAD
                Process process = null;
                try {
                    process = pb.start();
                } catch (IOException e) {
                    e.printStackTrace();
                }


                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //ESCRIBE EL PRIMER MENSAJE
                int[] messageToPrint1 = {KeyEvent.VK_CAPS_LOCK, KeyEvent.VK_E, KeyEvent.VK_S, KeyEvent.VK_T, KeyEvent.VK_O, KeyEvent.VK_SPACE, KeyEvent.VK_E, KeyEvent.VK_S, KeyEvent.VK_SPACE, KeyEvent.VK_U,
                        KeyEvent.VK_N, KeyEvent.VK_SPACE, KeyEvent.VK_P, KeyEvent.VK_R, KeyEvent.VK_O, KeyEvent.VK_G, KeyEvent.VK_R, KeyEvent.VK_A, KeyEvent.VK_M, KeyEvent.VK_A, KeyEvent.VK_SPACE, KeyEvent.VK_Q,
                        KeyEvent.VK_U, KeyEvent.VK_E, KeyEvent.VK_SPACE, KeyEvent.VK_H, KeyEvent.VK_A, KeyEvent.VK_C, KeyEvent.VK_E, KeyEvent.VK_SPACE, KeyEvent.VK_C, KeyEvent.VK_A, KeyEvent.VK_P, KeyEvent.VK_T,
                        KeyEvent.VK_U, KeyEvent.VK_R, KeyEvent.VK_A, KeyEvent.VK_S, KeyEvent.VK_SPACE, KeyEvent.VK_D, KeyEvent.VK_E, KeyEvent.VK_SPACE, KeyEvent.VK_P, KeyEvent.VK_A, KeyEvent.VK_N, KeyEvent.VK_T,
                        KeyEvent.VK_A, KeyEvent.VK_L, KeyEvent.VK_L, KeyEvent.VK_A, KeyEvent.VK_SPACE, KeyEvent.VK_Y, KeyEvent.VK_SPACE, KeyEvent.VK_L, KeyEvent.VK_A, KeyEvent.VK_S, KeyEvent.VK_SPACE, KeyEvent.VK_E,
                        KeyEvent.VK_N, KeyEvent.VK_V, KeyEvent.VK_I, KeyEvent.VK_A, KeyEvent.VK_SPACE, KeyEvent.VK_D, KeyEvent.VK_E, KeyEvent.VK_SPACE, KeyEvent.VK_U, KeyEvent.VK_N, KeyEvent.VK_SPACE, KeyEvent.VK_S,
                        KeyEvent.VK_E, KeyEvent.VK_R, KeyEvent.VK_V, KeyEvent.VK_I, KeyEvent.VK_D, KeyEvent.VK_O, KeyEvent.VK_R, KeyEvent.VK_SPACE, KeyEvent.VK_A, KeyEvent.VK_SPACE, KeyEvent.VK_U, KeyEvent.VK_N,
                        KeyEvent.VK_SPACE, KeyEvent.VK_C, KeyEvent.VK_L, KeyEvent.VK_I, KeyEvent.VK_E, KeyEvent.VK_N, KeyEvent.VK_T, KeyEvent.VK_E, KeyEvent.VK_SPACE, KeyEvent.VK_M, KeyEvent.VK_E, KeyEvent.VK_D, KeyEvent.VK_I,
                        KeyEvent.VK_A, KeyEvent.VK_N, KeyEvent.VK_T, KeyEvent.VK_E, KeyEvent.VK_SPACE, KeyEvent.VK_S, KeyEvent.VK_O, KeyEvent.VK_C, KeyEvent.VK_K, KeyEvent.VK_E, KeyEvent.VK_T, KeyEvent.VK_S, KeyEvent.VK_CAPS_LOCK};
                for (int i = 0; i < messageToPrint1.length; i++) {
                    r.delay(100);
                    r.keyPress(messageToPrint1[i]);
                    r.keyRelease(messageToPrint1[i]);
                }


                //DESTRUYE EL NOTEPAD
                process.destroy();


                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                //HACE UNA CAPTURA DE PANTALLA DESPUES DE 2 SEGUNDOS
                BufferedImage bufferedImage = null;
                try {
                    bufferedImage = (new Robot()).createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
                } catch (AWTException e) {
                    e.printStackTrace();
                }
                try {
                    ImageIO.write(bufferedImage, "PNG", new File("image.PNG"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }



                //SERVIDOR ENVIA LA IMAGEN AL CLIENTE
                int port=2050;
                try
                {
                    Socket clientSocket = new Socket("localhost",port);

                    OutputStream outputStream = clientSocket.getOutputStream();

                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

                    BufferedImage image = ImageIO.read(new File("C:\\Users\\ancla\\IdeaProjects\\FinalPSP\\image.png"));
                    ImageIO.write(image, "jpg", byteArrayOutputStream);

                    byte[] size = ByteBuffer.allocate(4).putInt(byteArrayOutputStream.size()).array();
                    System.out.println(byteArrayOutputStream.size());
                    outputStream.write(byteArrayOutputStream.toByteArray());
                    Thread.sleep(2000);

                    outputStream.close();
                    clientSocket.close();
                }
                catch (UnknownHostException e){
                    System.out.println(e);
                }
                catch (IOException e) {
                    System.out.println(e);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }




    double x = 0, y =0;
    @FXML
    public void pressed(javafx.scene.input.MouseEvent event) {
        x = event.getSceneX();
        y = event.getSceneY();
    }


    @FXML
    public void dragged(javafx.scene.input.MouseEvent event) {
        Node node = (Node) event.getSource();

        Stage stage = (Stage) node.getScene().getWindow();

        stage.setX(event.getScreenX() - x);
        stage.setY(event.getScreenY() - y);
    }
}