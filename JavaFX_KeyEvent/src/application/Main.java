package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
			Scene scene = new Scene(root);
			
			// 키 이벤트 등록
			setEvent( scene, root);
			
			stage.setScene(scene);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	// 키보드 도형을 이동시키는 이벤트 정의
	public void setEvent(Scene scene, Parent root) {
		Circle circle = (Circle) root.lookup("#circle");
		if (circle != null) {
			// 원이 존재하는 경우
			System.out.println("원의 반지름: " + circle.getRadius() );
		}else {
			// 원이 존재하지 않는 경우
			System.out.println("원을 찾을 수 없습니다.");
			return;	// 원 객체 없으면, 메소드 종료
		}
		// 키 입력 이벤트 등록
		scene.setOnKeyPressed( event -> {
			double x = circle.getCenterX();		// 원의 중심 x좌표
			double y = circle.getCenterY();		// 원의 중심 y좌표
			switch (event.getCode()) {			// event.getCode() : 입력한 키의 코드 값
			case UP:
				System.out.println("UP");		// 방향키 위쪽
				circle.setCenterY(y-=20);
				break;
			case DOWN:
				System.out.println("DOWN");		// 방향키 아래쪽
				circle.setCenterY(y+=20);
				break;
			case LEFT:
				System.out.println("LEFT");		// 방향키 왼쪽
				circle.setCenterX(x-=20);
				break;
			case RIGHT:
				System.out.println("RIGHT");	// 방향키 오른쪽
				circle.setCenterX(x+=20);
				break;
			}
		});
	}
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
