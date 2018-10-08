package com.blueasdfg;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.net.URI;
import java.net.URISyntaxException;


/**
 * Hello world!
 */
public class App {
     public static void main(String[] args) throws Exception {


          Configuration conf = new Configuration();
          conf.set("fs.defaultFS","hdfs://localhost:9000");

          FileSystem fs = null;
          fs = FileSystem.get(conf);

          fs.mkdirs(new Path("/test2"));


     }
}

