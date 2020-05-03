import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.ConnectionPendingException;
import java.nio.file.OpenOption;
import java.util.Scanner;


        public class Main {

            public static void main (String []args) throws IOException {


                URL url = new URL("https://api.chucknorris.io/jokes/random");

                System.out.println(url);

                for (int i=0;i<10;i++) {
                    int number =i+1;

                    Scanner wypisz = new Scanner(url.openStream());

                    String calyTest="";

                    while (wypisz.hasNextLine()) {
                        String tresc = wypisz.nextLine();
                        calyTest +=tresc;
                    }

                    Gson gson = new Gson();

                    Joke joke = gson.fromJson(calyTest, Joke.class);

                    System.out.println("Żart NUMER " + number + " brzmi: " + joke.value);

                    wypisz.close();

                    }
                }

        }


