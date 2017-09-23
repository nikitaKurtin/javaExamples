package gang_of_four.structural.facade;

public class FacadeTest {
    public static void main(String[] args) {

        MyFileWriterReader writerReader = new MyFileWriterReader("src/gang_of_four/structural/facade/data.txt");

        //write from start (override)
        writerReader.writeFile("I'm new data in file");

        //subscribe to file
        writerReader.appendToFile("hello");

        String data = writerReader.readFile();
        System.out.println(data);
    }
}
