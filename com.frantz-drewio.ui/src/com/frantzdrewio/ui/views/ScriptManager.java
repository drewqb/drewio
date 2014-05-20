package com.frantzdrewio.ui.views;

import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import com.frantz.drewio.drewIO.Model;

public class ScriptManager 
{
	Text myOutput;
	Composite myCanvas;
	Model myModel;
	OutputConsole myConsole = new OutputConsole();
	
	public ScriptManager(Text theText, Composite comp, Model theModel)
	{
		myOutput=theText;
		myCanvas=comp;
		myModel=theModel;
	}
	public void runScript(String theFile) throws Exception
	{
		ScriptEngineManager m = new ScriptEngineManager();
    	
    	ScriptEngine engine = m.getEngineByName("js");
    	ScriptEngineFactory f = engine.getFactory();
    	
    	
    	try
    	{
    		// setup the script environment by passing in 
    		// the SWT Shell and Display, the current ccl model 
    		// that is loaded in the canvas and the output console.
    		engine.put("shell", myCanvas.getShell());
    		engine.put("display", myCanvas.getShell().getDisplay());
    		engine.put("output", myConsole);
    		engine.put("model",myModel);
    		
    		Object result = engine.eval(new FileReader(theFile));
    	}
    	catch (Exception e) 
    	{
    		myConsole.print(e.getMessage());
    		throw e;
		}
	}
	public class OutputConsole
	{
		public void print(String msg)
		{
			if(msg==null) return;
			myOutput.setText(myOutput.getText() + msg + "\r\n");
		}
		public void clear()
		{
			myOutput.setText("");
		}
	}
}
