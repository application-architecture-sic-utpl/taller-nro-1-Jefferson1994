package ec.edu.utpl.sic.arqapl.metrics;


import org.apache.commons.text.similarity.JaroWinklerDistance;

public class JaroDistancia implements Similaritable{
    @Override
    public double similarity(String text1, String text2) {
        var jarodis=new JaroWinklerDistance();
        var similarity=jarodis.apply(text1,text2);

        return similarity;
    }
}