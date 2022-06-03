import java.util.ArrayList;
import java.util.List;

public class SILab2 {

    public static List<String> function(List<String> list) {
        if (list.size() <= 0) {         //A
            throw new IllegalArgumentException("List length should be greater than 0");     //B
        }
        int n = list.size();    //C
        int rootOfN = (int) Math.sqrt(n);   //C
        if (rootOfN * rootOfN  != n) {      //C
            throw new IllegalArgumentException("List length should be a perfect square");   //D
        }
        List<String> numMines = new ArrayList<>();      //E
        for (int i = 0; i < n; i++) {       //F     //G     //H
            if (!list.get(i).equals("#")) {     //I
                int num = 0;            //J
                if ( (i % rootOfN != 0 && list.get(i - 1).equals("#")) || (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#")) ) {   //J
                    if ( (i % rootOfN != 0 && list.get(i - 1).equals("#")) && (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#")) ){    //K
                        num += 2;   //L
                    }
                    else {  //M
                        num  += 1;  //M
                    }
                }
                if (i - rootOfN >= 0 && list.get(i - rootOfN).equals("#")){     //N
                    num++;      //O
                }
                if (i + rootOfN < n && list.get(i + rootOfN).equals("#")){      //P
                    num++;      //Q
                }
                numMines.add(String.valueOf(num));      //R
            }
            else {      //S
                numMines.add(list.get(i));      //S
            }
        }
        return numMines;    //T
    }
}
