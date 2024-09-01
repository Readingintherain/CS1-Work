import java.io.IOException;

public class GuessTheAnimal {
  public static void main(String[] args) {
    System.out.println("Do you live in the forest (y for yes, n for no).\n");
    // String str = read();
    // if (str.charAt(0) == 'y')
    // {
    //    //question one 
    // }
  }  


///////////////
public static String read()
{
    byte [] buffer = new byte[10];
    try
    {
        System.in.read(buffer);
    }
    catch(IOException e)
    {
        System.out.print("Error:" + e);
        System.exit(1);
    }

    String str = new String(buffer);
    return (str);
}
public static void write (String str)
{
    System.out.print(str);
}  
}
