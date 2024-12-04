public class firstProgram {
    //  Data, constant, etc
    
    public static void main(String[] args) {
        int a = 25;
        long x =38;
        short y = 798;
        short z = (short)327671;    //! Force full conversion ~ TYPE CASTING {EXPLICITLY}
        float f = 98.9F;
        float F = 54.6f;
        int first = 32;
        int second = 045;
        int third = 0b0101;
        int fourth = 0X17AB;
        
        // System.out.println(first);
        // System.out.println(second);
        // System.out.println(third);
        // System.out.println(fourth);

        // char ch = 'a';
        // char ch1 = 062; // 2
        // char ch2 = 62;  // >
        // char ch3 = 0x12A; // ?

        char ch1 = '\u004E';
        char ch2 = '\u0049';
        char ch3 = '\u0053';
        char ch4 = '\u0048';
        char ch5 = '\u0041';
        char ch6 = '\u004E';
        char ch7 = '\u0054';

        System.out.println(""+ch1+ch2+ch3+ch4+ch5+ch6+ch7);
    }
}
