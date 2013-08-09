package wehavecookies56.kk.core.handlers;

import wehavecookies56.kk.core.helper.LocalizationHelper;
import wehavecookies56.kk.lib.Localizations;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class LocalizationHandler {
	public static void loadLanguages(){
		for(String LocationFile: Localizations.localeFiles){
			LanguageRegistry.instance().loadLocalization(LocationFile, LocalizationHelper.getLocaleFromFileName(LocationFile), LocalizationHelper.isXMLLanguageFile(LocationFile));
		}
	}
}
