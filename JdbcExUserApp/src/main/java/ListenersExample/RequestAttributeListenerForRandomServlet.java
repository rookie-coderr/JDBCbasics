package ListenersExample;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class RequestAttributeListenerForRandomServlet implements ServletRequestListener, ServletRequestAttributeListener {

    public RequestAttributeListenerForRandomServlet() {
    }

    public void requestInitialized(ServletRequestEvent sre)  { 
    	System.out.println("Request Initialized..." + sre.getSource());
    }

    public void requestDestroyed(ServletRequestEvent sre)  { 
    	System.out.println("Request Destroyed..." + sre.getSource());
    }

    public void attributeRemoved(ServletRequestAttributeEvent srae)  {
    	System.out.println("Request Attribute removed..."+ srae.getName() + " - " + srae.getValue() + ", from " + srae.getSource());
    }

    public void attributeAdded(ServletRequestAttributeEvent srae)  { 
    	System.out.println("Request Attribute added..."+ srae.getName() + " - " + srae.getValue() + ", from " + srae.getSource());
    }

    public void attributeReplaced(ServletRequestAttributeEvent srae)  {
    	System.out.println("Request Attribute Replaced..." + srae.getName() + " - " + srae.getValue() + ", from " + srae.getSource());
    }
}