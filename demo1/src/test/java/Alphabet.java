public class Alphabet {
private static boolean isVowel(int c){
    return c=='a'
            || c == 'e'
            || c == 'i'
            || c == 'o'
            || c == 'u';
}
    public static int countVouels(String a){
        return (int) a.toLowerCase().chars().filter(Alphabet::isVowel).count();
    }
}

