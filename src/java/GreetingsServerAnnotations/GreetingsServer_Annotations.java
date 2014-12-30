package GreetingsServerAnnotations;

import javax.websocket.CloseReason;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/polite")
public class GreetingsServer_Annotations {

    @OnOpen
    public void onOpen(Session session) {
        System.out.println("New session: "+session.getId());
    }
    
    @OnMessage
    public String onMessage(String name) {
        return "Dear "+name;
    }
	    
    @OnClose
    public void onClose (Session session, CloseReason closeReason){
        System.out.println("Session "+session.getId()+ " ends");
        System.out.println(closeReason);
        session = null;
    }
}

