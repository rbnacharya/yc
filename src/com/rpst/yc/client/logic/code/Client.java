package com.rpst.yc.client.logic.code;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.UUID;

import com.rpst.yc.commons.def.RClient;

public class Client implements RClient,Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1846351611822451760L;

	/**
	 * 
	 */
	
	@Override
	public void new_session(UUID id) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exit_session() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void send_message(String msg, int uid) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Image get_snapshot() throws RemoteException {
		Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		try {
			BufferedImage capture = new Robot().createScreenCapture(screenRect);
			return capture;
		} catch (AWTException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
