import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;
import java.util.Arrays;
import java.util.HashSet;

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

public class hw4 {
     public static void main(String[] args){
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
               HashSet users_set = new HashSet();
               char [] norm_input_ch = norm_input.toCharArray();
               for (int i = 0; i < norm_input_ch.length; i++) {
                   if (norm_input_ch[i] == '{') {
                    while (norm_input_ch[i] != ':') {
                         i++;
                    }
                    i++;
                    while (norm_input_ch[i] != ':') {
                         i++;
                    }
                    i+=2;
                    count++;
                    user current = new user();
                    current.id = count;
                    int j = 0;
                    char [] temp_str = new char [50]; 
                    int char_cnt = 0;
                    while (norm_input_ch[i] != '"'){
                         temp_str[j] = norm_input_ch[i];
                         i++;
                         j++;
                         char_cnt+=1;
                    }
                    temp_str[j] = 0;
                    char [] name_str = new char [char_cnt+1];
                    for (int r = 0; r < char_cnt; r++) {
                        name_str[r] = temp_str[r];
                    }
                    String temp_string = new String(name_str);
                    current.name = temp_string;

                    while (norm_input_ch[i] != ':') {
                         i++;
                    }
                    i+=2;
                    j = 0;
                    char_cnt = 0;
                    Arrays.fill(temp_str, '\u0000');
                    while (norm_input_ch[i] != '"'){
                         temp_str[j] = norm_input_ch[i];
                         i++;
                         j++;
                         char_cnt+=1;
                    }
                    char [] comp_str = new char [char_cnt+1];
                    for (int r = 0; r < char_cnt; r++) {
                        comp_str[r] = temp_str[r];
                    }
                    temp_string = new String(comp_str);
                    current.company = temp_string;

                    while (norm_input_ch[i] != ':') {
                         i++;
                    }
                    i+=2;
                    j = 0;
                    char_cnt = 0;
                    Arrays.fill(temp_str, '\u0000');
                    while (norm_input_ch[i] != '"'){
                         temp_str[j] = norm_input_ch[i];
                         i++;
                         j++;
                         char_cnt+=1;
                    }
                    char [] usname_str = new char [char_cnt+1];
                    for (int r = 0; r < char_cnt; r++) {
                        usname_str[r] = temp_str[r];
                    }
                    temp_string = new String(usname_str);
                    current.username = temp_string;

                    while (norm_input_ch[i] != ':') {
                         i++;
                    }
                    i+=2;
                    j = 0;
                    char_cnt = 0;
                    Arrays.fill(temp_str, '\u0000');
                    while (norm_input_ch[i] != '"'){
                         temp_str[j] = norm_input_ch[i];
                         i++;
                         j++;
                         char_cnt+=1;
                    }
                    char [] email_str = new char [char_cnt+1];
                    for (int r = 0; r < char_cnt; r++) {
                        email_str[r] = temp_str[r];
                    }
                    temp_string = new String(email_str);
                    current.email = temp_string;

                    while (norm_input_ch[i] != ':') {
                         i++;
                    }
                    i+=2;
                    j = 0;
                    char_cnt = 0;
                    Arrays.fill(temp_str, '\u0000');
                    while (norm_input_ch[i] != '"'){
                         temp_str[j] = norm_input_ch[i];
                         i++;
                         j++;
                         char_cnt+=1;
                    }
                    char [] add_str = new char [char_cnt+1];
                    for (int r = 0; r < char_cnt; r++) {
                        add_str[r] = temp_str[r];
                    }
                    temp_string = new String(add_str);
                    current.address= temp_string;

                    while (norm_input_ch[i] != ':') {
                         i++;
                    }
                    i+=2;
                    j = 0;
                    char_cnt = 0;
                    Arrays.fill(temp_str, '\u0000');
                    while (norm_input_ch[i] != '"'){
                         temp_str[j] = norm_input_ch[i];
                         i++;
                         j++;
                         char_cnt+=1;
                    }
                    char [] zip_str = new char [char_cnt+1];
                    for (int r = 0; r < char_cnt; r++) {
                        zip_str[r] = temp_str[r];
                    }
                    temp_string = new String(zip_str);
                    current.zip = temp_string;

                    while (norm_input_ch[i] != ':') {
                         i++;
                    }
                    i+=2;
                    j = 0;
                    char_cnt = 0;
                    Arrays.fill(temp_str, '\u0000');
                    while (norm_input_ch[i] != '"'){
                         temp_str[j] = norm_input_ch[i];
                         i++;
                         j++;
                         char_cnt+=1;
                    }
                    char [] state_str = new char [char_cnt+1];
                    for (int r = 0; r < char_cnt; r++) {
                        state_str[r] = temp_str[r];
                    }
                    temp_string = new String(state_str);
                    current.state = temp_string;

                    while (norm_input_ch[i] != ':') {
                         i++;
                    }
                    i+=2;
                    j = 0;
                    char_cnt = 0;
                    Arrays.fill(temp_str, '\u0000');
                    while (norm_input_ch[i] != '"'){
                         temp_str[j] = norm_input_ch[i];
                         i++;
                         j++;
                         char_cnt+=1;
                    }
                    char [] country_str = new char [char_cnt+1];
                    for (int r = 0; r < char_cnt; r++) {
                        country_str[r] = temp_str[r];
                    }
                    temp_string = new String(country_str);
                    current.country = temp_string;

                    while (norm_input_ch[i] != ':') {
                         i++;
                    }
                    i+=2;
                    j = 0;
                    char_cnt = 0;
                    Arrays.fill(temp_str, '\u0000');
                    while (norm_input_ch[i] != '"'){
                         temp_str[j] = norm_input_ch[i];
                         i++;
                         j++;
                         char_cnt+=1;
                    }
                    char [] phone_str = new char [char_cnt+1];
                    for (int r = 0; r < char_cnt; r++) {
                        phone_str[r] = temp_str[r];
                    }
                    temp_string = new String(phone_str);
                    current.phone = temp_string;

                    while (norm_input_ch[i] != ':') {
                         i++;
                    }
                    i+=2;
                    j = 0;
                    char_cnt = 0;
                    Arrays.fill(temp_str, '\u0000');
                    while (norm_input_ch[i] != '"'){
                         temp_str[j] = norm_input_ch[i];
                         i++;
                         j++;
                         char_cnt+=1;
                    }
                    char [] photo_str = new char [char_cnt+1];
                    for (int r = 0; r < char_cnt; r++) {
                        photo_str[r] = temp_str[r];
                    }
                    temp_string = new String(photo_str);
                    current.Photo = temp_string;

                    users_set.add(current);
                   }
               }
               System.out.println(norm_input);
          } catch (IOException e) {
               System.err.println(e.getMessage());
          }
     }
}

