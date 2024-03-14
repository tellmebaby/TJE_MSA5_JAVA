// module-info.java
module JavaFxTest {
	requires javafx.controls;
	requires javafx.fxml;			// 추가
	
	opens application to javafx.graphics, javafx.fxml;
}