package collection.list;

import java.util.List;
import java.util.Vector;

public class BoardTest {

	public static void main(String[] args) {
		//Array List 또는 Vector 사용
		//List<Board> List = new ArrayList<>(); 
		List<Board> list = new Vector<>(); 
		
		//Board 객체
		Board board1 = new Board("제목1", "내용 1입니다.", "글쓴이1");
		Board board2 = new Board("제목2", "내용 2입니다.", "글쓴이3");
		Board board3 = new Board("제목3", "내용 3입니다.", "글쓴이3");
		
		//Board 객체를 Vector 리스트에 저장
		list.add(board1); //0번 인덱스
		list.add(board2);
		list.add(board3);
		
		//게시글 1개 삭제 (1번인덱스)
		if(list.contains(board2)) { //객체(object)로 삭제
			list.remove(board2);
		}
		
		//맨 앞에있는 객체를 가져오기 (0번 인덱스)
		System.out.println("title: " + list.get(0).getTitle());
		System.out.println("content: " + list.get(0).getContent());
		System.out.println("writer: " + list.get(0).getWriter());
		
		//전체 출력
		for(int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.getTitle() + ", " + 
			board.getContent() + ", " + board.getWriter());
		}
	}

}
