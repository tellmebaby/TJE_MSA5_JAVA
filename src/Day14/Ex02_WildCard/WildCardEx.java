package Day14.Ex02_WildCard;

public class WildCardEx {

	// ? (와일드 카드)
	// : 알 수 없는 타입을 대체하기 위해서 사용하는 기호
	
	// 일반 과정
	public static void checkCourse(Course<?> course) {
		System.out.println("과정명 : " + course.getName());
		Object[] studentList = course.getStudents();
		for (Object student : studentList) {
			System.out.println(student);
		}
		System.out.println();
	}

	// 직장인 과정
	public static void checkWorkerCourse(Course<? super Worker> course) {
		System.out.println("과정명 : " + course.getName());
		Object[] studentList = course.getStudents();
		for (Object student : studentList) {
			System.out.println(student);
		}
		System.out.println();
	}
	
	// 학생 과정
	public static void checkStudentCourse(Course<? extends Student> course) {
		System.out.println("과정명 : " + course.getName());
		Object[] studentList = course.getStudents();
		for (Object student : studentList) {
			System.out.println(student);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// 일반 과정, 정원 5명
		Course<Person> personCourse = new Course<>("일반과정", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		personCourse.add(new MiddleStudent("중학생"));
		checkCourse(personCourse);

		// 직장인 과정, 정원 5명
		Course<Worker> worKerCourse = new Course<>("직장인과정", 5);
		// worKerCourse.add( new Person("일반인") );
		worKerCourse.add(new Worker("직장인"));
		// worKerCourse.add( new Student("학생") );
		// worKerCourse.add( new HighStudent("고등학생") );
		// worKerCourse.add( new MiddleStudent("중학생") );
		
		checkCourse(worKerCourse);
		checkWorkerCourse(worKerCourse);
		checkWorkerCourse(personCourse);
		
		// 학생 과정, 정원 5명
		// 일반 과정, 정원 5명
		Course<Student> studentCourse = new Course<>("학생과정", 5);
		//studentCourse.add(new Person("일반인"));
		//studentCourse.add(new Worker("직장인"));
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));
		studentCourse.add(new MiddleStudent("중학생"));
		
		// 중학생 과정
		Course<MiddleStudent> middleStudentCourse = new Course<>("중학생과정", 5);	
		// 고등학생 과정
		Course<HighStudent> highStudentCourse = new Course<>("고등학생과정", 5);
		
		
		//checkStudentCourse(personCourse);
		//checkStudentCourse(worKerCourse);
		checkStudentCourse(middleStudentCourse);
		checkStudentCourse(highStudentCourse);
		checkStudentCourse(studentCourse);
		
		
	}
}




