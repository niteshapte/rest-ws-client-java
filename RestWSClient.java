import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class RestWSClient {

	public void callRestWS() {

		String response = null;
		try {

			URL url = new URL("http://www.someurl.com"); // put url
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("GET"); // HTTP Methods

			conn.setRequestProperty("key", "value");
			conn.setRequestProperty("Content-Type", "text/xml"); // set if server is expecting content type

			OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream());

			out.write("<msg>Rest Client</msg>");  // set inputs like JSON string or XML string that you need to send as request

			out.close();

			conn.disconnect();
			conn.setDoInput(true);

			InputStream is = conn.getInputStream();
			Scanner isScanner = new Scanner(is);

			StringBuffer buf = new StringBuffer();
			while(isScanner.hasNextLine()) { 
				buf.append(isScanner.nextLine() +"\n");
			}
			response = buf.toString();
			System.out.println(response);

		} catch (IOException e) { 
			e.printStackTrace();
		}		
	}

	public static void main(String[] args) {
		new RestWSClient().callRestWS();
	}
}
