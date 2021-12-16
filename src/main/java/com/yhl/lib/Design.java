package com.yhl.lib;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

import java.math.BigDecimal;

/**
 * 飞天 创建
 * on 11/27/2021 11:17 AM
 */
public class Design {
    public static void main(String[] args) {
        //-0.6985233426094055,
        // 0.010634561069309711,
        // 1.6000683444872266E-7,
        // 1.6000779867741954E-10,
        // 0.0,0.0,0.0,

     /*   BigDecimal result = calc(
                -0.6985233426094055,
                0.010634561069309711,
                0.0000001600068344,
                0.0000000001600078,
                0,
               0,
                0,
                5587.5-3966.0
        );
        double finalResult = addTimeParameter(1, result.doubleValue());
//        println(result.doubleValue()+"");
        println(Double.valueOf(finalResult).floatValue()+"");*/
        new Thread(new Runnable() {
            @Override
            public void run() {
                int temp = 0;
                while (true){
                    try {
                        Thread.sleep(1000);
                        println(++temp + "");
                    }catch (Exception e){

                    }
                }
            }
        }).start();


    }


    public static double addTimeParameter(int N, double controlParameter) {
        BigDecimal bigDecimal = new BigDecimal(controlParameter);
        return bigDecimal.setScale(N, BigDecimal.ROUND_HALF_UP).doubleValue();
    }




    //大数据计算
    public static BigDecimal calc(double constRation, double firstRation, double secondRation, double thirdRation,

                                  double forthRation, double fifthRation, double sixthRation, double result) {
        BigDecimal temp, res;
        res = new BigDecimal(result);
        temp = new BigDecimal(0);
        //常数项
        temp = temp.add(calcRation(constRation, result, 0));
        //一次项
        temp = temp.add(calcRation(firstRation, result, 1));
        // 二次项
        temp = temp.add(calcRation(secondRation, result, 2));
        //三次项
        temp = temp.add(calcRation(thirdRation, result, 3));
        // 四次项
        temp = temp.add(calcRation(forthRation, result, 4));
        //五次项
        temp = temp.add(calcRation(fifthRation, result, 5));
        //六次项
        temp = temp.add(calcRation(sixthRation, result, 6));
        return temp;
    }


    //计算result的N次方
    private static BigDecimal calcRation(double constRation, double result, int n) {
        BigDecimal res;
        res = new BigDecimal(result);
        res = res.pow(n);
        res = res.multiply(new BigDecimal(constRation));
        return res;
    }

}
