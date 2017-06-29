package com.theStol.onJava;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		
		String answer = "";
		GroupRestoraunt grRest = new GroupRestoraunt("The best restoraunt of rating");
		grRest.addRestoraunt(new Restoraunt("Rojo Ojo",1,"Mexico restoraunt"));
		grRest.addRestoraunt(new Restoraunt("Very Well Caffe",2,"Restoraunt with good kitchen"));
		grRest.addRestoraunt(new Restoraunt("Oliva",3,"Good family restoraunt"));
		grRest.addRestoraunt(new Restoraunt("Mama Monana",4,"Gergia Restoraunt"));
		grRest.addRestoraunt(new Restoraunt("Lysa Gora",5,"The art - restoraunt"));

		answer += "<html><head><title>Student</title> <meta charset='utf-8'></head><body><p>ôList restorauntsô: " +
		grRest.getNameListRestouraunt() + "</p><br>";
		answer += "<table border='2' cellpadding='5' ><tr><th>Name</th><th>Rating</th><th>Description</th></tr>";
		Restoraunt[] rest = grRest.getRestoraunts();
		for (int i = 0; i < rest.length; i++) { 
			answer += "<tr>";
			answer += "<td>" + rest[i].getName() + "</td>";
			answer += "<td>" + rest[i].getRating() + "</td>";
			answer += "<td>" + rest[i].getDescription() + "</td>";
			answer += "</tr>"; } answer += "</table></body></html>";
		
		try(ServerSocket serSocet = new ServerSocket(8080)){
			
			for(;;){
				Socket cl = serSocet.accept();
				Client client = new Client(cl, answer);
				
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
			
	}

}
