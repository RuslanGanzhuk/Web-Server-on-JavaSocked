package com.theStol.onJava;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Client implements Runnable{
	
	private Socket socet;
	private String answer;
	private Thread tr;
	public Client(Socket socet, String answer) {
		super();
		this.socet = socet;
		this.answer = answer;
		
		tr = new Thread(this);
		tr.start();
	}
	
	@Override
	public void run() {
		try(InputStream is = socet.getInputStream();OutputStream os = socet.getOutputStream();
			PrintWriter printWriter = new PrintWriter(os)){
		
			byte [] recv = new byte[is.available()];
			
			is.read(recv);
			
			String response = "HTTP/1.1 200 OK\r\n" + "Server: My_Server\r\n" 
			                   + "Content-Type: text/html\r\n" + "Content-Length:" 
			                   + "\r\n" + "Connection: close\r\n\r\n";
			printWriter.println(response + answer);
			printWriter.flush();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
