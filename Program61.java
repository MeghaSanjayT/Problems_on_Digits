import java.util.*;

class Digits
{
    
    public int iValue;

    public Digits(int i)
    {
        iValue = i;
    }

    public int Reverse(int iNo)
    {
        int iDigit = 0;
        int iRev = 0;

        if(iNo < 0)   // updater
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iRev = (iRev*10) + iDigit;
            iNo = iNo / 10;
        }
        return iRev;
    }

    public boolean ChkPallindrome()
    {
        int iReverse = 0;
        iReverse = Reverse(iValue);
        return(iReverse == iValue);
    }
}

class Program61
{
    public static void main(String ar[])
    {
        int iNo = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Please enter number :");
        iNo = sobj.nextInt();

        Digits dobj = new Digits(iNo);
        bRet = dobj.ChkPallindrome();
        if(bRet == true)
        {
            System.out.println(iNo+" is Pallindrome");
        }
        else
        {
            System.out.println(iNo+" is not Pallindrom");
        }

    }
}