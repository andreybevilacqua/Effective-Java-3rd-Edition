package com.abevilacqua.item9_preferTryWithResources;

import java.io.*;

public class FileReader {

  private static final int BUFFER_SIZE = 16;

  // try-with-resources - the best way to close resources
  static String firstLineOfFile(String path) throws IOException {
    try (BufferedReader br = new BufferedReader(new java.io.FileReader(path))) {
      return br.readLine();
    }
  }

  // try-with-resources with multiple resources
  static void copy(String src, String dst) throws IOException {
    try(InputStream in = new FileInputStream(src);
        OutputStream out = new FileOutputStream(dst) ) {
      byte[] buf = new byte[BUFFER_SIZE];
      int n;
      while((n = in.read(buf)) > 0) {
        out.write(buf, 0, n);
      }
    }
  }
}
