package ec.edu.utpl.sic.arqapl;


import ec.edu.utpl.sic.arqapl.metrics.Cosine;
import ec.edu.utpl.sic.arqapl.metrics.Jaccard;
import org.apache.commons.text.similarity.JaroWinklerDistance;



public class Manejador {




    public static TweetSimilarity defineAlgo(String name){
        TweetSimilarity tw= null;
        switch (name){
            case "cosine":
                tw= new TweetSimilarity(new Cosine());
                break;
            case "jaccard":
                tw= new TweetSimilarity(new Jaccard());
                break;
            case "jarowinkel":
                tw= new TweetSimilarity((new JaroWinkelDistance()));
                break;
            case "default" :


        }
        return tw;
    }



}
