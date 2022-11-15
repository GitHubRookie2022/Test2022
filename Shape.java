import java.util.Random;
 
public class Shape {//[1]
    public static final int GU = 1;//[2]
    public static final int CYOKI = 2;//[3]
    public static final int PA = 3;//[4]
    public static final int CANNOT_CONVERT = -1;//[5]
    private final int KEY_G = 103;//[6]
    private final int KEY_C = 99;//[8]
    private final int KEY_P = 112;//[9]
    private int hand;//[10]
 
    public void randomizeShape(Random random) {//[20]
        this.hand =  random.nextInt(3) + 1;//[21]
    }
    public void convertKeyToShape(int inputKeyCode) {//[40]
        int keyCode = toLowerKey(inputKeyCode);//[41]
        switch (keyCode) {//[42]
            case KEY_G://[43]
                this.hand = GU;//[44]
                return;//[45]
            case KEY_C://[46]
                this.hand = CYOKI;//[47]
                return;//[48]
            case KEY_P://[49]
                this.hand = PA;//[50]
                return;//[51]
            default://[52]
                this.hand = CANNOT_CONVERT;//[53]
                return;//[54]
        }
    }
    private int toLowerKey(int keyCode) {//[60]
        if (keyCode < KEY_C) {//[61]
            return keyCode + 32;//[62]
        }
        return keyCode;//[63]
    }
    public String toString() {//80]
        switch (hand) {//[81]
            case GU://[82]
                return "ぐう";//[83]
            case CYOKI://[84]
                return "ちょき";//[85]
            case PA://86]
                return "ぱあ";//87]
            default://[88]
                return "？";//89]
        }
    }
    public int hand() {//[100]
        return hand;//[101]
    }
}