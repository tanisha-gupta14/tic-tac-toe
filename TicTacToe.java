import java.util.Scanner;

public class TicTacToe{
    public static void main(String[] args) {
        char[][] gameboard= new char[3][3];
        for(int row=0;row<gameboard.length;row++)
        {
            for(int col=0;col<gameboard[row].length;col++)
            {
                gameboard[row][col]=' ';

            }
        }
        
        char player='X';
        boolean gameOver=false;
        int moves=0;
        Scanner sc=new Scanner(System.in);
        while(!gameOver){
            printBoard(gameboard);
            System.out.println("PLAYER "+ player+ " ENTER");
            int row=sc.nextInt();
            int col=sc.nextInt();
            if(gameboard[row][col]==' ')
            {
                //place the element
                gameboard[row][col]=player; //place the element
                gameOver=haveWon(gameboard,player);
                moves++;
                if(gameOver)
                System.out.println("Player"+ player+ "has won");
                else 
                player=(player=='X')?'O':'X';
            
            if (moves == 9 && !gameOver) {
                System.out.println("It's a tie!");
                break;
            }
           }
            else
             System.out.println("INVALID MOVE! TRY AGAIN");
            
        }
        printBoard(gameboard);
    }

    public static boolean haveWon(char[][] gameboard, char player)
    {
        //check row
        for(int row=0;row<gameboard.length;row++)
        {
            if(gameboard[row][0]==player&&gameboard[row][1]==player&&gameboard[row][2]==player)
            return true;
        }
        //check col
            for(int col=0;col<gameboard.length;col++)
        {
            if(gameboard[0][col]==player&&gameboard[1][col]==player&&gameboard[2][col]==player)
            return true;
        }
        // check diagonal
        if(gameboard[0][0]==player&&gameboard[1][1]==player&&gameboard[2][2]==player)
        return true;
        if(gameboard[0][2]==player&&gameboard[1][1]==player&&gameboard[2][0]==player)
        return true;
        
        return false;


        

    }

    public static void printBoard(char gameboard[][]){
 for(int row=0;row<gameboard.length;row++)
        {
            for(int col=0;col<gameboard[row].length;col++)
            {
                System.out.print(gameboard[row][col]+ " | ");
            }
            System.out.println();
        }

    }
}
