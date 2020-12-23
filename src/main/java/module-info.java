module ymiki77.ocr.pdf {
    requires javafx.controls;
    requires javafx.fxml;

    opens ymiki77.ocr.pdf to javafx.fxml;
    exports ymiki77.ocr.pdf;
}
