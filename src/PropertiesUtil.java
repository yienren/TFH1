import java.io.FileInputStream;
import java.util.Properties;
class PropertiesUtil {
    static public String startdate = null;
    static public String totalweek = null;
    synchronized static public void loads(){
        if(startdate == null || totalweek == null)
        {
            FileInputStream is = null;
            String filepath="date.properties";
            Properties dbProps = new Properties();
            try {
                is = new FileInputStream(filepath);
                dbProps.load(is);
                startdate = dbProps.getProperty("startdate");
                totalweek = dbProps.getProperty("totalweek");
                System.out.println(startdate+"|"+totalweek);
            }
            catch (Exception e) {
                System.err.println("不能读取属性文件. " +
                        "请确保date.properties在CLASSPATH指定的路径中");
            }
        }
    }
    public static String getStartdate() {
        if(startdate==null)
            loads();
        return startdate;
    }
    public static String getTotalweek() {
        if(startdate==null)
            loads();
        return totalweek;
    }
    public static void main(String[] args) {
        PropertiesUtil s =new PropertiesUtil();
        s.loads();
    }


}
