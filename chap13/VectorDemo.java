package chap13;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        List<Board> boards = new Vector<>(); // 멀티스레드를 허용하지 않음.

        boards.add(new Board("제목 1", "내용 1", "글쓴이 1"));
        boards.add(new Board("제목 2", "내용 2", "글쓴이 2"));
        boards.add(new Board("제목 3", "내용 3", "글쓴이 3"));
        boards.add(new Board("제목 4", "내용 4", "글쓴이 4"));
        boards.add(new Board("제목 5", "내용 5", "글쓴이 5"));
        boards.add(new Board("제목 6", "내용 6", "글쓴이 6"));

        boards.remove(2);
        boards.remove(1);

        for (Board board : boards) {
            System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());
        }
    }
}
