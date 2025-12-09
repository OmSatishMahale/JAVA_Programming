//input : 721
//output : 7+2+1 = 10


import java.util.*;

class Digit
{
    public int SumDigits(int iNo)
    {
        int iDigit = 0,iSum=0;
        while(iNo != 0)
        {
            iDigit = iNo %10;
            iSum = iSum + iDigit;
            iNo = iNo /10;
        }
        return iSum;
    }
}

public class program90
{
        public static void main(String A[])
        {
            int iValue= 0,iRet=0;

            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter the number : ");
            iValue = sobj.nextInt();

            Digit dobj = new Digit();
            iRet = dobj.SumDigits(iValue);

            System.out.println("Addition is : "+iRet);


            //Important
            
            sobj = null;
            dobj = null;

            System.gc();
        }
}