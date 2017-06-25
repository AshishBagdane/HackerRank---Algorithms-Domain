package algorithms.implementation.medium;

import java.util.Scanner;

public class TheTimeInWords {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte H = sc.nextByte();
        byte M = sc.nextByte();
        System.out.println(getTimeInWords(H, M));
        sc.close();
    }
    
    static String getTimeInWords(byte H, byte M) {
        String timeInWords = new String();
        String[] hours = "Hours one two three four five six seven eight nine ten eleven twelve".split(" ");
        String[] minutes = "minutes one two three four five six seven eight nine ten eleven twelve thirteen fourteen quarter sixteen seventeen eighteen nineteen twenty".split(" ");
        
        if(M==0) {
            timeInWords = hours[H] + " o' clock";
        }else{
            if(M>30) {
                timeInWords += (M==45) ? minutes[60-M] : (60-M>20) ? minutes[20] + " " + minutes[10-M%10] + " " + minutes[0] : minutes[60-M] + " " + minutes[0];
                timeInWords = timeInWords + " to " + hours[H%12+1];
            }else{
                timeInWords += (M==30) ? "half" : (M==15) ? minutes[M] : (M>20) ? minutes[20] + " " + minutes[M%10] + " " + minutes[0] : minutes[M] + " " + minutes[0];
                timeInWords = timeInWords + " past " + hours[H];
            }
        }
        
        return timeInWords;
    }
}
