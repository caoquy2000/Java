
import java.text.DateFormat;

public class GetTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.currentTimeMillis();
        DateFormat dateFormat = new SimpleDataFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String day = dateFormat.format(date);
        System.out.println(day);
    }
    
}
