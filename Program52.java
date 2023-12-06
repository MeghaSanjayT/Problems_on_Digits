// Summation of Digits

import java.lang.*;
import java.util.*;

class Digits
{
    public int SumDigits(int iNo)
    {
        int iDigit = 0;
        int iCnt = 0;
        int iSum = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            iSum = iSum + iDigit; 

            iNo = iNo / 10;
        }
        return iSum;
    }
}

class Program52
{
    public static void main(String shs[])
    {
        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter the number : ");
        Scanner Sobj = new Scanner(System.in);

        iValue = Sobj.nextInt();

        Digits dobj = new Digits();

        iRet = dobj.SumDigits(iValue);

        System.out.println("The Sum of digits is : " + iRet);


    }
}