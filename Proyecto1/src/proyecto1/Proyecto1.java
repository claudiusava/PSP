
package proyecto1;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;

public class Proyecto1 {
    
    public static void main(String[] args) throws IOException, InterruptedException, AWTException {
    
    
        ProcessBuilder pb = new ProcessBuilder("notepad");
    Robot r = new Robot();
    
    //INICIA UN NOTEPAD
    Process process = pb.start();
    
    
    TimeUnit.SECONDS.sleep(1);
        
        //ESCRIBE EL PRIMER MENSAJE
        int[] messageToPrint1 = {KeyEvent.VK_CAPS_LOCK, KeyEvent.VK_E, KeyEvent.VK_S,KeyEvent.VK_T,KeyEvent.VK_O,KeyEvent.VK_SPACE, KeyEvent.VK_E,KeyEvent.VK_S, KeyEvent.VK_SPACE, KeyEvent.VK_U,
        KeyEvent.VK_N, KeyEvent.VK_SPACE, KeyEvent.VK_P, KeyEvent.VK_R, KeyEvent.VK_O, KeyEvent.VK_G, KeyEvent.VK_R, KeyEvent.VK_A, KeyEvent.VK_M, KeyEvent.VK_A, KeyEvent.VK_SPACE, KeyEvent.VK_Q, 
        KeyEvent.VK_U, KeyEvent.VK_E, KeyEvent.VK_SPACE, KeyEvent.VK_H, KeyEvent.VK_A, KeyEvent.VK_C, KeyEvent.VK_E, KeyEvent.VK_SPACE, KeyEvent.VK_C, KeyEvent.VK_A, KeyEvent.VK_P, KeyEvent.VK_T,
        KeyEvent.VK_U, KeyEvent.VK_R, KeyEvent.VK_A, KeyEvent.VK_S, KeyEvent.VK_SPACE, KeyEvent.VK_D, KeyEvent.VK_E, KeyEvent.VK_SPACE, KeyEvent.VK_P, KeyEvent.VK_A, KeyEvent.VK_N, KeyEvent.VK_T,
        KeyEvent.VK_A, KeyEvent.VK_L, KeyEvent.VK_L, KeyEvent.VK_A, KeyEvent.VK_SPACE, KeyEvent.VK_Y, KeyEvent.VK_SPACE, KeyEvent.VK_L, KeyEvent.VK_A, KeyEvent.VK_S, KeyEvent.VK_SPACE, KeyEvent.VK_E,
        KeyEvent.VK_N, KeyEvent.VK_V, KeyEvent.VK_I, KeyEvent.VK_A, KeyEvent.VK_SPACE, KeyEvent.VK_P, KeyEvent.VK_O, KeyEvent.VK_R, KeyEvent.VK_SPACE, KeyEvent.VK_C, KeyEvent.VK_O, KeyEvent.VK_R, 
        KeyEvent.VK_R, KeyEvent.VK_E, KeyEvent.VK_O, KeyEvent.VK_SPACE, KeyEvent.VK_E, KeyEvent.VK_L, KeyEvent.VK_E, KeyEvent.VK_C, KeyEvent.VK_T, KeyEvent.VK_R, KeyEvent.VK_O, KeyEvent.VK_N, KeyEvent.VK_I,
        KeyEvent.VK_C, KeyEvent.VK_O, KeyEvent.VK_SPACE, KeyEvent.VK_A, KeyEvent.VK_CAPS_LOCK};
        for (int i = 0;i<messageToPrint1.length ;i++ )
        {
        r.delay(100);
        r.keyPress(messageToPrint1[i]);
        r.keyRelease(messageToPrint1[i]);
        }
    

    
        //BORRA EL PRIMER MESSAJE
        int[] messageToPrint2 = {KeyEvent.VK_CONTROL};
        for (int i = 0;i<messageToPrint2.length ;i++ )
        {
        r.delay(100);
        r.keyPress(messageToPrint2[i]);
        }
        
        int[] messageToPrint3 = {KeyEvent.VK_Z};
        for (int i = 0;i<messageToPrint3.length ;i++ )
        {
        r.delay(100);
        r.keyPress(messageToPrint3[i]);
        r.keyRelease(messageToPrint3[i]);
        }
        
        int[] messageToPrint4 = {KeyEvent.VK_CONTROL};
        for (int i = 0;i<messageToPrint4.length ;i++ )
        {
        r.delay(100);
        r.keyRelease(messageToPrint4[i]);
        }
        
        
  
        //ESCRIBE claudiu.sava
        int[] messageToPrint5 = {KeyEvent.VK_C, KeyEvent.VK_L, KeyEvent.VK_A, KeyEvent.VK_U, KeyEvent.VK_D, KeyEvent.VK_I, KeyEvent.VK_U, KeyEvent.VK_PERIOD, KeyEvent.VK_S, KeyEvent.VK_A, KeyEvent.VK_V, KeyEvent.VK_A};
        for (int i = 0;i<messageToPrint5.length ;i++ )
        {
        r.delay(100);
        r.keyPress(messageToPrint5[i]);
        r.keyRelease(messageToPrint5[i]);
        }
        
        
    
        //ESCRIBE @
        int[] messageToPrint6 = {KeyEvent.VK_ALT_GRAPH};
        for (int i = 0;i<messageToPrint6.length ;i++ )
        {
        r.delay(100);
        r.keyPress(messageToPrint6[i]);
        }
        int[] messageToPrint7 = {KeyEvent.VK_2};
        for (int i = 0;i<messageToPrint7.length ;i++ )
        {
        r.delay(100);
        r.keyPress(messageToPrint7[i]);
        r.keyRelease(messageToPrint7[i]);
        }
        int[] messageToPrint8 = {KeyEvent.VK_ALT_GRAPH};
        for (int i = 0;i<messageToPrint8.length ;i++ )
        {
        r.delay(100);
        r.keyRelease(messageToPrint8[i]);
        }
        
        
      
        //ESCRIBE cesjuanpablosegundo.es
        int[] messageToPrint9 = {KeyEvent.VK_C, KeyEvent.VK_E, KeyEvent.VK_S, KeyEvent.VK_J, KeyEvent.VK_U, KeyEvent.VK_A, KeyEvent.VK_N, KeyEvent.VK_P, KeyEvent.VK_A, KeyEvent.VK_B, KeyEvent.VK_L, KeyEvent.VK_O, 
                                    KeyEvent.VK_S, KeyEvent.VK_E, KeyEvent.VK_G, KeyEvent.VK_U, KeyEvent.VK_N, KeyEvent.VK_D, KeyEvent.VK_O, KeyEvent.VK_PERIOD, KeyEvent.VK_E, KeyEvent.VK_S};
        for (int i = 0;i<messageToPrint9.length ;i++ )
        {
        r.delay(100);
        r.keyPress(messageToPrint9[i]);
        r.keyRelease(messageToPrint9[i]);
        }
    
        
        
        TimeUnit.SECONDS.sleep(1);
        
        
        
        //SELECCIONA TODO
        int[] messageToPrint10 = {KeyEvent.VK_CONTROL};
        for (int i = 0;i<messageToPrint10.length ;i++ )
        {
        r.delay(100);
        r.keyPress(messageToPrint10[i]);
        }
        
        int[] messageToPrint11 = {KeyEvent.VK_SHIFT};
        for (int i = 0;i<messageToPrint11.length ;i++ )
        {
        r.delay(100);
        r.keyPress(messageToPrint11[i]);
        }
        
        int[] messageToPrint12 = {KeyEvent.VK_LEFT};
        for (int i = 0;i<messageToPrint12.length ;i++ )
        {
        r.delay(100);
        r.keyPress(messageToPrint12[i]);
        r.keyRelease(messageToPrint12[i]);
        }
        
        int[] messageToPrint13 = {KeyEvent.VK_SHIFT};
        for (int i = 0;i<messageToPrint13.length ;i++ )
        {
        r.delay(100);
        r.keyRelease(messageToPrint13[i]);
        }
        
        int[] messageToPrint14 = {KeyEvent.VK_CONTROL};
        for (int i = 0;i<messageToPrint14.length ;i++ )
        {
        r.delay(100);
        r.keyRelease(messageToPrint14[i]);
        }
        
        
        
        //COPIA
        int[] messageToPrint15 = {KeyEvent.VK_CONTROL};
        for (int i = 0;i<messageToPrint15.length ;i++ )
        {
        r.delay(100);
        r.keyPress(messageToPrint15[i]);
        }
        
        int[] messageToPrint16 = {KeyEvent.VK_C};
        for (int i = 0;i<messageToPrint16.length ;i++ )
        {
        r.delay(100);
        r.keyPress(messageToPrint16[i]);
        r.keyRelease(messageToPrint16[i]);
        }
        
        int[] messageToPrint17 = {KeyEvent.VK_CONTROL};
        for (int i = 0;i<messageToPrint17.length ;i++ )
        {
        r.delay(100);
        r.keyRelease(messageToPrint17[i]);
        }
        
        
        
    //DESTRUYE EL NOTEPAD
    process.destroy();
       
       
    
    TimeUnit.SECONDS.sleep(2);
    
        
        
    //HACE UNA CAPTURA DE PANTALLA DESPUES DE 2 SEGUNDOS
    BufferedImage bufferedImage = (new Robot()).createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
    ImageIO.write(bufferedImage,"PNG", new File("image.PNG"));
    TimeUnit.SECONDS.sleep(3);
    
    
    //ABRE LA CAPTURA DE PANTALLA
    String cmd = "explorer C:\\Users\\Usuario DAM 2\\Documents\\NetBeansProjects\\Proyecto1\\image.PNG";
    ProcessBuilder pb2 = new ProcessBuilder("cmd", "/C", cmd);
    pb2.start();
    
    TimeUnit.SECONDS.sleep(2);
    
    
    
    //ABRE EL CORREO Y SE VA A LA PARTE DE DESTINATARIO
    int[] messageToPrint21 = {KeyEvent.VK_TAB, KeyEvent.VK_TAB, KeyEvent.VK_TAB, KeyEvent.VK_TAB, KeyEvent.VK_TAB, KeyEvent.VK_TAB, KeyEvent.VK_TAB,
                            KeyEvent.VK_TAB, KeyEvent.VK_ENTER};
    for (int i = 0;i<messageToPrint21.length ;i++ )
        {
        r.delay(200);
        r.keyPress(messageToPrint21[i]);
        r.keyRelease(messageToPrint21[i]);
        }

    int[] messageToPrint22 = {KeyEvent.VK_TAB, KeyEvent.VK_TAB, KeyEvent.VK_RIGHT, KeyEvent.VK_ENTER, KeyEvent.VK_F6, KeyEvent.VK_ENTER};
    for (int i = 0;i<messageToPrint22.length ;i++ )
        {
        r.delay(500);
        r.keyPress(messageToPrint22[i]);
        r.keyRelease(messageToPrint22[i]);
        }
    
  
    
    //PEGA EL CORREO DEL DESTINATARIO
    int[] messageToPrint23 = {KeyEvent.VK_CONTROL};
        for (int i = 0;i<messageToPrint23.length ;i++ )
        {
        r.delay(200);
        r.keyPress(messageToPrint23[i]);
        }
        
        int[] messageToPrint24 = {KeyEvent.VK_V};
        for (int i = 0;i<messageToPrint24.length ;i++ )
        {
        r.delay(200);
        r.keyPress(messageToPrint24[i]);
        r.keyRelease(messageToPrint24[i]);
        }
        
        int[] messageToPrint25 = {KeyEvent.VK_CONTROL};
        for (int i = 0;i<messageToPrint25.length ;i++ )
        {
        r.delay(200);
        r.keyRelease(messageToPrint25[i]);
        }
    

     
        //SE VA A AL BOTON DE ENVIAR Y LO ENVIA
        int[] messageToPrint26 = {KeyEvent.VK_F6, KeyEvent.VK_TAB, KeyEvent.VK_TAB, KeyEvent.VK_ENTER};
    for (int i = 0;i<messageToPrint26.length ;i++ )
        {
        r.delay(300);
        r.keyPress(messageToPrint26[i]);
        r.keyRelease(messageToPrint26[i]);
        }
    }   
}
