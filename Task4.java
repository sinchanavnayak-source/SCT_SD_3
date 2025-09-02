import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Task4 {
    public static void main(String[] args) throws Exception {
        // Example website 
        URL url = new URL("https://example.com");

        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;

        System.out.println("Extracted Product Data:\n");

        while ((line = br.readLine()) != null) {
            // Suppose product names are inside <h2> tags
            if (line.contains("<h2")) {
                String name = line.replaceAll("<[^>]*>", "").trim();
                System.out.print("Product: " + name + " ");
            }

            // Suppose prices are inside <span class='price'> tags
            if (line.contains("price")) {
                String price = line.replaceAll("<[^>]*>", "").trim();
                System.out.println(" Price: " + price);
            }
        }

        br.close();
    }
}