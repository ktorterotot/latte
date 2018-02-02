import java.util.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PhoneBook {

    private Map<String, String> index = new HashMap<String, String>();

    public PhoneBook(){

    }

        public String lookUp(String name){
             return index.get(name);
        }
        
        public void add(String name, String number){
               index.put(name,number);
        }
        
        public void removeEntry(String name){
                  index.remove(name);
        }
        
        public Set<Map.Entry<String, String>> listAllEntries(){
                  return this.index.entrySet();
        }
           @Override
        public String toString(){
                return listAllEntries().toString();
        }

        public String reverseLookUp(String number) {

                for (Map.Entry<String, String> phoneBook : index.entrySet()) {

                    String key = phoneBook.getKey();
                    String value = phoneBook.getValue();

                    if (number.equals(value)) {
                        return key;
                    }

                }
                   return null;
            }



//        public HashMap<String,String>(){
//
//        }

         public static void main(String[] args) {

                  PhoneBook p = new PhoneBook();
                  p.add("Lola", "3029899999");
             System.out.println(p.reverseLookUp("3029899999"));

             PhoneBook p1 = new PhoneBook();
             p.add("Marie", "3024546666");
             p.add("Lexie", "4567890000");
             System.out.println(p.listAllEntries());

            






    }
}
