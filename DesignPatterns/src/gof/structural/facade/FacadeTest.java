package gof.structural.facade;

public class FacadeTest {
    public static void main(String[] args) {

        MyFileWriterReader writerReader = new MyFileWriterReader("src/gof/structural/facade/data.txt");

        //write from start (override)
        writerReader.writeFile("I'm new data in file");

        //subscribe to file
        writerReader.appendToFile("hello");

        String data = writerReader.readFile();
        System.out.println(data);
    }
}
