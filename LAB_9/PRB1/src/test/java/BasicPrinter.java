public class BasicPrinter implements IAbstractPrinter{
    @Override
    public void print(Document document) {
        System.out.println("I can print"+ document.text);
    }
}
