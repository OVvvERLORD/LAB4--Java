public class parser {
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