package PeerProtocol;

import java.util.regex.Pattern;

/**
 * Created by atduarte on 13-03-2014.
 */
public class GetChunk extends Thread
{
    final public static Pattern pattern = Pattern.compile("^GETCHUNK");

    public void run()
    {
        // TODO: Process Message
        System.out.println("Delete");
    }
}