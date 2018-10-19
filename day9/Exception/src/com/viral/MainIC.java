package com.viral;

public class MainIC
{
    public static void main(String[] args) {
        InterestCalc calc_obj=new InterestCalc();
       try
       {
            calc_obj.calc(100.00,4.00,112);
        }catch (Exception e)
        {
          System.out.println(e.getMessage());
        }
        //catch (InvalidRateException ee) {
           // System.out.println(ee.getMessage()  );
        //}
        //catch (InvalidDurationException eee) {
           // System.out.println(eee.getMessage());
       // }
    }
}
