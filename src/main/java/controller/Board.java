package controller;

import view.BoardIO;

public class Board {

    PostController postController = new PostController();
    BoardIO boardIO = new BoardIO();
    public void run() {

        while(true) {
            String func = boardIO.getFunc();

            if (func.equals("exit")) break;
            else if (func.equals("add")) postController.add();
            else if (func.equals("list")) postController.list();
            else if (func.equals("update")) postController.update();
            else if (func.equals("delete")) postController.delete();
            else if (func.equals("detail")) postController.detail();

        }

    }
}
