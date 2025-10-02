public class EjecutarBuilder{

    public static void main(string[] args){
        converter objC1 = new ASCIIConverter();
        converter objC2 = new PostScriptConverter();
        converter objC3 = new PDFConverter();


        Reader objR1 = new Reader(element:"LINE", objC1);
        Reader objR2 = new Reader(element:"LINE", objC2);
        Reader objR3 = new Reader(element:"TABLE", objC3);

        objR1.parseInput();
        objR2.parseInput();
        objR3.parseInput();
    }
}