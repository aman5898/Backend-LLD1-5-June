
public class ColumnWinningStrategy implements WinningStrategy {
    HashMap<Integer, HashMap<Symbol, Integer>> counts = new HashMap<>();
    @Override
    public boolean checkWinner(Board board , Move move) {

        int c = move.getCell().getCol();
        Symbol symbol = move.getCell().getSymbol();

        if(!counts.containsKey(c)){
            counts.put(c, new HashMap<>());
        }

        HashMap<Symbol, Integer> countCol = counts.get(c);

        if(!countCol.containsKey(symbol)){
            countCol.put(symbol, 0);
        }
        countCol.put(symbol, countCol.get(symbol) + 1);

        return  countCol.get(symbol) == board.getSize();
    }
}
