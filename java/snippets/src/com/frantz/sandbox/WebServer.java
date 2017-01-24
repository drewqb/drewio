package com.frantz.sandbox;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class WebServer {

	private int m_Port = 8000;
	HttpServer server;

	public WebServer(int port) {
		m_Port = port;
		start();
	}

	public void start() {
		/*
		try {
			server = HttpServer.create(new InetSocketAddress(m_Port), 0);
			server.createContext("/info", new InfoHandler());
			//server.createContext("/get", new GetHandler());
			server.setExecutor(null); // creates a default executor
			server.start();
		} catch (Exception e) {
			// TODO: handle exception
		}
*/
	}

	public void stop() {

	}
/*
	static class InfoHandler implements HttpHandler {
		public void handle(HttpExchange t) throws IOException {
			 String response = "Vizibolic test page";
		      t.sendResponseHeaders(200, response.length());
		      HttpContext context = t.getHttpContext();
		      if (String.IsNullOrEmpty(context.Request["something"])) {
		          throw new HttpException(400, "You need to send a value!");
		      }

		      //Maybe you require a certain value?
		      if (context.Request["something"] != "beerIsGood") {
		          throw new HttpException(400, "You need to send the right value!");
		      }
		      
		      
		      OutputStream os = t.getResponseBody();
		      os.write(response.getBytes());
		      os.close();
		}
	}
*/
	static class GetHandler implements HttpHandler {
		public void handle(HttpExchange t) throws IOException {

			// add the required response header for a PDF file
			Headers h = t.getResponseHeaders();
			h.add("Content-Type", "application/pdf");

			// a PDF (you provide your own!)
			File file = new File("c:/temp/doc.pdf");
			byte[] bytearray = new byte[(int) file.length()];
			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis);
			bis.read(bytearray, 0, bytearray.length);

			// ok, we are ready to send the response.
			t.sendResponseHeaders(200, file.length());
			OutputStream os = t.getResponseBody();
			os.write(bytearray, 0, bytearray.length);
			os.close();
		}
	}

	public static void main(String[] args) {
		WebServer w = new WebServer(8888);
		

	}

}
