package algorithms.implementation.easy;

import java.util.Scanner;

public class ACMICPCTeam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextInt();
        String[] num = new String[n];
        
        sc.nextLine();
        
        for(int i=0;i<n;i++) {
            num[i] = sc.next();
        }

        sc.close();
        
        int max = Integer.MIN_VALUE;
        int maxTopicTeamCount = 0;
        
        for(int i=0;i<n-1;i++) {
            for(int j=i+1;j<n;j++) {
                int result = countSetBits(num[i], num[j]);
                if(result>max) {
                    max = result;
                    maxTopicTeamCount = 1;
                }else if(result==max){
                    maxTopicTeamCount++;
                }
            }
        }
        
        System.out.println(max);
        System.out.println(maxTopicTeamCount);
    }
    
    static int countSetBits(String memberOne, String memberTwo)
    {
        int count = 0;
        for(int i=0;i<memberOne.length();i++) {
            if(memberOne.charAt(i)=='1' || memberTwo.charAt(i)=='1') {
                count++;
            }
        }
        return count;
    }
}
