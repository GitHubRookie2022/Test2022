import java.io.IOException;
 
public class Console {//[1]
    public static int read() {//[2]
        int inputKeyCode = 0;//[3]
        try {//[4]
            inputKeyCode = System.in.read();//[5]
            System.in.skip(256);//[6]
        } catch (IOException ioException) {//[7]
            System.out.println("ioException例外");//[8]
        }//[9]
        return inputKeyCode;//[10]
    }
    public static void write(String text) {//[20]
        System.out.print(text);//[21]
    }
    public static void writeWithCR(String text) {//[40]
        System.out.println(text);//[41]
    }
    public static void sleep(int seconds) {//[60]
        try {//[61]
            Thread.sleep(seconds * 1000);//[62]
        } catch (InterruptedException exception) {//[63]
            System.out.println("InterruptedException例外");//[64]
        }
    }
}