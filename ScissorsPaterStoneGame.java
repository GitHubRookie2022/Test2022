public class ScissorsPaterStoneGame {
    public static void main(String[] args) {//[1]
        Shape shapeOfMyHand = new Shape();//[2]
        Shape shapeOfYourHand = new Shape();//[3]
        Judge judge = new Judge(shapeOfYourHand, shapeOfMyHand);//[4]
        Random random = new Random();//[5]
 
        judge.displayIntroduction();//[6]
        while (true) {//[7]
            int inputCharacter = Console.read();//[8]
            shapeOfYourHand.convertKeyToShape(inputCharacter);//[9]
            if (shapeOfYourHand.hand() == Shape.CANNOT_CONVERT)//[10]
                return;//[11]
            judge.sayCueWord();//[12]
            shapeOfMyHand.randomizeShape(random);//[13]
            judge.judge();//[14]
            judge.sayResult();//[15]
            Console.sleep(2);//[16]
        }
    }
}