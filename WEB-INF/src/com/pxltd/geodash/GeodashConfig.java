package com.pxltd.geodash;

import java.util.ResourceBundle;

public class GeodashConfig {
	private static final String BUNDLE_NAME="resources/geodash";
	public static String GEODASH_LICENSE_KEY = "GEODASH_LICENSE_KEY";
	public static String GEODASH_API_KEY = "GEODASH_API_KEY";
	public static String GOOGLE_PRIVATE_KEY = "GOOGLE_PRIVATE_KEY";
	public static String GOOGLE_CLIENT_ID = "GOOGLE_CLIENT_ID";
	public static String GOOGLE_API_KEY = "GOOGLE_API_KEY";
	public static String GOOGLE_IOS_KEY = "GOOGLE_IOS_KEY";
	public static String GOOGLE_REGION_BIAS = "GOOGLE_REGION_BIAS";
	public static String USE_SSL = "USE_SSL";
	public static String GEO_REQUEST_INTERVAL = "GEO_REQUEST_INTERVAL";
	public static String SYS_TIMEOUT = "SYS_TIMEOUT";
	public static String PROXY_SERVER_ADDRESS = "PROXY_SERVER_ADDRESS";
	public static String PROXY_SERVER_PORT = "PROXY_SERVER_PORT";
	public static String REVERSE_PROXY_BASE = "REVERSE_PROXY_BASE";
	public static String INCLUDE_SESSION_STATE = "INCLUDE_SESSION_STATE";
	public static String CACHE_GEOCODING = "CACHE_GEOCODING";
	public static String GEOCODE_CACHE_TTL = "GEOCODE_CACHE_TTL";
	public static String GEOCODE_CACHE_MAX_ENTRIES = "GEOCODE_CACHE_MAX_ENTRIES";
	public static String GEODASH_GROUP_ID = "GEODASH_GROUP_ID";
	public static String GEODASH_ADMIN_GROUP_ID = "GEODASH_ADMIN_GROUP_ID";
	public static String WEBAPI = "WEBAPI";
	public static String SHOW_LAYER_NAV = "SHOW_LAYER_NAV";

	static {
		ResourceBundle config = ResourceBundle.getBundle(BUNDLE_NAME);
		GEODASH_LICENSE_KEY = getConfigValue(config, GEODASH_LICENSE_KEY);
		GEODASH_API_KEY = getConfigValue(config, GEODASH_API_KEY);
		GOOGLE_PRIVATE_KEY = getConfigValue(config, GOOGLE_PRIVATE_KEY);
		GOOGLE_CLIENT_ID = getConfigValue(config, GOOGLE_CLIENT_ID);
		GOOGLE_API_KEY = getConfigValue(config, GOOGLE_API_KEY);
		GOOGLE_IOS_KEY = getConfigValue(config, GOOGLE_IOS_KEY);
		GOOGLE_REGION_BIAS = getConfigValue(config, GOOGLE_REGION_BIAS);
		USE_SSL = getConfigValue(config, USE_SSL);
		GEO_REQUEST_INTERVAL = getConfigValue(config, GEO_REQUEST_INTERVAL);
		SYS_TIMEOUT = getConfigValue(config, SYS_TIMEOUT);
		PROXY_SERVER_ADDRESS = getConfigValue(config, PROXY_SERVER_ADDRESS);
		PROXY_SERVER_PORT = getConfigValue(config, PROXY_SERVER_PORT);
		REVERSE_PROXY_BASE = getConfigValue(config, REVERSE_PROXY_BASE);
		INCLUDE_SESSION_STATE = getConfigValue(config, INCLUDE_SESSION_STATE);
		USE_SSL = getConfigValue(config, USE_SSL);
		USE_SSL = getConfigValue(config, USE_SSL);
		USE_SSL = getConfigValue(config, USE_SSL);
		USE_SSL = getConfigValue(config, USE_SSL);
		USE_SSL = getConfigValue(config, USE_SSL);
		USE_SSL = getConfigValue(config, USE_SSL);
		USE_SSL = getConfigValue(config, USE_SSL);
	}

	private static String getConfigValue(ResourceBundle config, String key) {
		String value = null;
		if(config.containsKey(key)){
			value = config.getString(key);
		} 
		return value;
	}
}