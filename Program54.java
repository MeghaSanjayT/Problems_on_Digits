

import java.util.*;

class Digits
{
    
    public int iValue;

    public Digits(int i)
    {
        iValue = i;
    }

   public int CountEvenDigits(int iNo)
   {
    int iDigit = 0;
    int iEvenCnt = 0;

    if(iNo == 0)
    {
        return 1;
    }

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    while(iNo != 0)
    {
        iDigit = iNo % 10;
        if(iDigit % 2 == 0)
        {
            iEvenCnt++;
        }
        iNo = iNo / 10;
    }
    return iEvenCnt;
   }
}

class Program54
{
    public static void main(String ar[])
    {
        int iValue = 0;
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Please enter number :");
        iValue = sobj.nextInt();

        Digits dobj = new Digits(iValue);
        iRet = dobj.CountEvenDigits(iValue);
        System.out.println("Number of even digits are  : "+iRet);

    }
}