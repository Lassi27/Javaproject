public class Runner {
    //your main containing tests and output
    public static void main(String[] args) {
        System.out.println(helloName("Lassi"));
        System.out.println(icyHot(100,12));
        System.out.println(countXX("abxx"));
        System.out.println(makeOutWord("<<>>", "milk") );
        int[] h = {2,3,4,5,2};
        int[] b= {2,5,5,2};
        System.out.println(commonEnd(h,b));
        System.out.println(cigarParty(50, true));
        System.out.println(noTeenSum(13, 17,14));
        System.out.println(catDog("catdog") );
        int [] c = {1,7,1,7};
        System.out.println(has77(c));
    }
   
    public static String  helloName(String name) {
        return "hi " + name;
    }

    public static boolean icyHot(int Temp1, int Temp2){
        if(( Temp1 > 100) && (Temp2 < 0)){
            return true;
        }
        if(( Temp2 > 100) && (Temp1 < 0)){
            return true;
        }
        return false;
    }

    public static int countXX(String str){
        int count = 0;
        for(int i = 0; i< str.length()-1; i++){
            if(str.substring(i, i+2).equals("xx") ) {
                count++;
            }
        }
        return count;
    }

    public static String makeOutWord(String out, String word){
        String firstWord= out.substring(0,2) ;
                String lastWord=  out.substring(2,4);
                String output= firstWord + word;
                output= output + lastWord;
                return output;
    }

    public static boolean commonEnd(int[] a, int[] b){
        if((a[0] == b[0]) || (a[a.length-1] == b[b.length-1] )){
            return true;
        }
        return false;
    }

    public static boolean cigarParty(int cigars, boolean isWeekend){
        if( isWeekend == false ){
            if((cigars >= 40) && (cigars <= 60)){
                return true;
            }
            return false;
        }
        if(isWeekend == true){
            if(cigars < 40){
                return false;
            }
            return true;
        }
        return false;
    }

    public static int noTeenSum(int a, int b, int c){
        int A= fixTeen(a);
        int B = fixTeen(b);
        int C = fixTeen(c);
        int total= A+B+C;
        return total;
    }
    public static int fixTeen(int n){
        if((n >= 13) && (n <=19)){
            if(n == 15 || n == 16){
                return n;
            }
            n = 0;
        }
       return n;
    }

    public static boolean catDog(String str){
        int numC= 0;
        int numD=0;
        for(int i = 0; i < str.length()-2; i++){
            if((str.substring(i).equals("c")) && (str.substring(i+1).equals("a")) &&(str.substring(i+2).equals("t"))){
                numC= numC + 1;
            }
            if((str.substring(i).equals("d")) && (str.substring(i+1).equals("o")) && (str.substring(i+2).equals("g"))){
                numD= numD + 1;
            }
            if( numC == numD){
                return true;
            }
        }
        return false;
    }

    public static boolean has77(int[] nums){
        for(int i= 0; i< nums.length-2; i++){
            if ((nums[i] == 7) && (nums[i+2]) == 7){
                return true;
            }
        }
        for(int i= 0; i< nums.length-1; i++){
            if((nums[i] == 7) && (nums[i+1] == 7)){
                return true;
            }
        }
        return false;
    }

    public static int maxSpan(int[] num){
        for(int i=0; i<num.length -1; i++){
            return num(i+1,num.length-1);
        }
    }
}
