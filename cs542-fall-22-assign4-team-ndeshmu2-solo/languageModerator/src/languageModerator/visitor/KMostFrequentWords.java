package languageModerator.visitor;

import languageModerator.getMembers.Members;
import languageModerator.getMembers.MyMembers;
import languageModerator.outputs.KMostFrequentWordsStoring;
import languageModerator.outputs.Outputs;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class KMostFrequentWords implements Visitor{

    int c1;
    List<String> res;
    Outputs wordsResults;
    //int [] a = new int[300];
    Map<String, Integer> ans = new HashMap<>();
    ArrayList<String> a1 = new ArrayList<>();
    private final class KWords{
        int rate;
        String w;
        public KWords(String getW, int getR){
            this.w = getW;
            this.rate = getR;
        }
    }

    private final class Input{
        int r1;
        public Input(int r2){
            this.r1 = r2;
        }
        
    }



    public KMostFrequentWords(String s1, Outputs wordsIn){
        c1 = Integer.parseInt(s1);
        wordsResults = wordsIn;

    }

    public void check(Members members){
        res = getTopKWords(members);
        
        ((KMostFrequentWordsStoring)wordsResults).storeStr(res);
    }

    private String[] fetchwords(Members members){
        String[] s2 = ((MyMembers)members).getaLine().split("\\s+");
        return s2;
    }

    public List<String> getTopKWords(Members members){
        String[] s3 = fetchwords(members);

        res = new ArrayList<>();
        Map<String, Integer> i = new HashMap<>();

        
        for(String ch: s3){
            i.put(ch, i.getOrDefault(ch, 0)+1);
        }

        //System.out.println(i);

        PriorityQueue<KWords> queue = new PriorityQueue<>(new Comparator<KWords>(){

            public int compare (KWords t1, KWords t2){
                if(t1.rate == t2.rate){
                    return t2.w.compareTo(t1.w);
                }
                else{
                    return t1.rate - t2.rate;
                }
            }

        });

        for (String p1 : i.keySet()){
            queue.add(new KWords(p1, i.get(p1)));
            
            // while(!queue.isEmpty()){
            //     System.out.println(queue.remove());
            // }
            if(queue.size() > c1){
                queue.poll();
            }
            // while(!queue.isEmpty()){
            //     System.out.println(queue.remove());
        }

        while(!queue.isEmpty()){
            String s5 = queue.poll().w;
            res.add(0, s5 + ":" + i.get(s5));
        }
            //res.add(0, queue.poll().w + "=" + (i.get(queue.poll().w)));
        return res;
    }

}