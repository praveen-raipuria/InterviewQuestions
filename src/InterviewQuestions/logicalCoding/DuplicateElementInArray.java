package InterviewQuestions.logicalCoding;

public class DuplicateElementInArray {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,1,4,2};
        System.out.print("Duplicate Elements --> ");
        for(int i=0;i< arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.print(arr[j]+",");
                }
            }
        }
    }
}

