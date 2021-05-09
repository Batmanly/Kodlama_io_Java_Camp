package nLayeredDemo.core;

import nLayeredDemo.jLogger.JloggerManager;

public class JLoggerManagerAdapter implements LoggerService{

	@Override
	public void logToSystem(String message) {
		JloggerManager manager = new JloggerManager();
		manager.log(message);
		
	}

}
