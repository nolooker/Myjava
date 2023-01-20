package ch12_stream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileSave {
    public static void main(String[] args) {
        String pathname = System.getProperty("user.dir") + "\\src\\data\\" ;
        String fileTxt = pathname + "file.txt" ; // 파일 목록을 저장할 파일
        String folderTxt = pathname + "folder.txt" ; // 폴더 목록을 저장할 파일
        String hiddenTxt = pathname + "hidden.txt" ;

        String win_folder = "c:\\windows\\" ;
        File target = new File(win_folder) ;

        File[] filelist = target.listFiles() ;
        System.out.println("목록 개수 : " + filelist.length);
        
        BufferedWriter bw1 = null ; // File을 위한 Writer 객체
        BufferedWriter bw2 = null ; // Folder를 위한 Writer 객체
        BufferedWriter bw3 = null ; // hidden 항목를 위한 Writer 객체

        try{
            bw1 = new BufferedWriter(new FileWriter(new File(fileTxt))) ;
            bw2 = new BufferedWriter(new FileWriter(new File(folderTxt))) ;
            bw3 = new BufferedWriter(new FileWriter(new File(hiddenTxt))) ;

            for (int i = 0; i < filelist.length; i++) {
                if(filelist[i].isHidden()){
                    bw3.write(filelist[i].toString().toLowerCase());
                    bw3.newLine();
                }

                if(filelist[i].isFile()){ // 파일
                    bw1.write(filelist[i].toString());
                    bw1.newLine();

                    if(filelist[i].getName().toLowerCase().endsWith(".log")){
                    }

                }else{ // 폴더
                    bw2.write(filelist[i].toString().toUpperCase());
                    bw2.newLine();
                }
            }
            System.out.println("파일 작성 완료");

        }catch (IOException e){
            System.out.println("파일 입출력 예외 발생");
            e.printStackTrace();

        }finally {
            try {
                if(bw1 != null){bw1.close();}
                if(bw2 != null){bw2.close();}
                if(bw3 != null){bw3.close();}
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}