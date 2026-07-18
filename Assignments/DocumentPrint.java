class Document {
    void print() {
        System.out.println("Printing a document");
    }
}

class PDFDocument extends Document {
    void print() {
        System.out.println("Printing PDF document");
    }
}

class WordDocument extends Document {
    void print() {
        System.out.println("Printing Word document");
    }
}

class TextDocument extends Document {
    void print() {
        System.out.println("Printing Text document");
    }
}

public class DocumentPrint {
    public static void main(String[] args) {
        Document d;

        d = new PDFDocument();
        d.print();

        d = new WordDocument();
        d.print();

        d = new TextDocument();
        d.print();
    }
}