import java.awt.image.BufferedImage;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.imageio.ImageIO;

public class Cliente {

    public static void main(String[] args) throws IOException {


        int port = 2050;
        try {
            ServerSocket serverSocket = new ServerSocket(port);

            Socket clientSocket = serverSocket.accept();

            InputStream inputStream = clientSocket.getInputStream();

            System.out.println(inputStream);

            byte[] imageAr = new byte[62100];
            inputStream.read(imageAr);

            BufferedImage image = ImageIO.read(new ByteArrayInputStream(imageAr));

            System.out.println("Received " + image.getHeight() + "x" + image.getWidth() + ": " + System.currentTimeMillis());
            //ImageIO.write(image, "jpg", new File("C:\\Users\\ancla\\IdeaProjects\\FinalPSP\\image2.png"));

            String url = "C:\\Users\\ancla\\IdeaProjects\\FinalPSP\\image.PNG";
            ProcessBuilder pb = new ProcessBuilder();
            pb.command("cmd.exe", "/c", url);
            pb.start();

            inputStream.close();
            clientSocket.close();
            serverSocket.close();
        } catch (UnknownHostException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}