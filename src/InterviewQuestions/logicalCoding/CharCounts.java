package InterviewQuestions.logicalCoding;

public class CharCounts {
    public static String Stringcount(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(count).append(input.charAt(i - 1));
                count = 1;
            }
        }
        compressed.append(count).append(input.charAt(input.length() - 1));

        return compressed.toString();
    }

    public static void main(String[] args) {
        String input = "aaabbccca";
        String output = Stringcount(input);
        System.out.println("Input String : " + input);
        System.out.println("Compressed String: " + output);
    }
}

