package com.study.mr.wd;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class WDMapper extends Mapper<LongWritable, Text,Text,LongWritable> {

    private static LongWritable one = new LongWritable(1);


    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        context.write(value,one);
    }
}
