import java.lang.*;
import java.util.*;

class Digits
{
    public int CountDigit(int iNo)
    {
        int iDigit = 0;
        int iCnt = 0;

        while(iNo !=0 )
        {
            iDigit = iNo %10;
            iCnt++;
            iNo = iNo/10;
        }
        return iCnt;
    }
}
class Program47
{
    public static void main(String sro[])
    {
        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter the number : ");
        Scanner sobj = new Scanner(System.in);

        iValue = sobj.nextInt();
         
        Digits dobj = new Digits();
        iRet =dobj.CountDigit(iValue);

        System.out.println("the number of digits in intered number is : " + iRet);

    }
}