package springBootJolokia;

import javax.naming.Context;
import javax.naming.InitialContext;

public class JNDIClient {
    public static void main(String[] args) throws Exception {
        String uri = "rmi://localhost:1389/Object";
        Context ctx = new InitialContext();
        ctx.lookup(uri);
    }
}