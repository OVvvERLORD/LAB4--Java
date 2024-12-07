import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;
import java.util.Iterator;
import java.util.LinkedHashSet;

class user {
    int id;
    String name;
    String company;
    String username;
    String email;
    String address;
    String zip;
    String state;
    String country;
    String phone;
    String Photo;
    user() {
     this.id = 0;
     this.name = "";
    this.company = "";
    this.username = "";
    this.email = "";
    this.address = "";
    this.zip = "";
    this.state = "";
    this.country = "";
    this.phone = "";
    this.Photo = "";
    }
}
class union{
     String str;
     int i;
}
class parser {
     public union pars1(int i, char [] norm_input_ch) {
          while (norm_input_ch[i] != ':') {
                    i++;
               }
          i+=2;
          int j = 0;
          int char_cnt = 0;
          char [] temp_str = new char [55]; 
          while (norm_input_ch[i] != '"' && norm_input_ch[i] != 0){
               temp_str[j] = norm_input_ch[i];
               i++;
               j++;
               char_cnt+=1;
          }
          char [] add_str = new char [char_cnt+1];
          for (int r = 0; r < char_cnt; r++) {
               add_str[r] = temp_str[r];
          }
          String temp_string = new String(add_str);
          union ret = new union();
          ret.i = i;
          ret.str = temp_string;
          return ret;
     }
     public union pars2(int i, char [] norm_input_ch) {
          while (norm_input_ch[i] != ':' && norm_input_ch[i] != 0) {
                    i++;
               }
          i++;
          int j = 0;
          int char_cnt = 0;
          char [] temp_str = new char [55]; 
          while (norm_input_ch[i] != ',' && norm_input_ch[i] != '}'){
               temp_str[j] = norm_input_ch[i];
               i++;
               j++;
               char_cnt+=1;
          }
          char [] add_str = new char [char_cnt+1];
          for (int r = 0; r < char_cnt; r++) {
               add_str[r] = temp_str[r];
          }
          String temp_string = new String(add_str);
          union ret = new union();
          ret.i = i;
          ret.str = temp_string;
          return ret;
     }
}
class first_query{
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
}
class todo {
     int userId;
     int id;
     String title;
     boolean completed;
}
class second_query {
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
public class hw4 {
     public static void main(String[] args){
          System.out.print("------------------------------------------------------------------------------------------\n");
          first_query part_1 = new first_query();
          part_1.first();
          System.out.print("------------------------------------------------------------------------------------------\n");
          second_query part_2 = new second_query();
          part_2.second();
          System.out.print("------------------------------------------------------------------------------------------\n");
     }
}

