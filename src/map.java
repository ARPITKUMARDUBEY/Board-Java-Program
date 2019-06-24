import java.util.Map;
import java.util.HashMap;

class IterationDemo
{
    public static void main(String[] arg)
    {
        Map<String,String> gfg = new HashMap<String,String>();

        // enter name/url pair
        gfg.put("GFG", "HELLO");
        gfg.put("Practice", "practice make ");
        gfg.put("Code", "man ");
        gfg.put("Quiz", "perfect");

        // using for-each loop for iteration over Map.entrySet()
        for (Map.Entry<String,String> entry : gfg.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
    }
}