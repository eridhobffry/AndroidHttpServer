package server.http.android.androidhttpserver.server;

import java.io.IOException;

/**
 * Created by andrei on 7/30/15.
 */
public class MyServer extends NanoHTTPD {
    private final static int PORT = 8080;

    //vererbt von Library NanoHTTPD
    public MyServer() throws IOException {
        super(PORT);
        start();
        System.out.println( "\nRunning! Point your browers to http://localhost:8080/ \n" );
    }

    //Von Abstract Klasse NanoHTTPD
    //Return in Response class
    //Der braucht einen Parameter IHTTPSession Class
    @Override
    public Response serve(IHTTPSession session) {
        String msg = "<html><body><h1>Hello server</h1>\n";
        msg += "<p>We serve " + session.getUri() + " !</p>";
        return newFixedLengthResponse( msg + "</body></html>\n" );
    }
}
