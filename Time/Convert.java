import java.text.SimpleDateFormat;
import java.util.Date;

public class Convert{
    public static void main(String[] args){
        Long timeStamp = System.currentTimeMillis();  //��ȡ��ǰʱ���
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String sd = sdf.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
        // ʱ���ת����ʱ��
        System.out.println("Formatting result:" + sd);

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy �� MM �� dd �� HH ʱ mm �� ss ��");
        String sd2 = sdf2.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
        System.out.println("Formatting result:" + sd2);
   }
}
