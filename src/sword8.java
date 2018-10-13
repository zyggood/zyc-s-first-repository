public class sword8 {
    public int JumpFloor(int target) {
        if(target == 1) return 1;
        else if (target ==2) return 2 ;
//        else return JumpFloor(target-1)+JumpFloor(target-2);
        int kindsn2 =1;
        int kindsn1 =2;
        int kinds = 3;

            for (int i = 3; i <=target; i++) {
                kinds =kindsn1+kindsn2;
                kindsn2 = kindsn1;
                kindsn1 = kinds;
                
            }
            return kinds;

    }

}
