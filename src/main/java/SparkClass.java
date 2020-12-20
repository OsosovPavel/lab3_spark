package ru.Pavel;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.broadcast.Broadcast;
import scala.Tuple2;
import java.util.Map;




public class SparkClass {


    private static final String SEPARATIONFORDELAYS = ",";
    private static final String SEPARATIONFORNAME = "\",";
    private static final int NAMEAIRPORT = 1;
    private static final int DESTINATIONAIRPORT = 0;
    private static final int FIRSTAIRPORTID = 11;
    private static final int CANCELLED = 19;
    private static final String CLEARSTR="";
    private static final float ZERO=0.0F;

    private static float checkClear(String current){
        if (current.equals(CLEARSTR)){
            return ZERO;
        }
        else{
            return Float.parseFloat(current);
        }
    }

    public static void main(String[] args){
        SparkConf conf = new SparkConf().setAppName("lab3_spark");
        JavaSparkContext sc = new JavaSparkContext(conf);

        JavaRDD<String> distOfAirportDelays = sc.textFile("664600583_T_ONTIME_sample.csv");
        JavaRDD<String> distOfAirportName = sc.textFile("L_AIRPORT_ID.csv");dwl'/'


























    }








}
