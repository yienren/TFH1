package TFH;

import java.text.DecimalFormat;

public class pbean {
    public static final PP B = new PP("B","3��0��0��","2��0��0��");
    public static final PP C = new PP("C","1��30��0��","1��0��0��");
    public static final PP D = new PP("D","0��30��0��","0��20��0��");
    public static final PP E = new PP("E","0��15��0��","0��10��0��");
    public static final PP F = new PP("F","0��7��30��","0��5��0��");
    public static final PP G = new PP("G","0��3��45��","0��2��30��");
    public static final PP H = new PP("H","0��1��52.5��","0��1��15��");

    public void getHLH(PP pp,String x0,String y0) {
        double ��x =convertToDecimalByString(x0);
        double ��y =convertToDecimalByString(y0);
        double ����x =convertToDecimalByString(pp.get����x());
        double ����y =convertToDecimalByString(pp.get����y());
        double[] a_double = new double[]{��y,��x,����y,����x};
        int H=(int) (��x%6/����x)+1;
        int L= (int) (4/����y-(int)(��y%4/����y));
        //============================
        /*
        * ���ǰ׺
        *
        * */
        //============================
        int i=(int)'A';
        int H1= (int) (��y/4);
        int I1=(int) (��x/6)+31;
        System.out.println((char) (i + H1) + Integer.toString(I1)+pp.getFlag()+""+formatNumber(H,"000")+""+formatNumber(L,"000"));
    }

    public void getXY(tfhbean tfh) {
        int a=tfh.getA();
        int b=tfh.getB();
        int c =tfh.getC();
        int d =tfh.getD();
        double ����x =convertToDecimalByString(tfh.getScale().get����x());
        double ����y =convertToDecimalByString(tfh.getScale().get����y());
        double x=(b-31)*6+(d-1)*����x;
        double y=(a-1)*4 +(4/����y-c)*����y;
        System.out.println(x+","+y);
    }
    public static void main(String[] args) {
        pbean p =new pbean();
        p.getHLH(B,"114��33��45��","39��22��30��");
        p.getHLH(C,"114��33��45��","39��22��30��");
        p.getHLH(D,"114��33��45��","39��22��30��");
        p.getHLH(E,"114��33��45��","39��22��30��");
        p.getHLH(F,"114��33��45��","39��22��30��");
        p.getHLH(G,"114��33��45��","39��22��30��");
        p.getHLH(H,"114��33��45��","39��22��30��");
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
//��ʽ�����к�
    public static String formatNumber(int num,String formatAs){
        DecimalFormat df=new DecimalFormat(formatAs);
        String str2=df.format(num);
        return str2;
    }
//�ȷ���ת����ʮ���ƶ�
    public double convertToDecimalByString(String latlng){

        double du=Double.parseDouble(latlng.substring(0, latlng.indexOf("��")));
        double fen=Double.parseDouble(latlng.substring(latlng.indexOf("��")+1, latlng.indexOf("��")));
        double miao=Double.parseDouble(latlng.substring(latlng.indexOf("��")+1, latlng.indexOf("��")));
        if(du<0)
            return -(Math.abs(du)+(fen+(miao/60))/60);
        return du+(fen+(miao/60))/60;

    }
}

