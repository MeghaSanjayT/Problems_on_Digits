import java.lang.*;
import java.util.*;

class Digits
{
    public int CountDigit(int iNo)
    {
        int iCnt = 0;
        int iDigit = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while( iNo != 0)
        {
            iDigit = iNo % 10;
            iCnt++;
            iNo = iNo / 10;
        }
        return iCnt;
    }
}

class Program49
{
    public static void main(String hgfdsjdf[])
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