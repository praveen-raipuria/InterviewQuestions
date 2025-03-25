package InterviewQuestions.logicalCoding;

public class DuplicateElementStringArray {
    {
        {
        String fruites[]={"Apple","Cherry","Banana","Mango","Apple","Orange","Grape","Cherry","Mango"};
        System.out.print("Duplicate Elements --> ");
        for(int i=0;i<fruites.length;i++)
        {
            for(int j=i+1;j<fruites.length;j++)
            {
                if (fruites[i].equals(fruites[j]))
                {
                    System.out.print(fruites[j]+",");
                }
            }
        }
        System.out.println();
    }
    }
}
