package DESIGN.Singleton;
public class logger {
    private static logger instance;
    private logger(){
        System.out.println("Logger initialized");
    }
    public static logger getinstance(){
        if(instance == null){
            instance = new logger();
        }
        return instance;
    }
    public void log(String message)
    {
        System.out.println(message);
    }
}