package it.emerc.world.entities;

public class MessageEntity {

	private String message;

	public MessageEntity(String message) {
		super();
		this.message = message;
	}

	public final String getMessage() {
		return message;
	}

	public final void setMessage(String message) {
		this.message = message;
	}
}
