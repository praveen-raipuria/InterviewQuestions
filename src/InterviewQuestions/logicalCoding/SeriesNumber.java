package InterviewQuestions.logicalCoding;

public class SeriesNumber
{
    public static void main(String[] args) {

        int a=-1;
        int b=1;
        int c;
        System.out.print("Series Number is :: ");
        for (int i = 0; i <=15 ; i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+",");
        }
    }
}

