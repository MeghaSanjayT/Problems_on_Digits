// Template

import java.util.*;

class Digits
{
    
    public int iValue;

    public Digits(int i)
    {
        iValue = i;
    }

    public int CountDigits()
    {
        int iDigit = 0;
        int iCnt = 0;
        while(iValue > 0)
        {
            iDigit = iValue % 10;
            iCnt++;
            iValue = iValue / 10;
        }

        return iCnt;
    }
}

class Program48
{
    public static void main(String ar[])
    {
        int iNo = 0;
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Please enter number :");
        iNo = sobj.nextInt();

        Digits dobj = new Digits(iNo);
        iRet = dobj.CountDigits();
        System.out.println("No. of Digits are : "+iRet);

    }
}