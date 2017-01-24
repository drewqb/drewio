package com.frantz.samples2.excl;

import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

class LoggerWindow1 extends JFrame {
	  private JTextArea textArea = new JTextArea();

	  public LoggerWindow1() {
	    super("");
	    setSize(300, 300);
	    add(new JScrollPane(textArea));
	    setVisible(true);
	  }

	  public void showInfo(String data) {
	    textArea.append(data);
	    this.validate();
	  }
	}

	class WindowHandler extends Handler {
	  private LoggerWindow1 window = null;

	  private Formatter formatter = null;

	  private Level level = null;

	  private static WindowHandler handler = null;

	  private WindowHandler() {
	    LogManager manager = LogManager.getLogManager();
	    String className = this.getClass().getName();
	    String level = manager.getProperty(className + ".level");
	    setLevel(level != null ? Level.parse(level) : Level.INFO);
	    if (window == null)
	      window = new LoggerWindow1();
	  }

	  public static synchronized WindowHandler getInstance() {
	    if (handler == null) {
	      handler = new WindowHandler();
	    }
	    return handler;
	  }

	  public synchronized void publish(LogRecord record) {
	    String message = null;
	    if (!isLoggable(record))
	      return;
	    message = record.getMessage();//getFormatter().format(record);
	    window.showInfo(message);
	  }

	  public void close() {
	  }

	  public void flush() {
	  }
	}

	public class LoggerWindow {
	  private WindowHandler handler = null;
	 
	  private Logger logger = null;

	  public LoggerWindow() {
	    handler = WindowHandler.getInstance();
	    logger = Logger.getLogger("logging.handler");
	    logger.addHandler(handler);
	  }

	  public void logMessage() {
	    logger.info("Hello from ...");
	  }

	  public static void main(String args[]) {
		  LoggerWindow demo = new LoggerWindow();
	    demo.logMessage();
	    WindowHandler h = WindowHandler.getInstance();
	    LogRecord r = new LogRecord(Level.WARNING, "The Handler publish method...");
	    h.publish(r);
	  }
	}