// Template

import java.util.*;

class Digits
{
    
    public int iValue;

    public Digits(int i)
    {
        iValue = i;
    }

    public int CountEvenDigits()
    {
        int iDigit = 0;
        int iEvenCnt = 0;

        if(iValue == 0)
        {
            return 1;
        }

        if(iValue < 0)   // updater
        {
            iValue = -iValue;
        }

        while(iValue != 0)
        {
            iDigit = iValue % 10;
            if(iDigit % 2 == 0)
            {
                iEvenCnt++;
            }
            iValue = iValue / 10;
        }

        return iEvenCnt;
    }
}

class Program55
{
    public static void main(String ar[])
    {
        int iNo = 0;
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Please enter number :");
        iNo = sobj.nextInt();

        Digits dobj = new Digits(iNo);
        iRet = dobj.CountEvenDigits();
        System.out.println("No. of Even Digits are : "+iRet);

    }
}