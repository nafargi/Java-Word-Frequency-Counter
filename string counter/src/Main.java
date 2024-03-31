public class Main {
    public static void main(String[] args) {
        String textHolder="  of conflicts requires understanding and compromise. " +
                "Compromise is essential for maintaining harmony in any relationship. Relationship " +
              "between the fox and the The quick brown fox jumps over the lazy dog. The dog barks loudly " +
            " as the fox approaches. A quick decision must be made to avoid a confrontation. " +
               " Confrontation between from both parties involved. Involved parties must communicate " +
             "effectively to ensure mutual understanding and respectthe two animals is inevitable if they cannot find a peaceful" +
                "  resolution. Resolutiondog is complex but not impossible to manage. Manage your" +
                " expectations and remain patient throughout the process. Process of building trust " +
                "   takes time and effort .\n";

        String[] textStringArray=textHolder.toLowerCase().split("\\s+");
        int lenString= textStringArray.length;

        for(int i=0; i < lenString ;i++){
            int counter=0;
            for(int j=0; j < lenString; j++) {
                if (textStringArray[i] .equals(textStringArray[j]) ) {
                    counter++;
                }
            }
             if(counter>3)
                System.out.println("The Frequency of  '"+textStringArray[i]+ "' is "+ counter+ "times");

        }

}
}