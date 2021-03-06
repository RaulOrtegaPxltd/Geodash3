package com.pxltd.geodash;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

import com.microstrategy.utils.log.Level;

public class LicenseCheck implements Runnable {
	private final String BASE_URL = GeoshapingServiceConfig.BASE_SERVER + GeoshapingServiceConfig.LICENSE_CHECK_BASE_URL;

	private String userOjbectId = "";

	public LicenseCheck(String userObjectId) {
		this.userOjbectId = userObjectId;
	}

	public void run() {
		try {
			URL url = new URL(BASE_URL);
			String data = String.format("license_key=%s&api_key=%s&google_client_id=%s&webapi=%s&mstr_user_id=%s", GeodashConfig.GEODASH_LICENSE_KEY, GeodashConfig.GEODASH_API_KEY, GeodashConfig.GOOGLE_CLIENT_ID, GeodashConfig.WEBAPI, userOjbectId);
			URLConnection connection = GeodashConfig.getOpenConnection(url);
			connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			connection.setDoOutput(true);
			OutputStream output = connection.getOutputStream();
			output.write(data.getBytes());
			output.close();

			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			StringBuffer buffer = new StringBuffer();
			for (String line; (line = reader.readLine()) != null;) {
				buffer.append(line);
			}
			Log.logger.logp(Level.FINE, this.getClass().getName(), "run", "Response from license check service: " + buffer.toString());
		} catch (Exception e) {
			Log.logger.throwing(this.getClass().getName(), "run", e);
		}
	}
}
