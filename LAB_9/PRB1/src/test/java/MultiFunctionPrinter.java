public class MultiFunctionPrinter implements IScanner,IAbstractPrinter,IFaxService{


    public void print(Document document) {
        System.out.println("I can print "+ document.text);
    }


    public void fax(Document document) {
        System.out.println("I can fax "+document.text);
    }


    public Document scan(Document document) {
        return document;
    }
}
