import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        File fileIn1 = new File("file.txt");
        ArrayList<String> list = new ArrayList<>();
        try (BufferedReader bf = new BufferedReader(new FileReader(fileIn1))){
            String readLine;
            int line = 0;
            while ((readLine = bf.readLine()) != null) {
                if (line % 2 == 0) {
                    list.add(readLine);
                }
                line++;
            }
            for(int i =0; i<list.size(); i++){
                System.out.println(list.get(i));
            }
        }
    }
}
