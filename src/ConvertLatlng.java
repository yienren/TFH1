/**
 * Created by Administrator on 15-11-25.
 */
import java.math.BigDecimal;

public class ConvertLatlng {

    //��γ�ȶȷ���ת��ΪС��
    public double convertToDecimal(double du,double fen,double miao){
        if(du<0)
            return -(Math.abs(du)+(Math.abs(fen)+(Math.abs(miao)/60))/60);

        return Math.abs(du)+(Math.abs(fen)+(Math.abs(miao)/60))/60;

    }
    //���ַ�����ʽ���뾭γ�ȵ�ת��
    public double convertToDecimalByString(String latlng){

        double du=Double.parseDouble(latlng.substring(0, latlng.indexOf("��")));
        double fen=Double.parseDouble(latlng.substring(latlng.indexOf("��")+1, latlng.indexOf("��")));
        double miao=Double.parseDouble(latlng.substring(latlng.indexOf("��")+1, latlng.indexOf("��")));
        if(du<0)
            return -(Math.abs(du)+(fen+(miao/60))/60);
        return du+(fen+(miao/60))/60;

    }

    //��С��ת��Ϊ�ȷ���
    public String convertToSexagesimal(double num){

        int du=(int)Math.floor(Math.abs(num));    //��ȡ��������
        double temp=getdPoint(Math.abs(num))*60;
        int fen=(int)Math.floor(temp); //��ȡ��������
        double miao=getdPoint(temp)*60;
        if(num<0)
            return "-"+du+"��"+fen+"��"+miao+"��";

        return du+"��"+fen+"��"+miao+"��";

    }
    //��ȡС������
    public double getdPoint(double num){
        double d = num;
        int fInt = (int) d;
        BigDecimal b1 = new BigDecimal(Double.toString(d));
        BigDecimal b2 = new BigDecimal(Integer.toString(fInt));
        double dPoint = b1.subtract(b2).floatValue();
        return dPoint;
    }

    public static void main(String[] args) {

        ConvertLatlng convert=new ConvertLatlng();
        double latlng1=convert.convertToDecimal(37, 25, 19.222);
        double latlng6=convert.convertToDecimal(0, 33, 45)/convert.convertToDecimal(0, 3, 45);
        double latlng2=convert.convertToDecimalByString("-37��25��19.222��");
        double latlng5=convert.convertToDecimalByString("6��0��0��");
        String latlng3=convert.convertToSexagesimal(121.084095);
        String latlng4=convert.convertToSexagesimal(-121.084095);

        System.out.println("ת��С��(���ֲ���)"+latlng6);

        System.out.println("ת��С��(�ַ�������)"+latlng2);
        System.out.println("ת��С��(���ֲ���)"+latlng2);
        System.out.println("ת��С��(���ֲ���)"+latlng5);
        System.out.println("ת���ȷ���:"+latlng3);
        System.out.println("ת���ȷ���:"+latlng4);

    }

}

