class Logger 
{
    private static Logger instance;
    private Logger() 
    {
        System.out.println("Logger initialized.");
    }
    public static Logger getInstance()
    {
        if (instance==null) 
        {
            instance=new Logger();
        }
        return instance;
    }
    public void log(String msg) 
    {
        System.out.println("Log: "+msg);
    }
}
public class Main 
{
    public static void main(String[] args) 
    {
        Logger logger1 = Logger.getInstance();
        logger1.log("First message");
        Logger logger2 = Logger.getInstance();
        logger2.log("Second message");
        if (logger1==logger2) 
        {
            System.out.println("Both loggers are same instance");
        } 
        else 
        {
            System.out.println("Different logger instances");
        }
    }
}

