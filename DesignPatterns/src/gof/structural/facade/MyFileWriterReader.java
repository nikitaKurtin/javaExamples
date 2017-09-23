package gof.structural.facade;

import java.io.*;

class MyFileWriterReader {
    private String path;

    MyFileWriterReader(String path) {
        this.path = path;
    }

    String readFile() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path)))) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }

            return sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return "error";
        }
    }

    void writeFile(String text) {
        writeBytes(text, false);
    }

    void appendToFile(String text) {
        writeBytes(text, true);
    }

    private void writeBytes(String text, boolean appending) {
        try (FileOutputStream fos = new FileOutputStream(path, appending)) {
            fos.write((text + "\n").getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
