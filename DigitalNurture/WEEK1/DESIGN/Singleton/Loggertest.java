package DESIGN.Singleton;

public class Loggertest {
    public static void main(String[] args)
    {
        logger logger1 =logger.getinstance();
        logger1.log("Firstmsg");
        logger logger2= logger.getinstance();
        logger2.log("secondmsg");
        if(logger1==logger2)
        {
            System.out.println("Same instance");
        }
        else{
            System.out.println("Different instance");
        }
    }
}
