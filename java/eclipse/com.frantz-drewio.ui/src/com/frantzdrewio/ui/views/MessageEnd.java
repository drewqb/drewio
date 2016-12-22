package com.frantzdrewio.ui.views;

import com.frantz.txtuml.txtUML.ActorDecl;
import com.frantz.txtuml.txtUML.MessageDecl;

public class MessageEnd {

	private ActorDecl myActor;
	private MessageDecl myMsg;
	public MessageEnd(MessageDecl m, ActorDecl a)
	{
		myMsg=m;
		myActor=a;
	}
	public ActorDecl getMyActor() {
		return myActor;
	}
	public MessageDecl getMyMsg() {
		return myMsg;
	}
}
