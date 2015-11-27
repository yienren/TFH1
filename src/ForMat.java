/**
 * Created by Administrator on 15-11-25.
 */
import java.text.DecimalFormat;
public class ForMat {
        public static void main(String[] args) {
            System.out.println(formatNumber("14","00000"));
            System.out.println(formatNumber(150,"00000"));
        }

        public static String formatNumber(String str,String formatAs){
            DecimalFormat df=new DecimalFormat(formatAs);
            String str2=df.format(Integer.parseInt(str));
            return str2;
        }

        public static String formatNumber(int num,String formatAs){
            DecimalFormat df=new DecimalFormat(formatAs);
            String str2=df.format(num);
            return str2;
        }
    }
