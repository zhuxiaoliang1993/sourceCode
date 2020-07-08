package com.ynet.lombokex;

import lombok.Cleanup;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileCleanUp {
    public static void main(String[] args) throws IOException {
/*        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream("");
            fileOutputStream = new FileOutputStream("");
            byte[] b = new byte[1000];
            while (true){
                int read = fileInputStream.read(b);
                if(read == -1)break;
                fileOutputStream.write(b,0,read);
            }
        } finally {
          if(fileOutputStream != null){
              fileOutputStream.close();
          }
          if(fileInputStream != null){
              fileInputStream.close();
          }
        }*/
        @Cleanup FileInputStream fileInputStream = new FileInputStream("");
        @Cleanup FileOutputStream fileOutputStream = new FileOutputStream("");
        byte[] b = new byte[1000];
        while (true){
            int read = fileInputStream.read(b);
            if(read == -1)break;
            fileOutputStream.write(b,0,read);
        }
    }
}
