package spendslap;


// import java.util.ArrayList;
// import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class spendslapper {
    
    public static void main(String[] args){
        function func = new function();
        Map<String,Integer> spends = new HashMap<>();

        func.productinput(spends);
        //func.PrintProduct(spends);
        func.slapper(spends);
}
}
