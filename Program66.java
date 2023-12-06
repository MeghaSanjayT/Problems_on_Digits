import java.lang.*;
import java.util.*;

class Digits
{
    public int MaxDigit(int iNo)
    {
        int iDigit = 0;
        int iMin= 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit < iMin)
            {
                iDigit= iMin;
            }

            iNo = iNo/10;
        }
        return iMin;
    }
}

class Program64
{
    public static void main(String ar[])
    {
        int iNo = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Please enter number :");
        iNo = sobj.nextInt();

        Digits dobj = new Digits(iNo);
        iRet = dobj.MaxDigit();
        System.out.println("Max Digit is : "+iRet);
        

    }
}
}