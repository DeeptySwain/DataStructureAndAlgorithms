package String;

public class ANumberAfterADoubleReversalLeetCode2119 {
    public static void main(String[] args){
        int x = 00;
        ANumberAfterADoubleReversalLeetCode2119 ana = new ANumberAfterADoubleReversalLeetCode2119();
        System.out.println(ana.isSameAfterReversals1(x));
    }
    public boolean isSameAfterReversals(int num) {
        String s = String.valueOf(num); // Integer.toString(num) also can be used to convert String to int
       // int lastValue = Integer.parseInt(s.valueOf(s.charAt(s.length()-1)));
        int lastValue = s.charAt(s.length()-1);
        System.out.println(1%10);
        if(s.length() == 1 || lastValue !=48){ // 0's ASCII value: 48
            return true;
        }
        return false;
    }

    /**
     * without converting, better answer:
     */

    public boolean isSameAfterReversals1(int num) {
//        if(num == 0 || num %10 !=0){ // 0's ASCII value: 48
//            return true;
//        }
        return num == 0 || num %10 !=0;
    }
}
