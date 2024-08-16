package TicTacToe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int size;
    private List<List<Cell>> grid;

    public Board(int dimension){
        this.size = dimension;
        this.grid = new ArrayList<>();
        for(int i = 0; i < dimension; i++){
            grid.add(new ArrayList<>());
            for(int j = 0; j < dimension; j++){
                grid.get(i).add(new Cell(i , j));
            }
        }
    }

    public List<List<Cell>> getGrid() {
        return grid;
    }

    public Cell getCell(int i, int j){
        return grid.get(i).get(j);
    }

    public void setGrid(List<List<Cell>> grid) {
        this.grid = grid;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void display(){
        for(List<Cell> row:grid){
            for(Cell cell:row){
                cell.display();
            }
            System.out.println();
        }
    }
}
