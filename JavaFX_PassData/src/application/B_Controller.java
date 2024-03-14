package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class B_Controller {
	
	@FXML
	TextField tInput;
	public void toB(ActionEvent event) throws Exception{
		Main.setRoot("A");
	}

	
	// 전달받은 데이터 텍스트 필드에 출력하기
	public void showData(String data) {
		tInput.setText(data);
	}
}
