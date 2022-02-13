package com.study.mr.wd;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.Iterator;

public class WDReduce extends Reducer<Text, LongWritable, Text, LongWritable> {

    @Override
    protected void reduce(Text key, Iterable<LongWritable> values, Context context) throws IOException, InterruptedException {
        Iterator<LongWritable> iterator = values.iterator();
        long count = 0L;
        while (iterator.hasNext()) {
            iterator.next();
            count ++;
        }
        context.write(key,new LongWritable(count));
    }
}
