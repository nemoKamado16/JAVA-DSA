public class fithProgram {
    public static void main(String[] args) {
        String name = "nishant";
        int len = name.length();
        for (int pos = 0; pos < len; pos++) {
            char ch = name.charAt(pos);
            if (ch == 'a' || ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                System.out.println("hi I m vowel:\t"+ch);
            }
            else {
                System.out.println("hi I m Consonent:\t"+ch);
            }
        }
    }
}
