import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class PhoneBookTest {

    PhoneBook p;
    Map<String, String> index;
    @Before
    public void setUpTest() {
        p = new PhoneBook();
        index = new HashMap<String, String>();

    }
    @Test
    public void lookUpTest() {


      p.add("EZ", "3023234444");

      String expected = "3023234444";

      String actual = p.lookUp("EZ");

      Assert.assertEquals(expected, actual);
    }

    @Test
    public void addTest() {

        String expected = "3029999999";
        p.add("Amara", "3029999999");



        String actual = p.lookUp("Amara");

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void removeEntryTest() {
        p.add("EZ", "3024546789");
        p.removeEntry("EZ");

        String expected = null;


        Assert.assertNull(expected);
    }

    @Test
    public void listAllEntriesTest() {
        p.add("Latte", "4546779898");
        p.add("Lola", "4546787878");

        String expected = "[Latte=4546779898, Lola=4546787878]" ;

        String actual = p.toString();
        Assert.assertEquals(expected, actual);


    }

    @Test

    public void reverseLookUpTest(){

        p.add("EZ", "3024349090");

        String expected = "EZ";

        String actual = p.reverseLookUp("3024349090");

        Assert.assertEquals(expected, actual);

    }
}