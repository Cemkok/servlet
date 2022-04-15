package listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

@WebListener
public class ServletRequestListenerImpl implements ServletRequestListener {

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		
		
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("ServletRequestListenerImpl ### requestInitialized" );
		//
		
		HttpServletRequest request=(HttpServletRequest) sre.getServletRequest();
		
		String path = request.getServletPath();
		 String ip=request.getRemoteAddr();
		 
		 System.out.print(path);
		 System.out.println(ip);
		 
		 
		 
		
	}

}
