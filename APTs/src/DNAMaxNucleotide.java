public class DNAMaxNucleotide {
    public String max(String[] strands, String nuc) {

        int LengthCounter = 0;
        String answer = "";

        for (int n = 0; n < strands.length; n++) {
            int NucCounter = 0;
            String sequence = strands[n];
            for (int i = 0; i < sequence.length(); i++) {
                char c = sequence.charAt(i);
                if ((c + "").equals(nuc)) {
                    NucCounter++;
                }
            }

            if (NucCounter > LengthCounter || (NucCounter == LengthCounter && sequence.length() > answer.length())) {
                LengthCounter = NucCounter;
                answer = sequence;
            }
        }

        if (LengthCounter == 0) {
            return "";
        }
        return answer;
    }
}

