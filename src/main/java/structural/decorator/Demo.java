package structural.decorator;

import structural.decorator.decorators.*;

public class Demo {
    public static void main(String[] args) {
        String path = "src/main/java/structural/decorator/out/OutputDemo.txt";
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource(path)));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource(path);

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}