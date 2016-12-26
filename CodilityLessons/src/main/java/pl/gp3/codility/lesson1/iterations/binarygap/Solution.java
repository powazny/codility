package pl.gp3.codility.lesson1.iterations.binarygap;

public class Solution {

    public int solution(int N) {
        int result = 0;

        String binaryRepresentation = Integer.toBinaryString(N);

        if (!binaryRepresentation.contains("01")) {
            result = 0;
        } else {
            while (binaryRepresentation.endsWith("0")) {
                binaryRepresentation = binaryRepresentation.substring(0, binaryRepresentation.lastIndexOf("0"));
            }

            String[] binSplit = binaryRepresentation.split("1");

            if (binSplit.length > 1) {
                for (String split : binSplit) {
                    if (split.length() > result && split.contains("0")) {
                        result = split.length();
                    }
                }
            }
        }

        return result;
    }
}
