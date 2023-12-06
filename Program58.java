import java.lang.*;
import java.util.*;

class Digits
{
    public int Reverse(int iNo)
    {
    int iDigit = 0;
    int iRev = 0;

        if(iValue < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0 )
        {
            iDigit = iNo % 10;
            iRev = (iRev*10)+ iDigit;
            iNo = iNo/10;
        }
    }
}

class Program58
{
    int iValue = 0;
    int iRet = 0;

    System.out.println("Eneter the number : ");
    Scanner Sobj = new Scanner(System.in);

    iValue =sobj.nextInt();

    Digits dobj = new Digits();
    iRet = dobj.Reverse(iValue);

      System.out.println("Reverse of "+iNo+" is : "+iRet);
}
