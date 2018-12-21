package clm.maven.selenium.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;
import java.io.IOException;
import java.net.URL;
import java.net.HttpURLConnection;

public class ClmDemoTest {

	@Test

		public void test() throws Exception {
		    String strUrl = "https://clm.rat.itshost.se/ccm";

		    try {
		        URL url = new URL(strUrl);
		        HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
		        urlConn.connect();
		        assertEquals(HttpURLConnection.HTTP_OK, urlConn.getResponseCode());
		    } catch (IOException e) {
		        System.err.println("Error creating HTTP connection");
		        e.printStackTrace();
		        throw e;
		    }
		}
	}


