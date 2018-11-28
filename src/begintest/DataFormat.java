
// Copyright (c) 2000 CICC
package begintest;

import java.util.Arrays;

import java.text.DecimalFormat;



/**
 * ����ת����
 */
public class DataFormat {

    /**
     * ������
     */
    public DataFormat() {
    }

    /**
     * ��������
     */
    public static double round(double d) {
        return round(d, 2);
    }
    
    /**
     * ��������
     */
    public static double round(double d, int i) {

        long l = 1;
        while (i > 0) {
            l *= 10;
            i--;
        }

        if (d > 0)
            return (double) (long) ((d * l * 10 + 5 + 0.00001) / 10) / l;
        else
            return (double) (long) ((d * l * 10 - 5 - 0.00001) / 10) / l;
    }

    public static double formatScale(double d, int scale) {
        return round(d, scale);
    }

//    public static double formatScale(double d) {
//        //ȡȱʡ�ľ���
//        int scale = CommData.DOUBLE_SCALE;
//        return formatScale(d, scale);
//    }

    public static double formatScale(double d, String exchId) {
        //A�ɡ���B��ȷ��С�����2λ, ��B����B��ȷ��С�����3λ
        int scale = 2;
        if (exchId.equals("2") || exchId.equals("7"))
            scale = 3;
        return formatScale(d, scale);
    }

    public static long divide(long l, double d) {
        String s = String.valueOf(d);
        int index = s.indexOf(".");
        int len = index > 0 ? s.substring(index + 1).length() : 0;
        long lp = 1;
        for (int i = 0; i < len; i++)
            lp = lp * 10;

        return (long) ((l * lp) / (d * lp));
    } //end divide(long l, double d)

    /**
     * ���ݼ۸�λ�Լ۸���������
     */
    public static double formatPrice(double price, double orderPriceUnit) {
        double d = orderPriceUnit;
        int scale = 0;
        while (d < 1 && d > 0) {
            d = d * 10;
            scale++;
        }
        return (formatScale(price, scale));
    }
    
    /**
     * ��ȡ��
     * ��һ������double����ȡ��ĳλ��ȡ�������iλ��������ô��С��λ��ȡ����
     * ���iλ��������ô��������λ��ĳ��λ����ȡ����
     */
    public static double formatCeil(double d, int i) {
        long l = 1;
        if (i > 0) {

            while (i > 0) {
                l *= 10;
                i--;
            }

            return (double) Math.ceil(d * l) / l;
        } else if (i < 0) {
            while (i < 0) {
                l *= 10;
                i++;
            }

            return (double) Math.ceil(d / l) * l;
        } else {
            return Math.ceil(d);
        }

    }

    /**
    * ��ȡ��
    * ��һ������double����ȡ��ĳλ��ȡ�������iλ��������ô��С��λ��ȡ����
    * ���iλ��������ô��������λ��ĳ��λ����ȡ����
    */
    public static double formatfloor(double d, int i) {
        long l = 1;
        if (i > 0) {

            while (i > 0) {
                l *= 10;
                i--;
            }

            return (double) Math.floor(d * l) / l;
        } else if (i < 0) {
            while (i < 0) {
                l *= 10;
                i++;
            }

            return (double) Math.floor(d / l) * l;
        } else {
            return Math.ceil(d);
        }

    }
    
    /**
     * 
     * @param d
     * @param i
     * @param format ���㷽�� 1-�������뷽��,0-ֱ����ȥ����
     * @return
     */
    public static double formatScale(double d, int i, int format) {
        if (format == 1) {
            return formatScale(d, i);
        } else if (format == 0) {
            return formatfloor(d, i);
        } else
            return d;
    }
    
    /**
     * С�������
     * @param d
     * @param scale
     * @return
     */
    public static String format(double d, int scale) {
		String zero = "000000000000000000000000000000000000000";
		String formatStr = "####0." + zero.substring(0, scale);
		DecimalFormat df = new DecimalFormat(formatStr);
		String value = df.format(d);
		return value;
	}
    
} //class DataFormat
