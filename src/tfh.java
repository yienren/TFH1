import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 15-11-18.
 */
public class tfh {

    public  void X100(double x, double y) {
        //1:100W
        int i=(int)'A';
        int H1= (int) (y/4);
        int I1=(int) (x/6)+31;
        System.out.println((char)(i+H1)+"-"+(I1));
    }


    public  void X25old(double x, double y) {
       //1:50W (¾ÉÍ¼·ùºÅ)
        Map map=new HashMap();
        map.put(1, "A");
        map.put(11, "B");
        map.put(0, "C");
        map.put(10, "D");
        int i=(int)'A';
        int H1= (int) (y/4);
        int I1=(int) (x/6+31);
        int H2 = (int)y%4/2;
        int I2=(int)(x%6/3);
        int tmp=H2+I2*10;
        System.out.println((char)(i+H1)+"-"+(I1)+"-"+map.get(tmp));
    }
    public  void X50(double x, double y) {
        //1:50W (ÐÂÍ¼·ùºÅ)
        Map map=new HashMap();
        map.put(1, "A");
        map.put(11, "B");
        map.put(0, "C");
        map.put(10, "D");
        int i=(int)'A';
        int H1= (int) (y/4);
        int I1=(int) (x/6+31);
        int H2 = (int)y%4/2;
        int I2=(int)(x%6/3);
        int tmp=H2+I2*10;
        System.out.println((char)(i+H1)+"-"+(I1)+"-"+map.get(tmp));
    }
    public  void X25(double x, double y) {
       //1:25W
        Map map=new HashMap();
        map.put(1, "A");
        map.put(11, "B");
        map.put(0, "C");
        map.put(10, "D");
        int i=(int)'A';
        int H1= (int) (y/4);
        int I1=(int) (x/6+31);
        int H2 = (int)y%4/2;
        int I2=(int)(x%6/3);
        int tmp=H2+I2*10;
        int I3 =(int)(x%3/0.75);
        System.out.println((char)(i+H1)+"-"+(I1)+"-"+map.get(tmp));
    }

    public  void XB(double x, double y) {
        //1:50w
        int i=(int)'A';
        int I1=(int) (x/6+31);
        int H1= (int) (y/4);
//        System.out.println(H1);
        int IB=(int)Math.ceil(x%6/3);
        int HB = (int)(Math.ceil(y%4/2));
//        System.out.println(y%4+"|"+H2);
        System.out.print((char) (i + H1) + Integer.toString(I1) + "B");
        System.out.print(formatNumber(3-HB, "000"));
        System.out.println(formatNumber(IB,"000"));
        int I3 =(int)(x%3/0.75);
       // System.out.println((char)(i+H1)+Integer.toString(I1)+map.get(tmp));
    }

    public  void XC(double x, double y) {
        //1:50w
        int i=(int)'A';
        int I1=(int) (x/6+31);
        int H1= (int) (y/4);
//        System.out.println(H1);
        int IC=(int)Math.ceil(x%6/1.5);
        int HC = (int)(Math.ceil(y%4/1));
        System.out.print((char) (i + H1) + Integer.toString(I1) + "C");
        System.out.print(formatNumber(5-HC, "000"));
        System.out.println(formatNumber(IC,"000"));
        int I3 =(int)(x%3/0.75);
        // System.out.println((char)(i+H1)+Integer.toString(I1)+map.get(tmp));
    }

    public void XX(double x,double y,String flag,double ¦Õ,double ¦Ë,double ¦¤¦Õ,double ¦¤¦Ë){

        int i=(int)'A';
        int H1= (int) (y/4);
        int I1=(int) (x/6)+31;
        System.out.println((char)(i+H1)+""+(I1));

//        ConvertLatlng convert=new ConvertLatlng();
//        int C =convert.convertToDecimal(4, 0, 0)/2 -[( /4¡ã) / ]  ;
//        int d = [( ) / ] + 1 ;
    }

    public  void XD(double x, double y) {
        //1:50w
        int i=(int)'A';
        int I1=(int) (x/6+31);
        int H1= (int) (y/4);
//        System.out.println(H1);
        int IC=(int)Math.ceil(x%6/0.5);
        int HC = (int)(Math.ceil(y%4*3))+1;
        System.out.print((char) (i + H1) + Integer.toString(I1) + "D");
        System.out.print(formatNumber(12-HC, "000"));
        System.out.println(formatNumber(IC,"000"));
        int I3 =(int)(x%3/0.75);
        // System.out.println((char)(i+FH1)+Integer.toString(I1)+map.get(tmp));
    }
    public  void XE(double x, double y) {
        //1:50w
        int i=(int)'A';
        int I1=(int) (x/6+31);
        int H1= (int) (y/4);
//        System.out.println(H1);
        int IC=(int)Math.ceil(x%6*4);
        int HC = (int)(Math.ceil(y%4*6))+1;
        System.out.print((char) (i + H1) + Integer.toString(I1) + "E");
        System.out.print(formatNumber(24-HC, "000"));
        System.out.println(formatNumber(IC,"000"));
        int I3 =(int)(x%3/0.75);
        // System.out.println((char)(i+H1)+Integer.toString(I1)+map.get(tmp));
    }
    public  void XF(double x, double y) {
        //1:50w
        int i=(int)'A';
        int I1=(int) (x/6+31);
        int H1= (int) (y/4);
//        System.out.println(H1);
        int IC=(int)Math.ceil(x%6*8);
        int HC = (int)(Math.ceil(y%4*12))+1;
        System.out.print((char) (i + H1) + Integer.toString(I1) + "F");
        System.out.print(formatNumber(48-HC, "000"));
        System.out.println(formatNumber(IC,"000"));
        int I3 =(int)(x%3/0.75);
        // System.out.println((char)(i+H1)+Integer.toString(I1)+map.get(tmp));
    }
    public  void XG(double x, double y) {
        //1:50w
        int i=(int)'A';
        int I1=(int) (x/6+31);
        int H1= (int) (y/4);
//        System.out.println(H1);
        int IC=(int)Math.ceil(x%6*16);
        int HC = (int)(Math.ceil(y%4*24))+1;
        System.out.print((char) (i + H1) + Integer.toString(I1) + "F");
        System.out.print(formatNumber(96-HC, "000"));
        System.out.println(formatNumber(IC,"000"));
        int I3 =(int)(x%3/0.75);
        // System.out.println((char)(i+H1)+Integer.toString(I1)+map.get(tmp));
    }
    public static String formatNumber(int num,String formatAs){
        DecimalFormat df=new DecimalFormat(formatAs);
        String str2=df.format(num);
        return str2;
    }

    }

