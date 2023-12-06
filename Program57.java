// Template

import java.util.*;

class Digits
{
    
    public int iValue;

    public Digits(int i)
    {
        iValue = i;
    }

    public void CountOddEvenDigits()
    {
        int iDigit = 0;
        int iEvenCnt = 0;
        int iOddCnt = 0;

        if(iValue == 0)
        {
            iEvenCnt++;
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
            else
            {
                iOddCnt++;
            }
            iValue = iValue / 10;
        }

        System.out.println("No. of even count is : "+iEvenCnt);
        System.out.println("No. of odd count is : "+iOddCnt);

    }
}

class Program57
{
    public static void main(String ar[])
    {
        int iNo = 0;
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Please enter number :");
        iNo = sobj.nextInt();

        Digits dobj = new Digits(iNo);
        dobj.CountOddEvenDigits();
        

    }
}