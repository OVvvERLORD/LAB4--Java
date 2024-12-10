import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;
import java.util.Iterator;
import java.util.LinkedHashSet;
public class ApiCall{
     public void first(){
          try {
               URL url = new URL("https://fake-json-api.mock.beeceptor.com/users".toString());
               URLConnection conn = url.openConnection();
               conn.connect();
               InputStream inp_str = conn.getInputStream();
               InputStreamReader reader = new InputStreamReader(inp_str);
               BufferedReader input = new BufferedReader(reader);
               String temp;
               String norm_input = "";
               while ((temp = input.readLine()) != null) {
                    norm_input += temp;
               }
               norm_input = norm_input.replace('[', ' ').replace(']', ' ').replaceAll("id", "").replaceAll("name", "").replaceAll("company","").replaceAll("user", "").replaceAll("email", "").replaceAll("address", "").replaceAll("zip", "").replaceAll("state", "").replaceAll("country", "").replaceAll("phone", "").replaceAll("photo", "").replaceAll(" Attribute Error: person.astName is not supported","").replaceAll(": ",":").replaceAll("O&#x27;", "");
               int count = 0;
               LinkedHashSet users_set = new LinkedHashSet<user>();
               
               char [] norm_input_ch = norm_input.toCharArray();
               for (int i = 0; i < norm_input_ch.length; i++) {
                   if (norm_input_ch[i] == '{') {
                    while (norm_input_ch[i] != ':') {
                         i++;
                    }
                    i++;
                    i+=2;
                    count++;
                    user current = new user();
                    current.id = count;
                    parser parser = new parser();
                    current.name = parser.pars1(i, norm_input_ch).str;
                    i = parser.pars1(i, norm_input_ch).i;
                    current.company = parser.pars1(i, norm_input_ch).str;
                    i = parser.pars1(i, norm_input_ch).i;
                    current.username = parser.pars1(i, norm_input_ch).str;
                    i = parser.pars1(i, norm_input_ch).i;
                    current.email = parser.pars1(i, norm_input_ch).str;
                    i = parser.pars1(i, norm_input_ch).i;
                    current.address = parser.pars1(i, norm_input_ch).str;
                    i = parser.pars1(i, norm_input_ch).i;
                    current.zip = parser.pars1(i, norm_input_ch).str;
                    i = parser.pars1(i, norm_input_ch).i;
                    current.state = parser.pars1(i, norm_input_ch).str;
                    i = parser.pars1(i, norm_input_ch).i;
                    current.country = parser.pars1(i, norm_input_ch).str;
                    i = parser.pars1(i, norm_input_ch).i;
                    current.phone = parser.pars1(i, norm_input_ch).str;
                    i = parser.pars1(i, norm_input_ch).i;
                    current.Photo = parser.pars1(i, norm_input_ch).str;
                    users_set.add(current);
                   }
               }
               try{
                    Iterator<user> it = users_set.iterator();
                    while (it.hasNext()) {
                         user curr = it.next();
                         System.out.println(curr.id+" ; "+curr.name+" ; "+curr.company+" ; "+curr.username+" ; "+curr.email+" ; "+curr.address+" ; "+curr.zip+" ; "+curr.state+" ; "+curr.country+" ; "+curr.phone+" ; "+curr.Photo+" ; ");
                         System.out.print("\n");
                    }
               } catch (Exception e) {
                    System.err.println(e.getMessage());
               }
          } catch (IOException e) {
               System.err.println(e.getMessage());
          }
     }
     public void second(){
          try {
               URL url = new URL("https://dummy-json.mock.beeceptor.com/todos".toString());
               URLConnection conn = url.openConnection();
               conn.connect();
               InputStream inp_str = conn.getInputStream();
               InputStreamReader reader = new InputStreamReader(inp_str);
               BufferedReader input = new BufferedReader(reader);
               String temp;
               String norm_input = "";
               while ((temp = input.readLine()) != null) {
                    norm_input += temp;
               }
               norm_input = norm_input.replace('[', ' ').replace(']', ' ').replaceAll("id", "").replaceAll("userId", "").replaceAll("title","").replaceAll("completed", "").replaceAll(": ", ":");
               LinkedHashSet todos_set = new LinkedHashSet<todo>();
               
               char [] norm_input_ch = norm_input.toCharArray();
               for (int i = 0; i < norm_input_ch.length; i++) {
                   if (norm_input_ch[i] == '{') {
                    todo current = new todo();
                    parser parser = new parser();
                    char [] test = parser.pars2(i, norm_input_ch).str.toCharArray();
                    i = parser.pars2(i, norm_input_ch).i;
                    if (test[0] == '1' && test[1] == '0') {
                         current.userId = 10;
                    } else {
                         current.userId = Integer.valueOf(test[0]) - 48;
                    }
                    test = parser.pars2(i, norm_input_ch).str.toCharArray();
                    i = parser.pars2(i, norm_input_ch).i;
                    if (test[1]!=0) {
                         char [] num = new char [2];
                         num[0] = test[0];
                         num[1] = test[1];
                         String fin_num = new String(num);
                         current.id = Integer.parseInt(fin_num);
                    } else {
                         current.id = Integer.valueOf(test[0]) - 48;
                    }
                    test = parser.pars2(i, norm_input_ch).str.toCharArray();
                    i = parser.pars2(i, norm_input_ch).i;
                    String finals = new String(test);
                    current.title = finals;
                    test = parser.pars2(i, norm_input_ch).str.toCharArray();
                    if (test[0] == 'f') {
                         current.completed = false;
                    } else {
                         current.completed = true;
                    }
                    todos_set.add(current);
                   }
               }
               Iterator<todo> it = todos_set.iterator();
               while (it.hasNext()) {
                    todo curr = it.next();
                    System.out.println(curr.userId+" ; "+curr.id+" ; "+curr.title+" ; "+curr.completed);
                    System.out.print("\n");
               }
          } catch (Exception e) {
               System.err.println(e.getMessage());
          }
     }
}