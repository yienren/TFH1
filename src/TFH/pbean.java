package TFH;

import java.text.DecimalFormat;

public class pbean {
    public static final PP B = new PP("B","3°0′0″","2°0′0″");
    public static final PP C = new PP("C","1°30′0″","1°0′0″");
    public static final PP D = new PP("D","0°30′0″","0°20′0″");
    public static final PP E = new PP("E","0°15′0″","0°10′0″");
    public static final PP F = new PP("F","0°7′30″","0°5′0″");
    public static final PP G = new PP("G","0°3′45″","0°2′30″");
    public static final PP H = new PP("H","0°1′52.5″","0°1′15″");

    public void getHLH(PP pp,String x0,String y0) {
        double λx =convertToDecimalByString(x0);
        double φy =convertToDecimalByString(y0);
        double Δλx =convertToDecimalByString(pp.getΔλx());
        double Δφy =convertToDecimalByString(pp.getΔφy());
        double[] a_double = new double[]{φy,λx,Δφy,Δλx};
        int H=(int) (λx%6/Δλx)+1;
        int L= (int) (4/Δφy-(int)(φy%4/Δφy));
        //============================
        /*
        * 添加前缀
        *
        * */
        //============================
        int i=(int)'A';
        int H1= (int) (φy/4);
        int I1=(int) (λx/6)+31;
        System.out.println((char) (i + H1) + Integer.toString(I1)+pp.getFlag()+""+formatNumber(H,"000")+""+formatNumber(L,"000"));
    }

    public void getXY(tfhbean tfh) {
        int a=tfh.getA();
        int b=tfh.getB();
        int c =tfh.getC();
        int d =tfh.getD();
        double Δλx =convertToDecimalByString(tfh.getScale().getΔλx());
        double Δφy =convertToDecimalByString(tfh.getScale().getΔφy());
        double x=(b-31)*6+(d-1)*Δλx;
        double y=(a-1)*4 +(4/Δφy-c)*Δφy;
        System.out.println(x+","+y);
    }
    public static void main(String[] args) {
        pbean p =new pbean();
        p.getHLH(B,"114°33′45″","39°22′30″");
        p.getHLH(C,"114°33′45″","39°22′30″");
        p.getHLH(D,"114°33′45″","39°22′30″");
        p.getHLH(E,"114°33′45″","39°22′30″");
        p.getHLH(F,"114°33′45″","39°22′30″");
        p.getHLH(G,"114°33′45″","39°22′30″");
        p.getHLH(H,"114°33′45″","39°22′30″");
        System.out.println("==================");
        tfhbean a=new tfhbean(10,50,B,1,1);
        tfhbean b=new tfhbean(10,50,D,1,1);
        p.getXY(a);
        p.getXY(b);
        p.getHL('J');

    }
    public int getHL(char TFH){
        int i =0;
        System.out.println((int)TFH-64);
        return i;
    }
//格式化行列号
    public static String formatNumber(int num,String formatAs){
        DecimalFormat df=new DecimalFormat(formatAs);
        String str2=df.format(num);
        return str2;
    }
//度分秒转换成十进制度
    public double convertToDecimalByString(String latlng){

        double du=Double.parseDouble(latlng.substring(0, latlng.indexOf("°")));
        double fen=Double.parseDouble(latlng.substring(latlng.indexOf("°")+1, latlng.indexOf("′")));
        double miao=Double.parseDouble(latlng.substring(latlng.indexOf("′")+1, latlng.indexOf("″")));
        if(du<0)
            return -(Math.abs(du)+(fen+(miao/60))/60);
        return du+(fen+(miao/60))/60;

    }
}

