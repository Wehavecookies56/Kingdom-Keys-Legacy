package wehavecookies56.kk.core.helper;

import java.util.logging.Level;
import java.util.logging.Logger;

import wehavecookies56.kk.lib.Reference;
import cpw.mods.fml.common.FMLLog;

public class LogHelper {

	private static Logger logger = Logger.getLogger(Reference.MOD_NAME);
	
	public static void init() {
		logger.setParent(FMLLog.getLogger());
	}
	
	public static void log(Level logLevel, String message) {
		logger.log(logLevel, message);
	}
}
